package com.example.jedv.dao;

import com.example.jedv.entidad.Paciente;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacienteDao {

    public int registrarPaciente(Paciente a) {
        int rs = 0;
        String query = "INSERT INTO Paciente (usuario, clave_secreta, dni) values (?,?,?)";
        try {
            PreparedStatement pstm = Conexion.getConnection().prepareStatement(query);
            pstm.setString(1, a.getUsuario());
            pstm.setString(2, a.getClave_secreta());
            pstm.setString(3, a.getDni());
            rs = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public Paciente buscarPaciente(int id){
        Paciente paciente = null;
        String query= "SELECT * FROM Paciente WHERE id=?";
        try{
            PreparedStatement pstm = Conexion.getConnection().prepareStatement(query);
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();
            if(rst.next()){
                paciente = new Paciente();
                paciente.setId(rst.getInt("id"));
                paciente.setUsuario(rst.getString("usuario"));
                paciente.setClave_secreta(rst.getString("clave_secreta"));
                paciente.setNombres(rst.getString("nombres"));
                paciente.setApellidos(rst.getString("apellidos"));
                paciente.setTelefono(rst.getString("telefono"));
                paciente.setCelular(rst.getString("celular"));
                paciente.setCorreo(rst.getString("correo"));
                paciente.setFoto(rst.getString("foto"));
                paciente.setDireccion(rst.getString("direccion"));
                paciente.setSexo(rst.getString("sexo"));
                paciente.setEstado_civil(rst.getString("estado_civil"));
                paciente.setFecha_nacimiento(rst.getDate("fecha_nacimiento"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return paciente;
    }

    public int modificarPaciente(Paciente a){
        int rs = 0;
        String query="UPDATE Alumno SET nombres=?, apellidos=?, telefono=?, celular=?," +
                "correo=?, foto=?, direccion=?, sexo=?, fecha_nacimiento=? WHERE id=?";
        try{
            PreparedStatement pstm = Conexion.getConnection().prepareStatement(query);
            pstm.setString(1, a.getNombres());
            pstm.setString(2, a.getApellidos());
            pstm.setString(3, a.getTelefono());
            pstm.setString(4, a.getCelular());
            pstm.setString(5, a.getCorreo());
            pstm.setString(6, a.getFoto());
            pstm.setString(7, a.getDireccion());
            pstm.setString(8, a.getSexo());
            pstm.setDate(9, (Date) a.getFecha_nacimiento());
            pstm.setInt(10, a.getId());
            rs = pstm.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }


    /*
    public List<Alumno> listar() {
        List<Alumno> lst = new ArrayList<Alumno>();
        String query = "SELECT *  FROM ALUMNO order by apellidos, nombres";
        try {
            PreparedStatement pstm = Conexion.getConnection().prepareStatement(query);
            ResultSet rst = pstm.executeQuery();
            while (rst.next()) {
                Alumno a = new Alumno();
                a.setId(rst.getInt("id"));
                a.setApellidos(rst.getString("apellidos"));
                a.setNombres(rst.getString("nombres"));
                a.setEdad(rst.getInt("edad"));
                lst.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }

    public int eliminar(int id){
        int rs = 0;
        String query="DELETE FROM alumno WHERE id=?";
        try{
            PreparedStatement pstm = Conexion.getConnection().prepareStatement(query);
            pstm.setInt(1, id);
            rs = pstm.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    */
}
