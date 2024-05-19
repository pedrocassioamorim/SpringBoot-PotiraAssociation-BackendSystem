package com.example.associacao_potira.infraestructure.repositories.cannabis;

import com.example.associacao_potira.domain.cannabis.CannabisHarvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CannabisHarvestRepository extends JpaRepository<CannabisHarvest, Long> {}
