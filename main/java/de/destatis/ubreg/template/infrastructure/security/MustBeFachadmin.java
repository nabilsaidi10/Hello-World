/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 * PreAuthorize für Fachadmin
 *
 * @author cosma
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize(
    value =
        "hasRole(T(de.destatis.mp.lafu.manuellebearbeitung.infrastructure.security.Rolle).FACHADMIN.toString())")
public @interface MustBeFachadmin {}
