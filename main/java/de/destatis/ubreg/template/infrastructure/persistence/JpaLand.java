/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.persistence;

import de.destatis.ubreg.template.domain.model.land.Land;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.springframework.lang.Nullable;

/**
 * The JpaLand converter.
 *
 * @author cosma
 */
@Converter(autoApply = true)
public class JpaLand implements AttributeConverter<Land, String> {
  @Override
  public @Nullable String convertToDatabaseColumn(@Nullable Land attribute) {
    return attribute != null ? attribute.schluessel() : null;
  }

  @Override
  public Land convertToEntityAttribute(@Nullable String dbData) {
    return dbData != null ? Land.ofSchluessel(dbData) : null;
  }
}
