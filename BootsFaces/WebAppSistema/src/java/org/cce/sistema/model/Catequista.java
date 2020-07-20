package org.cce.sistema.model;
// Generated 18/07/2020 09:51:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Catequista generated by hbm2java
 */
public class Catequista  implements java.io.Serializable {


     private Integer idCatequista;
     private Direccion direccion;
     private Municipio municipio;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String telefono;
     private Date fechaNacimiento;
     private String foto;
     private Integer idCodigo;
     private Integer numero;
     private Set registros = new HashSet(0);

    public Catequista() {
    }

    public Catequista(Direccion direccion, Municipio municipio, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Date fechaNacimiento, String foto, Integer idCodigo, Integer numero, Set registros) {
       this.direccion = direccion;
       this.municipio = municipio;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.telefono = telefono;
       this.fechaNacimiento = fechaNacimiento;
       this.foto = foto;
       this.idCodigo = idCodigo;
       this.numero = numero;
       this.registros = registros;
    }
   
    public Integer getIdCatequista() {
        return this.idCatequista;
    }
    
    public void setIdCatequista(Integer idCatequista) {
        this.idCatequista = idCatequista;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return this.apellidoMaterno;
    }
    
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Integer getIdCodigo() {
        return this.idCodigo;
    }
    
    public void setIdCodigo(Integer idCodigo) {
        this.idCodigo = idCodigo;
    }
    public Integer getNumero() {
        return this.numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}

