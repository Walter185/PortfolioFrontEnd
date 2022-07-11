package com.portfolio.liendo.Service;

import com.portfolio.liendo.Repository.IIntroduccionRepository;
import com.portfolio.liendo.models.Introduccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IntroduccionService {
    private final IIntroduccionRepository iintroduccionRepository;

    @Autowired
    public IntroduccionService(IIntroduccionRepository iintroduccionRepository) {
        this.iintroduccionRepository = iintroduccionRepository;
    }

    public Introduccion addIntroduccion(Introduccion introduccion) {
       return iintroduccionRepository.save(introduccion);
    }

    public List<Introduccion> buscarIntroduccion() {
       return iintroduccionRepository.findAll();
    }

    public Introduccion editarIntroduccion(Introduccion introduccion) {
        return iintroduccionRepository.save(introduccion);
    }

    public void borrarIntroduccion(Long id) {
      iintroduccionRepository.deleteById(id);
    }
   
}
