package com.example.associacao_potira.infraestructure.repositories.clients;

import com.example.associacao_potira.domain.clients.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {}
