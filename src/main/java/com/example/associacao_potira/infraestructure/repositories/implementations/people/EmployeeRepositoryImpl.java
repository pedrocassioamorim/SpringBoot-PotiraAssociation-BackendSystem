package com.example.associacao_potira.infraestructure.repositories.implementations.people;

import com.example.associacao_potira.domain.people.Employee;
import com.example.associacao_potira.infraestructure.repositories.interfaces.people.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery("from Employee", Employee.class).getResultList();
    }

    @Override
    public Employee findById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override @Transactional
    public Employee update(Employee employee, Long Id) {
        employee.setId(Id);
        return entityManager.merge(employee);
    }

    @Override @Transactional
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override @Transactional
    public void delete(Long Id) {
        Employee employee = entityManager.find(Employee.class, Id);
        entityManager.remove(employee);
    }
}
