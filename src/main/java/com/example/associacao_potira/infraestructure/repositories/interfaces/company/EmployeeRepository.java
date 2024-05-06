package com.example.associacao_potira.infraestructure.repositories.interfaces.company;

import com.example.associacao_potira.domain.company.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee findById(Long id);

    Employee update(Employee employee, Long Id);

    Employee save(Employee employee);

    void delete(Long Id);
}
