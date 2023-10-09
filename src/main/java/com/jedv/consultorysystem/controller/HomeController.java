package com.jedv.consultorysystem.controller;

import com.jedv.consultorysystem.entity.Paciente;
import com.jedv.consultorysystem.service.PacienteService;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PacienteService pacienteService;

    // Retorna la página a la cual se esté especificando
    // Retorna la ruta "/" que es el index.html
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model m){
        List<Paciente> list = pacienteService.getAllPacientes();
        m.addAttribute("pacList", list);
        return "dashboard";
    }

    @GetMapping("/loadPacienteSave")
    public String loadPacienteSave(){
        return "pac_save";
    }

    //"/editPaciente/{id}"
    @GetMapping("/perfil/{id}")
    public String perfil(@PathVariable int id, Model m){
        System.out.println(id);
        Paciente paciente = pacienteService.getPacienteById(id);
        m.addAttribute("pac", paciente);
        return "perfil";
    }

    @PostMapping("/savePaciente")
    public String savePaciente(@ModelAttribute Paciente pac, HttpSession session) {
        System.out.println(pac);
        Paciente newPaciente = pacienteService.savePaciente(pac);
        if(newPaciente != null){
            System.out.println("Se guardó exitósamente");
            session.setAttribute("msg", "Registro exitoso");
        } else {
            System.out.println("Algo malo sucedió en el servidor");
            session.setAttribute("msg", "Algo malo sucedió en el servidor");
        }
        return "redirect:/dashboard";
    }

    @PostMapping("/updatePacienteDetails")
    public String updatePaciente(@ModelAttribute Paciente pac, HttpSession session) {
        System.out.println(pac);
        Paciente updatePaciente = pacienteService.savePaciente(pac);
        if(updatePaciente != null){
            System.out.println("Se guardó exitósamente");
            session.setAttribute("msg", "Actualización exitoso");
        } else {
            System.out.println("Algo malo sucedió en el servidor");
            session.setAttribute("msg", "Algo malo sucedió en el servidor");
        }
        return "redirect:/dashboard";
    }

    @GetMapping("/deletePaciente/{id}")
    public String loadPacienteSave(@PathVariable int id, HttpSession session) {
        boolean f = pacienteService.deletePaciente(id);
        if (f) {
            session.setAttribute("msg", "Delete sucessfully");
        } else {
            session.setAttribute("msg", "something wrong on server");
        }
        return "redirect:/dashboard";
    }
}
