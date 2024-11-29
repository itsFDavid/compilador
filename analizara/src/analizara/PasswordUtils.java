/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizara; 

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author PAKO031147
 */
public class PasswordUtils {
    public static String hashPassword(String password){
        try {
            String hashedPassword = DigestUtils.md5Hex(password);
            return hashedPassword;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
            
        }
    }

}
