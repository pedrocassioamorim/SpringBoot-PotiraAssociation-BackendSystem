package com.example.associacao_potira.infraestructure.repositories.interfaces.medicine;

import com.example.associacao_potira.domain.medicine.Doctor;

import java.util.List;

public interface DoctorRepository {

    List<Doctor> findAll();

    Doctor findById(Long id);

    Doctor update(Doctor doctor, Long Id);

    Doctor save(Doctor doctor);

    void delete(Long Id);
}
