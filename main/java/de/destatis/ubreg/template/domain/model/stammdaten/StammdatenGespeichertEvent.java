/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.stammdaten;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import de.destatis.cosma.common.domain.model.AbstractEvent;
import de.destatis.cosma.common.domain.model.DomainEvent;
import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

/**
 * The MeldungEingegangen event.
 *
 * @author cosma
 */
public class StammdatenGespeichertEvent extends AbstractEvent implements DomainEvent {

  @JsonProperty @JsonUnwrapped private StammdatenId stammdatenId;

  @JsonProperty @JsonUnwrapped private QuellregisterId quellregisterId;

  /** Construct. */
  protected StammdatenGespeichertEvent() {
    super();
  }

  /**
   * Construct.
   *
   * @param land the land
   * @param berichtszeitraum the berichtszeitraum
   * @param stammdatenId the meldungId
   * @param berichtseinheitId the berichtseinheitId
   * @param dublette the dublette is true, if the Meldung is dublette
   */
  public StammdatenGespeichertEvent(
      @NonNull StammdatenId stammdatenId, @NonNull QuellregisterId quellregisterId) {
    this();

    setStammdatenId(stammdatenId);
    setQuellregisterId(quellregisterId);
  }

  /**
   * Return the quellregisterId.
   *
   * @return the quellregisterId
   */
  public @NonNull QuellregisterId quellregisterId() {
    return quellregisterId;
  }

  private void setQuellregisterId(QuellregisterId quellregisterId) {
    Assert.notNull(quellregisterId, "quellregisterId must not be null.");

    this.quellregisterId = quellregisterId;
  }

  /**
   * Return the stammdatenId.
   *
   * @return the stammdatenId
   */
  public @NonNull StammdatenId stammdatenId() {
    return stammdatenId;
  }

  private void setStammdatenId(StammdatenId stammdatenId) {
    Assert.notNull(stammdatenId, "stammdatenId must not be null.");

    this.stammdatenId = stammdatenId;
  }
}
