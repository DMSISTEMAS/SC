package org.cce.sistema.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.ParroquiaDao;
import org.cce.sistema.imp.ParroquiaDaoImp;
import org.cce.sistema.model.Parroquia;

@Named("parroquia")
@ViewScoped
public class ParroquiaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Parroquia> lista;
	private Parroquia parroquia;

	public ParroquiaBean() {
		this.lista = new ArrayList<>();
		this.parroquia = new Parroquia();
	}

	public Parroquia getParroquia() {
		return parroquia;
	}

	public void setParroquia(Parroquia parrroquia) {
		this.parroquia = parrroquia;
	}

	public List<Parroquia> getLista() {
		ParroquiaDao bDao = new ParroquiaDaoImp();
		this.lista = bDao.lista();
		return lista;
	}

	public void guardar() {
		ParroquiaDao bDao = new ParroquiaDaoImp();
		bDao.guardar(parroquia);
		this.parroquia = new Parroquia();
	}

	public void actualizar() {
		ParroquiaDao bDao = new ParroquiaDaoImp();
		bDao.actualizar(parroquia);
		this.parroquia = new Parroquia();
	}

}
