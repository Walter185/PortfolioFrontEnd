
package com.portfolio.liendo.controllers;

import com.portfolio.liendo.Service.HardskillsService;
import com.portfolio.liendo.models.Hardskills;
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
@RequestMapping("/hardskills")
public class HardskillsController {
    private final HardskillsService hardskillsService;
        
    public HardskillsController(HardskillsService hardskillsService){
        this.hardskillsService=hardskillsService;
    }
    @ApiIgnore
    @GetMapping("/all")
    public ResponseEntity<List<Hardskills>> obtenerHardskills(){
        List<Hardskills> hardskills=hardskillsService.buscarHardskills();
        return new ResponseEntity<>(hardskills, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public  ResponseEntity<Hardskills>editarHardskills(@RequestBody Hardskills hardskills){
        Hardskills updateHardskills=hardskillsService.editarHardskill(hardskills);
        return new ResponseEntity<>(updateHardskills, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Hardskills> crearHardskills(@RequestBody Hardskills hardskills){
        Hardskills nuevaHardskills= hardskillsService.addHardskills(hardskills);
        return new ResponseEntity<>(nuevaHardskills,HttpStatus.CREATED); 
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarHardskills(@PathVariable("id") Long id){
        hardskillsService.borrarHardskills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}