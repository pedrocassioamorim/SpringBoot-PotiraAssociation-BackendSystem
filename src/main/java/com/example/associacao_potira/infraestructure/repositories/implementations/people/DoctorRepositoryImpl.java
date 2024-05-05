package com.example.associacao_potira.infraestructure.repositories.implementations.people;

import com.example.associacao_potira.domain.people.Doctor;
import com.example.associacao_potira.infraestructure.repositories.interfaces.people.DoctorRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class DoctorRepositoryImpl implements DoctorRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Doctor> findAll() {
        return entityManager.createQuery("from Doctor", Doctor.class).getResultList();
    }

    @Override
    public Doctor findById(Long id) {
        return entityManager.find(Doctor.class, id);
    }

    @Override @Transactional
    public Doctor update(Doctor doctor, Long Id) {
        doctor.setId(Id);
        return entityManager.merge(doctor);
    }

    @Override @Transactional
    public Doctor save(Doctor doctor) {
        return entityManager.merge(doctor);
    }

    @Override @Transactional
    public void delete(Long Id) {
        Doctor doctor = findById(Id);
        entityManager.remove(doctor);
    }
}
