
package com.portfolio.liendo.Repository;

import com.portfolio.liendo.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
    
}
