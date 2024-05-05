package com.example.associacao_potira.infraestructure.converters;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.Duration;
@Converter(autoApply = true)
public class DurationAttributeConverter implements AttributeConverter<Duration, Long> {
    @Override
    public Long convertToDatabaseColumn(Duration attribute) {
        if(attribute == null){ return null; }
        else{
            Long hours = attribute.toHours();
            Long days = hours / 24;
            return days;
        }
    }

    @Override
    public Duration convertToEntityAttribute(Long dbData) {
        if (dbData == null) { return null;}
        else {
            return Duration.ofDays(dbData);
        }
    }
}
