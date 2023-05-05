/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.security;

import de.destatis.cosma.security.keycloak.config.WebSecurityConfigurerPlugin;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * The web access security configuration.
 *
 * @author cosma
 */
@Configuration
public class ManuelleBearbeitungSecurityConfig {
	@Value("${cosma.security.keycloak.url}")
	private String authServerUrl;

	@Value("${cosma.security.keycloak.realm}")
	private String realm;

	@Value("${cosma.security.keycloak.client-id}")
	private String client;

	@Value("${server.port}")
	private String port;

	@Value("${springdoc.swagger-ui.path}")
	private String swaggerUrl;

	@Bean
	OpenAPI customOpenAPI() {
		OAuthFlows flows = new OAuthFlows();
		OAuthFlow flow = new OAuthFlow();

		flow.setAuthorizationUrl(authServerUrl + "/realms/" + realm + "/protocol/openid-connect/auth");

		Scopes scopes = new Scopes();
		flow.setScopes(scopes);
		flows = flows.implicit(flow);

		return new OpenAPI()
				.components(new Components().addSecuritySchemes("keycloak",
						new SecurityScheme().type(SecurityScheme.Type.OAUTH2).flows(flows)))
				.info(new Info().title("OpenAPI definition").version("v0")
						.description("<a href='" + authServerUrl + "/realms/" + realm
								+ "/protocol/openid-connect/logout?redirect_uri=http://localhost:" + port + swaggerUrl
								+ "'>Abmelden</a>"))
				.addSecurityItem(new SecurityRequirement().addList("keycloak", Arrays.asList("read", "write")));
	}

	@Bean
	WebSecurityConfigurerPlugin WebSecurityConfigurerPlugin() {
		return new WebSecurityConfigurerPlugin() {
			@Override
			public void configure(HttpSecurity http) throws Exception {
				http.csrf().disable();
			}
		};
	}
}
