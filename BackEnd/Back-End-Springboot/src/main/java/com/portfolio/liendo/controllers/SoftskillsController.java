
package com.portfolio.liendo.controllers;

import com.portfolio.liendo.Service.SoftskillsService;
import com.portfolio.liendo.models.Softskills;
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
@RequestMapping("/softskills")
public class SoftskillsController {
    private final SoftskillsService softskillsService;
        
    public SoftskillsController(SoftskillsService softskillsService){
        this.softskillsService=softskillsService;
    }
    @ApiIgnore
    @GetMapping("/all")
    public ResponseEntity<List<Softskills>> obtenerSoftskills(){
        List<Softskills> softskills=softskillsService.buscarSoftskills();
        return new ResponseEntity<>(softskills, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public  ResponseEntity<Softskills>editarSoftskills(@RequestBody Softskills softskills){
        Softskills updateSoftskills=softskillsService.editarSoftskill(softskills);
        return new ResponseEntity<>(updateSoftskills, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Softskills> crearSoftskills(@RequestBody Softskills softskills){
        Softskills nuevaSoftskills= softskillsService.addSoftskills(softskills);
        return new ResponseEntity<>(nuevaSoftskills,HttpStatus.CREATED); 
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSoftskills(@PathVariable("id") Long id){
        softskillsService.borrarSoftskills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}