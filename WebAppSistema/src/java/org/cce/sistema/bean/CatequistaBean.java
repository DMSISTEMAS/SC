package org.cce.sistema.bean;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.CatequistaDao;
import org.cce.sistema.imp.CatequistaDaoImp;
import org.cce.sistema.model.Catequista;
import org.primefaces.context.RequestContext;

import java.io.Serializable;
import java.util.ArrayList;
import org.cce.sistema.dao.CodigoDao;
import org.cce.sistema.dao.DireccionDao;
import org.cce.sistema.dao.MunicipioDao;
import org.cce.sistema.dao.NumeroDao;
import org.cce.sistema.imp.CodigoDaoImp;
import org.cce.sistema.imp.DireccionDaoImp;
import org.cce.sistema.imp.MunicipioDaoImp;
import org.cce.sistema.imp.NumeroDaoImp;
import org.cce.sistema.model.Codigo;
import org.cce.sistema.model.Direccion;
import org.cce.sistema.model.Municipio;
import org.cce.sistema.model.Numero;

@Named("catequista")
@ViewScoped
public class CatequistaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Catequista catequista;
    private List<Catequista> listaCatequista;
    private String address;
    private String codigo;
    private String municipio;
    private String numero;
    private Direccion d;
    private Numero n;
    private Codigo c;
    private Municipio m;

    public CatequistaBean() {
        this.catequista = new Catequista();
        this.d = new Direccion();
        this.n = new Numero();
        this.c = new Codigo();
        this.m = new Municipio();
    }

    public Catequista getCatequista() {
        return catequista;
    }

    public void setCatequista(Catequista catequista) {
        this.catequista = catequista;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Direccion getD() {
        return d;
    }

    public void setD(Direccion d) {
        this.d = d;
    }

    public Numero getN() {
        return n;
    }

    public void setN(Numero n) {
        this.n = n;
    }

    public Codigo getC() {
        return c;
    }

    public void setC(Codigo c) {
        this.c = c;
    }

    public Municipio getM() {
        return m;
    }

    public void setM(Municipio m) {
        this.m = m;
    }

    public List<Catequista> getListaCatequista() {
        CatequistaDao cDao = new CatequistaDaoImp();
        listaCatequista = cDao.lista();
        return listaCatequista;
    }

    public void guardar() {
        CatequistaDao cDao = new CatequistaDaoImp();

        // COLOCAMOS EL ID DEL LA DIRECCIÓN
        String[] dire;
        dire = this.address.split("_");
        this.d.setIdDireccion(Integer.parseInt(dire[1]));
        this.catequista.setDireccion(d);

        // COLOCAMOS EL ID DEL NÚMERO
        String[] nume;
        nume = this.numero.split("_");
        this.n.setIdNumero(Integer.parseInt(nume[1]));
        this.catequista.setNumero(n);

        // COLOCAMOS EL ID DEL CÓDIGO
        String[] code;
        code = this.codigo.split("_");
        this.c.setIdCodigo(Integer.parseInt(code[1]));
        this.catequista.setCodigo(c);

        // COLOCAMOS EL ID DEL MUNICIPIO
        String[] muni;
        muni = this.municipio.split("_");
        this.m.setIdMunicipio(Integer.parseInt(muni[1]));
        this.catequista.setMunicipio(m);
        

        cDao.guardar(catequista);
        this.catequista = new Catequista();
        RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
        RequestContext.getCurrentInstance().update("frmPrincipal");
    }

    public List<String> completeDireccion(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        DireccionDao cDao = new DireccionDaoImp();
        resultNombre = cDao.listarDireccion(nombre);
        return resultNombre;
    }

    public List<String> completeCodigo(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        CodigoDao cDao = new CodigoDaoImp();
        resultNombre = cDao.listarCodigo(nombre);
        return resultNombre;
    }

    public List<String> completeMunicipio(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        MunicipioDao cDao = new MunicipioDaoImp();
        resultNombre = cDao.listarMunicipio(nombre);
        return resultNombre;
    }

    public List<String> completeNumero(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        NumeroDao cDao = new NumeroDaoImp();
        resultNombre = cDao.listarNumero(nombre);
        return resultNombre;
    }

}
