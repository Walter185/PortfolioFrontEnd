package com.portfolio.liendo.Service;

import com.portfolio.liendo.Repository.IProyectosRepository;
import com.portfolio.liendo.models.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    private final IProyectosRepository iproyectosRepository;
    
    @Autowired
    public ProyectosService(IProyectosRepository iproyectosRepository) {
        this.iproyectosRepository=iproyectosRepository;
    }

    public Proyectos addProyectos(Proyectos proyectos){
        return iproyectosRepository.save(proyectos);
    }
    
    public List<Proyectos> buscarProyectos(){
        return iproyectosRepository.findAll();
    }
    
    public Proyectos editarProyectos(Proyectos proyectos){
        return iproyectosRepository.save(proyectos);
    }
    
    public void borrarProyectos(Long id){
        iproyectosRepository.deleteById(id);
    }
    
}