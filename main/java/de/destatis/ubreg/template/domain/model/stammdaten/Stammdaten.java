/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.stammdaten;

import de.destatis.cosma.common.domain.model.DomainEntity;
import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import org.springframework.lang.NonNull;

/**
 * The Stammdaten aggregate.
 *
 * @author cosma
 */
public interface Stammdaten extends DomainEntity {

	public @NonNull StammdatenId stammdatenId();

	/**
	 * Return the quellregisterId.
	 *
	 * @return the quellregisterId
	 */
	public @NonNull QuellregisterId quellregisterId();
}
