package com.example.associacao_potira.infraestructure.repositories.company.orders;

import com.example.associacao_potira.domain.company.orders.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodsRepository extends JpaRepository<PaymentMethod,Long> {}
