
package com.portfolio.liendo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Introduccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIntro;  
    private String tituloIntro;
    private String intro;  

    public Introduccion() {
    }

    public Introduccion(Long idIntro, String tituloIntro, String intro) {
        this.idIntro = idIntro;
        this.tituloIntro = tituloIntro;
        this.intro = intro;
    }

    public Long getIdIntro() {
        return idIntro;
    }

    public void setIdIntro(Long idIntro) {
        this.idIntro = idIntro;
    }

    public String getTituloIntro() {
        return tituloIntro;
    }

    public void setTituloIntro(String tituloIntro) {
        this.tituloIntro = tituloIntro;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    
}
