/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ.Java.HolaSpring.domain;

import lombok.Data;

@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
