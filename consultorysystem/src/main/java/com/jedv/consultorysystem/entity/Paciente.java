package com.jedv.consultorysystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pac_id;
    private String pac_user;
    private String pac_pass;
    private String pac_dni;
    private String pac_nombres;
    private String pac_apellidos;
    private String pac_telefono;
    private String pac_celular;
    private String pac_correo;
    private String pac_photo;
    private String pac_direccion;
    private String pac_sexo;
    private String pac_estadocivil;
    private Date pac_fecnac;

    public int getPac_id() {
        return pac_id;
    }

    public void setPac_id(int pac_id) {
        this.pac_id = pac_id;
    }

    public String getPac_user() {
        return pac_user;
    }

    public void setPac_user(String pac_user) {
        this.pac_user = pac_user;
    }

    public String getPac_pass() {
        return pac_pass;
    }

    public void setPac_pass(String pac_pass) {
        this.pac_pass = pac_pass;
    }

    public String getPac_dni() {
        return pac_dni;
    }

    public void setPac_dni(String pac_dni) {
        this.pac_dni = pac_dni;
    }

    public String getPac_nombres() {
        return pac_nombres;
    }

    public void setPac_nombres(String pac_nombres) {
        this.pac_nombres = pac_nombres;
    }

    public String getPac_apellidos() {
        return pac_apellidos;
    }

    public void setPac_apellidos(String pac_apellidos) {
        this.pac_apellidos = pac_apellidos;
    }

    public String getPac_telefono() {
        return pac_telefono;
    }

    public void setPac_telefono(String pac_telefono) {
        this.pac_telefono = pac_telefono;
    }

    public String getPac_celular() {
        return pac_celular;
    }

    public void setPac_celular(String pac_celular) {
        this.pac_celular = pac_celular;
    }

    public String getPac_correo() {
        return pac_correo;
    }

    public void setPac_correo(String pac_correo) {
        this.pac_correo = pac_correo;
    }

    public String getPac_photo() {
        return pac_photo;
    }

    public void setPac_photo(String pac_photo) {
        this.pac_photo = pac_photo;
    }

    public String getPac_direccion() {
        return pac_direccion;
    }

    public void setPac_direccion(String pac_direccion) {
        this.pac_direccion = pac_direccion;
    }

    public String getPac_sexo() {
        return pac_sexo;
    }

    public void setPac_sexo(String pac_sexo) {
        this.pac_sexo = pac_sexo;
    }

    public String getPac_estadocivil() {
        return pac_estadocivil;
    }

    public void setPac_estadocivil(String pac_estadocivil) {
        this.pac_estadocivil = pac_estadocivil;
    }

    public Date getPac_fecnac() {
        return pac_fecnac;
    }

    public void setPac_fecnac(Date pac_fecnac) {
        this.pac_fecnac = pac_fecnac;
    }

    @Override
    public String toString() {
        return "Paciente [pac_id=" + pac_id + ", pac_user=" + pac_user + ", pac_pass="
                + pac_pass + ", pac_dni=" + pac_dni + ", pac_nombres=" + pac_nombres
                + ", pac_apellidos=" + pac_apellidos + ", pac_telefono=" + pac_telefono
                + ", pac_celular=" + pac_celular + ", pac_correo=" + pac_correo
                + ", pac_photo=" + pac_photo + ", pac_direccion=" + pac_direccion
                + ", pac_sexo=" + pac_sexo + ", pac_estadocivil=" + pac_estadocivil
                + ", pac_fecnac=" + pac_fecnac + "]";
    }
}
