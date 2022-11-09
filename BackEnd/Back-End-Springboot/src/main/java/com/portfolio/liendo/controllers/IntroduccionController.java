package com.portfolio.liendo.controllers;

import com.portfolio.liendo.Service.IntroduccionService;
import com.portfolio.liendo.models.Introduccion;
import java.util.List;
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
@RequestMapping("/introduccion")
public class IntroduccionController {
    private final IntroduccionService introduccionService;
        
    public IntroduccionController(IntroduccionService introduccionService){
        this.introduccionService=introduccionService;
    }
    @ApiIgnore
    @GetMapping("/all")
    public ResponseEntity<List<Introduccion>> obtenerIntroduccion(){
        List<Introduccion> introducciones=introduccionService.buscarIntroduccion();
        return new ResponseEntity<>(introducciones, HttpStatus.OK);
    }
       
    @PutMapping("/update")
    public  ResponseEntity<Introduccion> editarIntroduccion(@RequestBody Introduccion introduccion){
        Introduccion updateIntroduccion=introduccionService.editarIntroduccion(introduccion);
        return new ResponseEntity<>(updateIntroduccion, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Introduccion> crearIntroduccion(@RequestBody Introduccion introduccion){
    Introduccion nuevaIntroduccion=introduccionService.addIntroduccion(introduccion);
       return new ResponseEntity<>(nuevaIntroduccion,HttpStatus.CREATED); 
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarIntroduccion(@PathVariable("id") Long id){
    introduccionService.borrarIntroduccion(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
