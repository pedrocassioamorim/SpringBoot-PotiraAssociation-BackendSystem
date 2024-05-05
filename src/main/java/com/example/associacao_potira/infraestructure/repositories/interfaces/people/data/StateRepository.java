package com.example.associacao_potira.infraestructure.repositories.interfaces.people.data;

import com.example.associacao_potira.domain.people.data.State;

import java.util.List;

public interface StateRepository {

    List<State> findAll();

    State findById(Long id);

    State update(State state, Long Id);

    State save(State state);

    void delete(Long id);
}
