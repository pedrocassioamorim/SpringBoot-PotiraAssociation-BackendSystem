package com.example.associacao_potira.infraestructure.repositories.cannabis;

import com.example.associacao_potira.domain.cannabis.Cannabis;
import com.example.associacao_potira.domain.cannabis.CannabisHarvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface CannabisHarvestRepository extends JpaRepository<CannabisHarvest, Long> {}
