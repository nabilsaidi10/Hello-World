/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.benutzer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotational interface to set Benutzer for the current context.
 *
 * @author cosma
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface BenutzerContext {
	String value();
}
