package com.example.associacao_potira.infraestructure.repositories.cannabis;

import com.example.associacao_potira.domain.cannabis.Clone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CloneRepository extends JpaRepository<Clone,Long> {}
