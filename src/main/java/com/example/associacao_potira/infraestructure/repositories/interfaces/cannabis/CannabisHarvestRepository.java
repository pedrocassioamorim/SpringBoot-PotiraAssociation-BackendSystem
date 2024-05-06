package com.example.associacao_potira.infraestructure.repositories.interfaces.cannabis;

import com.example.associacao_potira.domain.cannabis.Cannabis;
import com.example.associacao_potira.domain.cannabis.CannabisHarvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CannabisHarvestRepository {

    List<CannabisHarvest> findAll();

    CannabisHarvest findById(Long id);

    CannabisHarvest update(CannabisHarvest cannabisHarvest, Long Id);

    CannabisHarvest save(CannabisHarvest cannabisHarvest);

    void delete(Long Id);

}
