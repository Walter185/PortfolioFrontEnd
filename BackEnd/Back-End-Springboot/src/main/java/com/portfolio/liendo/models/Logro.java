
package com.portfolio.liendo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Logro implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLogro;
    private String nombreLogro;
    private String imgLogro;

    public Logro() {
    }

    public Logro(Long idLogro, String nombreLogro, String imgLogro) {
        this.idLogro = idLogro;
        this.nombreLogro = nombreLogro;
        this.imgLogro = imgLogro;
    }

    public Long getIdLogro() {
        return idLogro;
    }

    public void setIdLogro(Long idLogro) {
        this.idLogro = idLogro;
    }

    public String getNombreLogro() {
        return nombreLogro;
    }

    public void setNombreLogro(String nombreLogro) {
        this.nombreLogro = nombreLogro;
    }

    public String getImgLogro() {
        return imgLogro;
    }

    public void setImgLogro(String imgLogro) {
        this.imgLogro = imgLogro;
    }

    
}
