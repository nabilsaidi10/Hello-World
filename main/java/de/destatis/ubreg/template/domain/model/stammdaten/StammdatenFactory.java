/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.stammdaten;

import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import org.springframework.lang.NonNull;

/**
 * The MeldungFactory.
 *
 * @author cosma
 */
public interface StammdatenFactory {
  /**
   * Create a Meldung instance.
   *
   * @param stammdatenId the stammdatenId
   * @param quellregisterId the quellregisterId
   * @return the Meldung
   */
  public @NonNull Stammdaten createStammdaten(
      @NonNull StammdatenId stammdatenId, @NonNull QuellregisterId quellregisterId);
}
