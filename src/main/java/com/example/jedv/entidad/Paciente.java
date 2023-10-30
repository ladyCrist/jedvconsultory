package com.example.jedv.entidad;

import java.util.Date;

public class Paciente {
    private int id;
    private String usuario;
    private String clave_secreta;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String celular;
    private String correo;
    private String foto;
    private String direccion;
    private String sexo;
    private String estado_civil;
    private Date fecha_nacimiento;

    public Paciente(int id, String usuario, String clave_secreta, String dni,
                    String nombres, String apellidos, String telefono, String celular,
                    String correo, String foto, String direccion, String sexo,
                    String estado_civil, Date fecha_nacimiento) {
        this.id = id;
        this.usuario = usuario;
        this.clave_secreta = clave_secreta;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.foto = foto;
        this.direccion = direccion;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Paciente(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave_secreta() {
        return clave_secreta;
    }

    public void setClave_secreta(String clave_secreta) {
        this.clave_secreta = clave_secreta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
