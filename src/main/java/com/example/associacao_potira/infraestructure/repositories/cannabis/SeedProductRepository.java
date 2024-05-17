package com.example.associacao_potira.infraestructure.repositories.cannabis;

import com.example.associacao_potira.domain.cannabis.SeedProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeedProductRepository extends JpaRepository<SeedProduct, Long> {}
