    
package com.portfolio.liendo.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String institucion;
    private String urlinst;  
    private String imginst;    
    private String email;
    private String telefono;  
    private String img;
    private String banner1;
    private String banner2;
    private String banner3;
    private String ubicacion;
   
    @OneToMany(fetch = FetchType.LAZY, mappedBy= "idEdu")
    private List<Educacion> educacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyectos> proyectosList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy= "idSoftskill")
    private List<Softskills> softskillList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy= "idHardskill")
    private List<Hardskills> hardskillList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy= "idExp")
    private List<Experiencia> experienciaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy= "idLogro")
    private List<Logro> logroList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy= "idIntro")
    private List<Introduccion> introduccionList;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String institucion, String urlinst, String imginst, String email, String img, String banner1, String banner2, String banner3, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.institucion = institucion;
        this.urlinst = urlinst;
        this.imginst = imginst;
        this.email = email;
        this.img = img;
        this.banner1 = banner1;
        this.banner2 = banner2;
        this.banner3 = banner3;
        this.ubicacion = ubicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getUrlinst() {
        return urlinst;
    }

    public void setUrlinst(String urlinst) {
        this.urlinst = urlinst;
    }

    public String getImginst() {
        return imginst;
    }

    public void setImginst(String imginst) {
        this.imginst = imginst;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBanner1() {
        return banner1;
    }

    public void setBanner1(String banner1) {
        this.banner1 = banner1;
    }

    public String getBanner2() {
        return banner2;
    }

    public void setBanner2(String banner2) {
        this.banner2 = banner2;
    }

    public String getBanner3() {
        return banner3;
    }

    public void setBanner3(String banner3) {
        this.banner3 = banner3;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }    
}