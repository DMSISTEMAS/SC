package org.cce.sistema.model;
// Generated 18/07/2020 09:51:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Catequizado generated by hbm2java
 */
public class Catequizado  implements java.io.Serializable {


     private Integer idCatequizado;
     private Direccion direccion;
     private Municipio municipio;
     private Parroquia parroquia;
     private String nombre;
     private String apellidoPaterno;
     private String apellidoMaterno;
     private String telefono;
     private String correo;
     private Date fechaNacimiento;
     private Date fechaAlta;
     private byte[] foto;
     private String nombrePapa;
     private String nombreMama;
     private String estado;
     private String observaciones;
     private Date fechaBautismo;
     private String registroEstado;
     private Set registros = new HashSet(0);

    public Catequizado() {
    }

    public Catequizado(Direccion direccion, Municipio municipio, Parroquia parroquia, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String correo, Date fechaNacimiento, Date fechaAlta, byte[] foto, String nombrePapa, String nombreMama, String estado, String observaciones, Date fechaBautismo, String registroEstado, Set registros) {
       this.direccion = direccion;
       this.municipio = municipio;
       this.parroquia = parroquia;
       this.nombre = nombre;
       this.apellidoPaterno = apellidoPaterno;
       this.apellidoMaterno = apellidoMaterno;
       this.telefono = telefono;
       this.correo = correo;
       this.fechaNacimiento = fechaNacimiento;
       this.fechaAlta = fechaAlta;
       this.foto = foto;
       this.nombrePapa = nombrePapa;
       this.nombreMama = nombreMama;
       this.estado = estado;
       this.observaciones = observaciones;
       this.fechaBautismo = fechaBautismo;
       this.registroEstado = registroEstado;
       this.registros = registros;
    }
   
    public Integer getIdCatequizado() {
        return this.idCatequizado;
    }
    
    public void setIdCatequizado(Integer idCatequizado) {
        this.idCatequizado = idCatequizado;
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
    public Parroquia getParroquia() {
        return this.parroquia;
    }
    
    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
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
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public byte[] getFoto() {
        return this.foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public String getNombrePapa() {
        return this.nombrePapa;
    }
    
    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }
    public String getNombreMama() {
        return this.nombreMama;
    }
    
    public void setNombreMama(String nombreMama) {
        this.nombreMama = nombreMama;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Date getFechaBautismo() {
        return this.fechaBautismo;
    }
    
    public void setFechaBautismo(Date fechaBautismo) {
        this.fechaBautismo = fechaBautismo;
    }
    public String getRegistroEstado() {
        return this.registroEstado;
    }
    
    public void setRegistroEstado(String registroEstado) {
        this.registroEstado = registroEstado;
    }
    public Set getRegistros() {
        return this.registros;
    }
    
    public void setRegistros(Set registros) {
        this.registros = registros;
    }




}

