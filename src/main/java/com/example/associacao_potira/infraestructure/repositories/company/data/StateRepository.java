package com.example.associacao_potira.infraestructure.repositories.company.data;

import com.example.associacao_potira.domain.company.data.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State,Long> {}
