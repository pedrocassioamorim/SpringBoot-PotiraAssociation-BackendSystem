package com.example.associacao_potira.infraestructure.repositories.honey;

import com.example.associacao_potira.domain.honey.HoneyHarvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoneyHarvestRepository extends JpaRepository<HoneyHarvest,Long> {}
