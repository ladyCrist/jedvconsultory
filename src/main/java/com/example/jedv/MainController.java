package com.example.jedv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    /* Entrar a la página principal */
    @RequestMapping("/")
    public String index() { return "index"; }

    /* Entrar a la vista de login de usuario */
    @RequestMapping("/login")
    public String login() { return "login"; }

    /* Entrar a la vista de contacto */
    @RequestMapping("/contacto")
    public String contacto() { return "contacto"; }
}
