package com.portfolio.liendo.Service;

import com.portfolio.liendo.Repository.IEducacionRepository;
import com.portfolio.liendo.models.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    private final IEducacionRepository ieducacionRepository;
    
    @Autowired
    public EducacionService(IEducacionRepository ieducacionRepository) {
        this.ieducacionRepository=ieducacionRepository;
    }

    public Educacion addEducacion(Educacion educacion){
        return ieducacionRepository.save(educacion);
    }
    
    public List<Educacion> buscarEducaciones(){
        return ieducacionRepository.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return ieducacionRepository.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        ieducacionRepository.deleteById(id);
    }
    
}
