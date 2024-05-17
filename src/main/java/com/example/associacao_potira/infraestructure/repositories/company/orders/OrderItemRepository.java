package com.example.associacao_potira.infraestructure.repositories.company.orders;

import com.example.associacao_potira.domain.company.orders.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {}
