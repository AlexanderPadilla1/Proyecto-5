package proyecto.view.controladores;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import proyecto.view.modelo.Usuario;
import proyecto.view.servicio.ServicioUsuario;

@Named
@ViewScoped
public class EliminarUsuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServicioUsuario servicioUsuario;
	private Usuario usuario;
	
	@PostConstruct
	public void init() {
		final FacesContext fc = FacesContext.getCurrentInstance();
		final String userId= fc.getExternalContext().getRequestParameterMap().get("userId");
		this.usuario=this.servicioUsuario.obtenerObjetoPorId(userId);
	}
	
	public void delete () throws IOException {
		this.servicioUsuario.delete(this.usuario);
		final ExternalContext context=FacesContext.getCurrentInstance().getExternalContext();
		context.redirect("index.xhtml");		
				
	}

	
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
