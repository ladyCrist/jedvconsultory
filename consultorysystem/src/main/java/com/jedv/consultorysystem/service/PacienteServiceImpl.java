package com.jedv.consultorysystem.service;

import com.jedv.consultorysystem.entity.Paciente;
import com.jedv.consultorysystem.repository.PacienteRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    private PacienteRepository pacienteRepo;

    @Override
    public Paciente savePaciente(Paciente pac) {
        Paciente newPaciente = pacienteRepo.save(pac);
        return newPaciente;
    }

    @Override
    public List<Paciente> getAllPacientes() {
        return pacienteRepo.findAll();
    }

    @Override
    public Paciente getPacienteById(int pac_id) {
        return pacienteRepo.findById(pac_id).get();
    }

    @Override
    public boolean deletePaciente(int pac_id) {
        Paciente paciente = pacienteRepo.findById(pac_id).get();
        if(paciente != null){
            pacienteRepo.delete(paciente);
            return true;
        }
        return false;
    }

    public void removeSessionMessage() {
        HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest()
                .getSession();

        session.removeAttribute("msg");
    }
}
