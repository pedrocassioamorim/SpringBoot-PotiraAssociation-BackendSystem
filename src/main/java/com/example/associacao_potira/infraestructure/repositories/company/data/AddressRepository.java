package com.example.associacao_potira.infraestructure.repositories.company.data;

import com.example.associacao_potira.domain.company.data.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {}
