package com.example.associacao_potira.infraestructure.repositories.honey;

import com.example.associacao_potira.domain.honey.Honey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoneyRepository extends JpaRepository<Honey,Long> {}
