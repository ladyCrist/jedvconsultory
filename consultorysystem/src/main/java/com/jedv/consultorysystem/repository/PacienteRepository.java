package com.jedv.consultorysystem.repository;

import com.jedv.consultorysystem.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}
