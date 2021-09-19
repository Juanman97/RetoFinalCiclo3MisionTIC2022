/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.mascota;
import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanManuel
 */
public class veterinariaDao {
    

    public ArrayList<mascota> getMascotas() {
        Connection con = null;
        ArrayList<mascota> mascotas = new ArrayList<>();
        try {
            con = Conexion.getConnection();
            String sql = " select mascotaId, mascotaNombre, propUsuario, propNombre, propApellido, propTelefono from mascota natural join propietario ";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                mascota m = new mascota(result.getInt(1), result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5), result.getString(6));
                mascotas.add(m);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return mascotas;
    }

    public mascota getMascota(String nombre) {
        Connection con = null;
        mascota m = null;
        try{
            con = Conexion.getConnection();
            String sql = "select mascotaId, mascotaNombre, propUsuario, propNombre, propApellido, propTelefono from mascota natural join propietario where mascotaNombre= '" + nombre + "'";
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                m = new mascota(result.getInt(1), result.getString(2), result.getString(3),
                result.getString(4), result.getString(5), result.getString(6));
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return m;
    }

    public void updateMascota(mascota m) {
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = " update mascota set mascotaNombre=?, propUsuario=? where mascotaId=? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, m.getMascotaNombre());
            statement.setString(2, m.getPropUsuario());
            statement.setInt(3, m.getMascotaId());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue " + " actualizado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

    public void deleteMascota(int id) {
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = " delete from mascota where mascotaId=? ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue " + " borrado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

    public void addMascota(mascota m) {
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = " insert into mascota(mascotaNombre, propUsuario) values (?,?) ";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, m.getMascotaNombre());
            statement.setString(2, m.getPropUsuario());
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "El registro fue " + " creado exitosamente !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }
    
    public ArrayList<mascota> getMascotasByUser(String user) {
        Connection con = null;
        ArrayList<mascota> mascotas = new ArrayList<>();
        try {
            con = Conexion.getConnection();
            String sql = " select mascotaId, mascotaNombre, propUsuario, propNombre, propApellido, propTelefono from mascota natural join propietario where propUsuario ='" + user + "'";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                mascota m = new mascota(result.getInt(1), result.getString(2), result.getString(3),
                        result.getString(4), result.getString(5), result.getString(6));
                mascotas.add(m);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        return mascotas;
    }

}
