package com.example.associacao_potira.infraestructure.repositories.implementations.company;

import com.example.associacao_potira.domain.company.Employee;
import com.example.associacao_potira.infraestructure.repositories.interfaces.company.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
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