package org.cce.sistema.model;
// Generated 14/07/2020 11:18:25 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private Integer idDireccion;
     private String calle;
     private Set catequistas = new HashSet(0);
     private Set catequizados = new HashSet(0);

    public Direccion() {
    }

    public Direccion(String calle, Set catequistas, Set catequizados) {
       this.calle = calle;
       this.catequistas = catequistas;
       this.catequizados = catequizados;
    }
   
    public Integer getIdDireccion() {
        return this.idDireccion;
    }
    
    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public Set getCatequistas() {
        return this.catequistas;
    }
    
    public void setCatequistas(Set catequistas) {
        this.catequistas = catequistas;
    }
    public Set getCatequizados() {
        return this.catequizados;
    }
    
    public void setCatequizados(Set catequizados) {
        this.catequizados = catequizados;
    }




}


