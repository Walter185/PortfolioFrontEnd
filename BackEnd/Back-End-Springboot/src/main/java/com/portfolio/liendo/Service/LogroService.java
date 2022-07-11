
package com.portfolio.liendo.Service;

import com.portfolio.liendo.Repository.ILogroRepository;
import com.portfolio.liendo.models.Logro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LogroService {
    private final ILogroRepository ilogroRepository;
        
    @Autowired
    public LogroService(ILogroRepository ilogroRepository) {
        this.ilogroRepository=ilogroRepository;
    }

    public Logro addLogro(Logro logro){
        return ilogroRepository.save(logro);
    }
    
    public List<Logro> buscarLogros(){
        return ilogroRepository.findAll();
    }
    
    public Logro editarLogro(Logro logro){
        return ilogroRepository.save(logro);
    }
    
    public void borrarLogro(Long id){
        ilogroRepository.deleteById(id);
    }
    
    
}
