package com.example.associacao_potira.infraestructure.repositories.cannabis;

import com.example.associacao_potira.domain.cannabis.Seed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeedRepository extends JpaRepository<Seed,Long> {}
