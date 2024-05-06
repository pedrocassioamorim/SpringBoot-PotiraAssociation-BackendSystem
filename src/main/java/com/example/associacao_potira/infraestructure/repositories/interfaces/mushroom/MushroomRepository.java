package com.example.associacao_potira.infraestructure.repositories.interfaces.mushroom;

import com.example.associacao_potira.domain.mushroom.Mushroom;

import java.util.List;

public interface MushroomRepository {

    List<Mushroom> findAll();

    Mushroom findById(Long id);

    Mushroom update(Mushroom mushroom, Long Id);

    Mushroom save(Mushroom mushroom);

    void delete(Long Id);
}
