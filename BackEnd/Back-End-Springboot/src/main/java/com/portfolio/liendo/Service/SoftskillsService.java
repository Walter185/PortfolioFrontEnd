
package com.portfolio.liendo.Service;

import com.portfolio.liendo.models.Softskills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.portfolio.liendo.Repository.ISoftskillsRepository;


@Service
@Transactional
public class SoftskillsService {
    private final ISoftskillsRepository isoftskillsRepository;
    
    @Autowired
    public SoftskillsService(ISoftskillsRepository isoftskillsRepository) {
        this.isoftskillsRepository=isoftskillsRepository;
    }

    public Softskills addSoftskills(Softskills softskills){
        return isoftskillsRepository.save(softskills);
    }
    
    public List<Softskills> buscarSoftskills(){
        return isoftskillsRepository.findAll();
    }
    
    public Softskills editarSoftskill(Softskills softskills){
        return isoftskillsRepository.save(softskills);
    }
    
    public void borrarSoftskills(Long id){
        isoftskillsRepository.deleteById(id);
    }
}