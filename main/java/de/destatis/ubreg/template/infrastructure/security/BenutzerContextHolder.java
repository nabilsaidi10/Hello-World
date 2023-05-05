/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.security;

import de.destatis.ubreg.template.domain.model.benutzer.Benutzer;
import de.destatis.ubreg.template.domain.model.benutzer.BenutzerContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * BenutzerContextHolder that intercepts methods annotated with BenutzerContext
 * to set the current Benutzer for the current thread.
 *
 * @author cosma
 */
@Aspect
@Component
public class BenutzerContextHolder {
	private static final ThreadLocal<Benutzer> threadLocalBenutzer = new ThreadLocal<>();

	@Around("@annotation(benutzerContext)")
	public Object benutzerContext(ProceedingJoinPoint joinPoint, BenutzerContext benutzerContext) throws Throwable {
		setBenutzer(new Benutzer(benutzerContext.value()));

		try {
			return joinPoint.proceed();
		} finally {
			clearBenutzer();
		}
	}

	public void clearBenutzer() {
		threadLocalBenutzer.remove();
	}

	public Benutzer getBenutzer() {
		Benutzer benutzer = threadLocalBenutzer.get();
		return benutzer;
	}

	public void setBenutzer(Benutzer benutzer) {
		Assert.notNull(benutzer, "benutzer cannot be null");
		threadLocalBenutzer.set(benutzer);
	}
}
