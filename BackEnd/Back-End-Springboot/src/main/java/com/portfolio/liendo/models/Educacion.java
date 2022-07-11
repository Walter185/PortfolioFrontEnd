
package com.portfolio.liendo.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private Date startEdu;
    private Date endEdu;
    private String schoolEdu;
    private String imgEdu;
    private String otherEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, Date startEdu, Date endEdu, String schoolEdu, String imgEdu, String otherEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.startEdu = startEdu;
        this.endEdu = endEdu;
        this.schoolEdu = schoolEdu;
        this.imgEdu = imgEdu;
        this.otherEdu = otherEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public Date getStartEdu() {
        return startEdu;
    }

    public void setStartEdu(Date startEdu) {
        this.startEdu = startEdu;
    }

    public Date getEndEdu() {
        return endEdu;
    }

    public void setEndEdu(Date endEdu) {
        this.endEdu = endEdu;
    }

    public String getSchoolEdu() {
        return schoolEdu;
    }

    public void setSchoolEdu(String schoolEdu) {
        this.schoolEdu = schoolEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getOtherEdu() {
        return otherEdu;
    }

    public void setOtherEdu(String otherEdu) {
        this.otherEdu = otherEdu;
    }
    

}
