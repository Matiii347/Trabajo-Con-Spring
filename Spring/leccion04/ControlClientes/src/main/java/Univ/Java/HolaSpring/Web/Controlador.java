/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ.Java.HolaSpring.Web;



import Univ.Java.HolaSpring.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//va a paginas web html
//rest controller Para afectar el navegador.
@Slf4j//Manejo del Log
public class Controlador {
    
    @Autowired
    private PersonaService personaService;
    
    
    @GetMapping("/")
    public String Inicio(ModelMap model){
        
//        var persona=new Persona();
//        persona.setNombre("Matias");
//        persona.setApellido("Funes");
//        persona.setEmail("matiasracingente@gmail.com");
//        persona.setTelefono("3513128672");
//        
//        var persona2=new Persona();
//        persona2.setNombre("Maru");
//        persona2.setApellido("Zapata");
//        persona2.setEmail("maruzapata@gmail.com");
//        persona2.setTelefono("3513120750");
        
//        var personas=new ArrayList();
//        personas.add(persona);
//        personas.add(persona2);
//        Arrays

//        var personas=Arrays.asList(persona,persona2);//Otro Tipo de Array
        
        var personas=personaService.ListarPersona();
        
        log.info("Ejecuntando el Controlador MVC");
        
        model.addAttribute("personas", personas);//en Lista
        
        return "index";
    }
}
