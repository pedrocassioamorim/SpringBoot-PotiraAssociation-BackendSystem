package com.example.associacao_potira.infraestructure.repositories.medicine;

import com.example.associacao_potira.domain.medicine.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {}
