/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nao-CG
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCrud {
    
    private Connection conexion;
    
    public UserCrud(){
            
        conexion=ConexionMySQL.conectar();
    }
    public boolean crearusuario(String nombre,String correo, String contraseña){
    
            String sqlInsert="INSERT INTO Usuarios(nombre,correo,contraseña)VALUES(?,?,?)";
            
            /* es para verificar mientras corre si falla sin que se interrupta y que me muestre el error */
            try{
                PreparedStatement ps =conexion.prepareStatement(sqlInsert);
                ps.setString(1, nombre);
                ps.setString(2, correo);
                ps.setString(3, contraseña);
                return ps.executeUpdate()>0;
            }
            catch(SQLException e){
                
                System.out.println("error al intentar insertar" + e.getMessage());
                return false;
            }
    }
}
