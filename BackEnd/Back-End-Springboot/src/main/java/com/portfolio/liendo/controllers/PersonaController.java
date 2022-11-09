    
package com.portfolio.liendo.controllers;

import com.portfolio.liendo.models.Persona;
import com.portfolio.liendo.Service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@CrossOrigin(origins = {"https://frontendliendo.web.app","http://localhost:4200"})
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;
    
    
    public PersonaController(PersonaService personaService){
        this.personaService=personaService;
    }
    @ApiIgnore
    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id){
        Persona persona= personaService.buscarPersonaPorId(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public  ResponseEntity<Persona>editarPersona(@RequestBody Persona persona){
        Persona updatePersona=personaService.editarPersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
     @PostMapping("/add")
    public ResponseEntity<Persona>crearPersona(@RequestBody Persona persona){
        Persona nuevaPersona=personaService.addPersona(persona);
        return new ResponseEntity<>(nuevaPersona,HttpStatus.CREATED); 
    }
      @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>borrarPersona(@PathVariable("id") Long id){
        personaService.borrarPersona(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
    
