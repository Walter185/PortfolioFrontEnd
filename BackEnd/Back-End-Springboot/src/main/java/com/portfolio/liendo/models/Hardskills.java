
package com.portfolio.liendo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hardskills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHardskill;
    private String nombreHardskill;
    private String fotoHardskill;
    private int porcentajeHardskill; 

    public Hardskills() {
    }

    public Hardskills(Long idHardskill, String nombreHardskill, String fotoHardskill, int porcentajeHardskill) {
        this.idHardskill = idHardskill;
        this.nombreHardskill = nombreHardskill;
        this.fotoHardskill = fotoHardskill;
        this.porcentajeHardskill = porcentajeHardskill;
    }

    public Long getIdHardskill() {
        return idHardskill;
    }

    public void setIdHardskill(Long idHardskill) {
        this.idHardskill = idHardskill;
    }

    public String getNombreHardskill() {
        return nombreHardskill;
    }

    public void setNombreHardskill(String nombreHardskill) {
        this.nombreHardskill = nombreHardskill;
    }

    public String getFotoHardskill() {
        return fotoHardskill;
    }

    public void setFotoHardskill(String fotoHardskill) {
        this.fotoHardskill = fotoHardskill;
    }

    public int getPorcentajeHardskill() {
        return porcentajeHardskill;
    }

    public void setPorcentajeHardskill(int porcentajeHardskill) {
        this.porcentajeHardskill = porcentajeHardskill;
    }
    
    
}
