package com.portfolio.liendo.Service;

import com.portfolio.liendo.Repository.IExperienciaRepository;
import com.portfolio.liendo.models.Experiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final IExperienciaRepository iexperienciaRepository;
    
    @Autowired
    public ExperienciaService(IExperienciaRepository iexperienciaRepository) {
        this.iexperienciaRepository=iexperienciaRepository;
    }

    public Experiencia addExperiencia(Experiencia experiencia){
        return iexperienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return iexperienciaRepository.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
        return iexperienciaRepository.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        iexperienciaRepository.deleteById(id);
    }
}