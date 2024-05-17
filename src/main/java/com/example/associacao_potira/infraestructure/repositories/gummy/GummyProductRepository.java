package com.example.associacao_potira.infraestructure.repositories.gummy;

import com.example.associacao_potira.domain.gummy.GummyProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GummyProductRepository extends JpaRepository<GummyProduct,Long> {}
