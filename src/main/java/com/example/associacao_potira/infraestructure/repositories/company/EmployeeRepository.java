package com.example.associacao_potira.infraestructure.repositories.company;

import com.example.associacao_potira.domain.company.employees.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {}
