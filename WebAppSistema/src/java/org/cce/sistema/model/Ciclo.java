package org.cce.sistema.model;
// Generated 3/07/2020 02:30:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Ciclo generated by hbm2java
 */
public class Ciclo  implements java.io.Serializable {


     private Integer idCiclo;
     private String nombre;
     private Boolean estatus;
     private Set registros = new HashSet(0);

    public Ciclo() {
    }

    public Ciclo(String nombre, Boolean estatus, Set registros) {
       this.nombre = nombre;
       this.estatus = estatus;
       this.registros = registros;
    }
   
    public Integer getIdCiclo() {
        return this.idCiclo;
    }
    
    public void setIdCiclo(Integer idCiclo) {
        this.idCiclo = idCiclo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(Boolean estatus) {
        this.estatus = estatus;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}

