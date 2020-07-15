package org.cce.sistema.bean;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.ServletContext;

import org.cce.sistema.dao.CatequizadoDao;
import org.cce.sistema.dao.DireccionDao;
import org.cce.sistema.dao.MunicipioDao;
import org.cce.sistema.dao.ParroquiaDao;
import org.cce.sistema.imp.CatequizadoDaoImp;
import org.cce.sistema.imp.DireccionDaoImp;
import org.cce.sistema.imp.MunicipioDaoImp;
import org.cce.sistema.imp.ParroquiaDaoImp;
import org.cce.sistema.model.Catequizado;
import org.cce.sistema.model.Direccion;
import org.cce.sistema.model.Municipio;
import org.cce.sistema.model.Parroquia;
import org.primefaces.context.RequestContext;
import org.primefaces.model.UploadedFile;

@Named("catequizado")
@ViewScoped
public class CatequizadoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Catequizado catequizado;
    private List<Catequizado> listaCatequizado;
    private UploadedFile file;
    private Path to;
    private String address;
    private String codigo;
    private String municipio;
    private String numero;
    private String lugar;
    private Direccion d;
    private Municipio m;
    private Parroquia p;
    private Catequizado catequizadoEditar;

    public CatequizadoBean() {
        this.catequizado = new Catequizado();
        this.d = new Direccion();
        this.m = new Municipio();
        this.p = new Parroquia();
        this.catequizadoEditar = new Catequizado();
    }

    public Catequizado getCatequizado() {
        return catequizado;
    }

    public void setCatequizado(Catequizado catequizado) {
        this.catequizado = catequizado;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public Path getTo() {
        return to;
    }

    public void setTo(Path to) {
        this.to = to;
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Direccion getD() {
        return d;
    }

    public void setD(Direccion d) {
        this.d = d;
    }

    public Municipio getM() {
        return m;
    }

    public void setM(Municipio m) {
        this.m = m;
    }

    public Parroquia getP() {
        return p;
    }

    public void setP(Parroquia p) {
        this.p = p;
    }

    public Catequizado getCatequizadoEditar() {
        return catequizadoEditar;
    }

    public void setCatequizadoEditar(Catequizado catequizadoEditar) {
        this.catequizadoEditar = catequizadoEditar;
    }

    public List<Catequizado> getListaCatequizado() {
        CatequizadoDao cDao = new CatequizadoDaoImp();
        listaCatequizado = cDao.lista();
        return listaCatequizado;
    }

    public void guardar() throws IOException {
        CatequizadoDao cDao = new CatequizadoDaoImp();
//		String fi = file.getFileName();
//		String nota = file.
//		System.out.println(fi);
//		File f = new File("/home/dmsistemas/Descargas/dnate.png");
//		@SuppressWarnings("resource")
//		InputStream is = new FileInputStream(file.getContents());
//		byte[] buffer = new byte[(int) f.length()];
//		int leer = is.read(buffer);

        // COLOCAMOS EL ID DEL LA DIRECCIÓN
        String[] dire;
        dire = this.address.split("_");
        this.d.setIdDireccion(Integer.parseInt(dire[1]));
        this.catequizado.setDireccion(d);

        // COLOCAMOS EL ID DEL MUNICIPIO
        String[] muni;
        muni = this.municipio.split("_");
        this.m.setIdMunicipio(Integer.parseInt(muni[1]));
        this.catequizado.setMunicipio(m);

        // COLOCAMOS EL ID DEL BAUTISMO
//		String[] bau;
//		bau = this.lugar.split("_");
//		this.p.setIdParroquia(Integer.parseInt(bau[2]));
//		this.catequizado.setParroquia(p);
        // COLOCAMOS LA FOTO
        catequizado.setFoto(file.getContents());

        // COLOCAMOS LA FECHA DE ALTA
        Date fechaAlta = new Date();
        this.catequizado.setFechaAlta(fechaAlta);

        this.catequizado.setEstado("Alta");

        cDao.guardar(catequizado);
        RequestContext.getCurrentInstance().update("frmPrincipal");
        RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
        this.catequizado = new Catequizado();
    }

    public void actualizar() {
        CatequizadoDao cDao = new CatequizadoDaoImp();
        cDao.actualizar(catequizado);
        // catequizado = new Catequizado();
    }

    public void imprimirDetalle(String idReg) {
        DetalleAlumno credencial = new DetalleAlumno();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        String ruta = servletContext.getRealPath("/QR/detalleAlumno.jasper");
        credencial.getCredencial(ruta, idReg);
        FacesContext.getCurrentInstance().responseComplete();
    }

    public List<String> completeDireccion(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        DireccionDao cDao = new DireccionDaoImp();
        resultNombre = cDao.listarDireccion(nombre);
        return resultNombre;
    }

    public List<String> completeMunicipio(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        MunicipioDao cDao = new MunicipioDaoImp();
        resultNombre = cDao.listarMunicipio(nombre);
        return resultNombre;
    }

    public List<String> completeParroquia(String nombre) {
        @SuppressWarnings("UnusedAssignment")
        List<String> resultNombre = new ArrayList<>();
        ParroquiaDao cDao = new ParroquiaDaoImp();
        resultNombre = cDao.listarParroquia(nombre);
        return resultNombre;
    }

}
