
package com.portfolio.liendo.controllers;

import com.portfolio.liendo.Service.LogroService;
import com.portfolio.liendo.models.Logro;
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
@CrossOrigin(origins = "https://frontendliendo.web.app")
@RequestMapping("/logro")
public class LogroController {
    private final LogroService logroService;
    
        public LogroController(LogroService logroService){
        this.logroService=logroService;
    }
    @ApiIgnore
    @GetMapping("/all")
    public ResponseEntity<List<Logro>> obtenerLogro(){
        List<Logro> logros=logroService.buscarLogros();
        return new ResponseEntity<>(logros, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public  ResponseEntity<Logro>editarLogro(@RequestBody Logro logro){
        Logro updateLogro=logroService.editarLogro(logro);
        return new ResponseEntity<>(updateLogro, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Logro>crearLogro(@RequestBody Logro logro){
        Logro nuevaLogro=logroService.addLogro(logro);
        return new ResponseEntity<>(nuevaLogro,HttpStatus.CREATED); 
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>borrarLogro(@PathVariable("id") Long id){
        logroService.borrarLogro(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
