package Univ.Java.HolaSpring.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    //Crear Encriptaciones
    public static void main(String[] args) {
        var password = "123";
        System.out.println("Password: " + password);
        System.out.println("Password encriptado: " + encriptarPassword(password));
    }
    
    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
    
    
    
}
