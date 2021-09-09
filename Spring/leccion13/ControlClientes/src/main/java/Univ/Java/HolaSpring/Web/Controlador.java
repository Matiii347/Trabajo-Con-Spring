package Univ.Java.HolaSpring.Web;

import Univ.Java.HolaSpring.domain.Persona;
import Univ.Java.HolaSpring.servicio.PersonaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller//va a paginas web html
//rest controller Para afectar el navegador.
@Slf4j//Manejo del Log
public class Controlador {
    
    @Autowired
    private PersonaService personaService;
    
    
    @GetMapping("/")
    public String Inicio(Model model, @AuthenticationPrincipal User user){
        
        var personas=personaService.ListarPersona();
        
        log.info("Ejecuntando el Controlador MVC");
        log.info("El usuario que hizo login fue: "+user);
        model.addAttribute("personas", personas);
        var saldoTotal = 0D;
        for (var p : personas) {
            saldoTotal += p.getSaldo();
        }
        model.addAttribute("saldoTotal", saldoTotal);
        model.addAttribute("totalClientes", personas.size());
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        if (errores.hasErrors()) {
            return "modificar";
        }
        personaService.Guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, ModelMap model){
       persona = personaService.EncontrarPersona(persona);
       model.addAttribute("persona", persona);
       return "modificar";
    }
    
     @GetMapping("/eliminar")
    public String eliminar(Persona persona, ModelMap model){
       personaService.Eliminar(persona);
       return "redirect:/";
    }
    
    
    
}
