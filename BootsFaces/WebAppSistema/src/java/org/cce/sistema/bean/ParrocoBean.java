package org.cce.sistema.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.cce.sistema.dao.ParrocoDao;
import org.cce.sistema.imp.ParrocoDaoImp;
import org.cce.sistema.model.Parroco;
import org.primefaces.context.RequestContext;

@Named("parroco")
@ViewScoped
public class ParrocoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Parroco parroco;
	private List<Parroco> lista;

	public ParrocoBean() {
		this.parroco = new Parroco();
		this.lista = new ArrayList<>();
	}

	public Parroco getParroco() {
		return parroco;
	}

	public void setParroco(Parroco parroco) {
		this.parroco = parroco;
	}

	public List<Parroco> getLista() {
		ParrocoDao pDao = new ParrocoDaoImp();
		this.lista = pDao.lista();
		return lista;
	}

	public void guardar() {
		ParrocoDao pDao = new ParrocoDaoImp();
		pDao.guardar(parroco);
		this.parroco = new Parroco();
		RequestContext.getCurrentInstance().update("frmPrincipal");
		RequestContext.getCurrentInstance().execute("PF('dlgAgregar').hide()");
	}

	public void actualizar() {
		ParrocoDao pDao = new ParrocoDaoImp();
		pDao.actualizar(parroco);
		this.parroco = new Parroco();
	}

}
