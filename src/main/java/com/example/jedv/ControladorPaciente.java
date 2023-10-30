package com.example.jedv;

import com.example.jedv.dao.PacienteDao;
import com.example.jedv.entidad.Paciente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorPaciente {

    /* Acción para registrar un paciente a la plataforma */
    @PostMapping("/paciente/registrar")
    public String insertarPaciente(Paciente paciente){
        new PacienteDao().registrarPaciente(paciente);
        return "redirect:../";
    }

    /* Acción para registrar un paciente a la plataforma */
    @PostMapping("/paciente/buscar")
    public String buscarPaciente(int id){
        new PacienteDao().buscarPaciente(id);
        return "redirect:../";
    }

    /* Acción para registrar un paciente a la plataforma */
    @PostMapping("/paciente/modificar")
    public String modificarPaciente(Paciente paciente){
        new PacienteDao().modificarPaciente(paciente);
        return "redirect:../";
    }
}
