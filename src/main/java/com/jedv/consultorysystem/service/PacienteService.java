package com.jedv.consultorysystem.service;

import com.jedv.consultorysystem.entity.Paciente;

import java.util.List;

public interface PacienteService {

    public Paciente savePaciente(Paciente pac);

    public List<Paciente> getAllPacientes();

    public Paciente getPacienteById(int pac_id);

    public boolean deletePaciente(int pac_id);
}
