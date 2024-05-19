package com.example.associacao_potira.infraestructure.dtos.company.data;

import com.example.associacao_potira.domain.company.data.City;
import com.example.associacao_potira.domain.company.data.State;
import jakarta.persistence.ManyToOne;

public class AddressDTO {

    private Long id;

    private String street;

    private String number;

    private String complement;

    private City city;

    private State state;





}
