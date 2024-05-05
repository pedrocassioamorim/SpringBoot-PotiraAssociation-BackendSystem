package com.example.associacao_potira.infraestructure.repositories.interfaces.people;

import com.example.associacao_potira.domain.people.Doctor;

import java.util.List;

public interface DoctorRepository {

    List<Doctor> findAll();

    Doctor findById(Long id);

    Doctor update(Doctor doctor, Long Id);

    Doctor save(Doctor doctor);

    void delete(Long Id);
}
