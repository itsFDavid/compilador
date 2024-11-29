/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizara;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author PAKO031147
 */
public class UserRepository {
    public static boolean registerUser(String username, String password){
        String sql = "INSERT INTO users(username, password) VALUES (?,?)";
        
        try(Connection conn = Database.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            String hashedPassword = PasswordUtils.hashPassword(password);
            pstmt.setString(1, username);
            pstmt.setString(2, hashedPassword);
            pstmt.executeUpdate();
            System.out.println("Usuario registrado exitosamente");
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean loginUser(String username, String password){
        String sql = "SELECT password FROM users WHERE username = ?";
        
        try(Connection conn = Database.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                String hashedPassword = rs.getString("password");
                String hpsw = PasswordUtils.hashPassword(password);
                if(hashedPassword.equals(hpsw)){
                    return true;
                }
            }else{
                System.err.println("usuario no encontrado");
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
