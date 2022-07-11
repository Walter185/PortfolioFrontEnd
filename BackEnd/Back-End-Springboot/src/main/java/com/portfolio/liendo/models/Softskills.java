
package com.portfolio.liendo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Softskills implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSoftskill;
    private String nombreSoftskill;
    private String fotoSoftskill;
    private int porcentajeSoftskill; 

    public Softskills() {
    }

    public Softskills(Long idSoftskill, String nombreSoftskill, String fotoSoftskill, int porcentajeSoftskill) {
        this.idSoftskill = idSoftskill;
        this.nombreSoftskill = nombreSoftskill;
        this.fotoSoftskill = fotoSoftskill;
        this.porcentajeSoftskill = porcentajeSoftskill;
    }

    public Long getIdSoftskill() {
        return idSoftskill;
    }

    public void setIdSoftskill(Long idSoftskill) {
        this.idSoftskill = idSoftskill;
    }

    public String getNombreSoftskill() {
        return nombreSoftskill;
    }

    public void setNombreSoftskill(String nombreSoftskill) {
        this.nombreSoftskill = nombreSoftskill;
    }

    public String getFotoSoftskill() {
        return fotoSoftskill;
    }

    public void setFotoSoftskill(String fotoSoftskill) {
        this.fotoSoftskill = fotoSoftskill;
    }

    public int getPorcentajeSoftskill() {
        return porcentajeSoftskill;
    }

    public void setPorcentajeSoftskill(int porcentajeSoftskill) {
        this.porcentajeSoftskill = porcentajeSoftskill;
    }

    
    
}
