package com.portfolio.liendo.Service;


import com.portfolio.liendo.Repository.IPersonaRepository;
import com.portfolio.liendo.models.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService{
    private final IPersonaRepository ipersonaRepository;
        
    @Autowired
    public PersonaService(IPersonaRepository ipersonaRepository){
        this.ipersonaRepository=ipersonaRepository;
        
    }          
    public Persona addPersona(Persona persona){
        return ipersonaRepository.save(persona);
    }
    
    public List<Persona> buscarPersona(){
        return ipersonaRepository.findAll();
    }
    
    public Persona editarPersona(Persona persona){
        return ipersonaRepository.save(persona);
    }
    
    public void borrarPersona(Long id){
        ipersonaRepository.deleteById(id);
    }
    
    public Persona buscarPersonaPorId(Long id){
        return ipersonaRepository.findById(id).orElse(null);
    }
}
