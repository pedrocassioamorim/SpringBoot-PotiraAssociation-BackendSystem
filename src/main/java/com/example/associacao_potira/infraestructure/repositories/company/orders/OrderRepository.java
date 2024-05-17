package com.example.associacao_potira.infraestructure.repositories.company.orders;

import com.example.associacao_potira.domain.company.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {}
