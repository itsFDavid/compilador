/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


/**
 *
 * @author PAKO031147
 */
public class Database {
    private static final String URL = "jdbc:sqlite:usuarios.db";
    
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(URL);
    }
    
    public static void createUserTable(){
        String sql = "CREATE TABLE IF NOT EXISTS users("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "username TEXT NOT NULL UNIQUE,"
                + "password TEXT NOT NULL);";
        
        try(Connection conn = connect();
            Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabla users creada o ya existente");
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void viewTable(){
        String sql = "SELECT * FROM users;";
        
        try(Connection conn = Database.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            ResultSet rs = pstmt.executeQuery();
            
            System.out.println("tabla usuarios");
            while(rs.next()){
                String name = rs.getString("username");
                String psw = rs.getString("password");
                System.out.println("Name: " + name);
                System.out.println("hashedPass: "+ psw);
                System.out.println("");
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
