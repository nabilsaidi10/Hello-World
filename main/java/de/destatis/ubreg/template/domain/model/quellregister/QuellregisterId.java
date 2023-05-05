/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.quellregister;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.destatis.cosma.common.domain.model.AbstractIdentity;
import java.io.Serializable;
import javax.persistence.Embeddable;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

/**
 * The BerichtseinheitId.
 *
 * @author cosma
 */
@Embeddable
public class QuellregisterId extends AbstractIdentity implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty private String quellregisterId;

  /** Construct. */
  protected QuellregisterId() {
    super();
  }

  /**
   * Construct.
   *
   * @param quellregisterId the quellregisterId
   */
  public QuellregisterId(@NonNull String quellregisterId) {
    this();

    setQuellregisterId(quellregisterId);
  }

  @Override
  public String identity() {
    return quellregisterId();
  }

  /**
   * Return the quellregisterId.
   *
   * @return the quellregisterId
   */
  public String quellregisterId() {
    return quellregisterId;
  }

  private void setQuellregisterId(String quellregisterId) {
    Assert.hasLength(quellregisterId, "quellregisterId must not be null or empty.");

    this.quellregisterId = quellregisterId;
  }
}
