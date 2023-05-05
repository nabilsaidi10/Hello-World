/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.persistence;

import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import de.destatis.ubreg.template.domain.model.stammdaten.Stammdaten;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenFactory;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import org.springframework.stereotype.Component;

/**
 * The JpaMeldungFactory.
 *
 * @author cosma
 */
@Component
public class JpaStammdatenFactory implements StammdatenFactory {

	@Override
	public Stammdaten createStammdaten(StammdatenId stammdatenId, QuellregisterId quellregisterId) {
		return new JpaStammdaten(stammdatenId, quellregisterId);
	}
}
