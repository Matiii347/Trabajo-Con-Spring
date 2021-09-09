/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ.Java.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Para afectar el navegador.
@Slf4j//Manejo del Login
public class Controlador {
    
    @GetMapping("/")
    public String Inicio(){
        log.info("Ejecuntando el Controlador Rest");
        return "Hola Mundo Con Spring";
    }
}
