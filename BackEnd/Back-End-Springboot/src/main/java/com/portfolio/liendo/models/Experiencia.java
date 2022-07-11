
package com.portfolio.liendo.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private Date startExp;
    private Date endExp;
    private String lugarExp;
    private String imgExp;
    private String otherExp;
    
    
    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, Date startExp, Date endExp, String lugarExp, String imgExp, String otherExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.startExp = startExp;
        this.endExp =endExp;
        this.lugarExp = lugarExp;
        this.imgExp = imgExp;
        this.otherExp = otherExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public Date getStartExp() {
        return startExp;
    }

    public void setStartExp(Date startExp) {
        this.startExp = startExp;
    }

    public Date getEndExp() {
        return endExp;
    }

    public void setEndExp(Date endExp) {
        this.endExp = endExp;
    }

    public String getLugarExp() {
        return lugarExp;
    }

    public void setLugarExp(String lugarExp) {
        this.lugarExp = lugarExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public String getOtherExp() {
        return otherExp;
    }

    public void setOtherExp(String otherExp) {
        this.otherExp = otherExp;
    }

    
}