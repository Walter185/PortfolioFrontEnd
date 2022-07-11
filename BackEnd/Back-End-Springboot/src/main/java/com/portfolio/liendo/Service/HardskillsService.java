
package com.portfolio.liendo.Service;

import com.portfolio.liendo.Repository.IHardskillsRepository;
import com.portfolio.liendo.models.Hardskills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HardskillsService {
    private final IHardskillsRepository ihardskillsRepository;
    
    @Autowired
    public HardskillsService(IHardskillsRepository ihardskillsRepository) {
        this.ihardskillsRepository=ihardskillsRepository;
    }

    public Hardskills addHardskills(Hardskills hardskills){
        return ihardskillsRepository.save(hardskills);
    }
    
    public List<Hardskills> buscarHardskills(){
        return ihardskillsRepository.findAll();
    }
    
    public Hardskills editarHardskill(Hardskills hardskills){
        return ihardskillsRepository.save(hardskills);
    }
    
    public void borrarHardskills(Long id){
        ihardskillsRepository.deleteById(id);
    }
}