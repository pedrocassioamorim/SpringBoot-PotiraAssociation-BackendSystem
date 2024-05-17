package com.example.associacao_potira.infraestructure.repositories.mushroom;

import com.example.associacao_potira.domain.mushroom.Mushroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MushroomRepository extends JpaRepository<Mushroom,Long> {}
