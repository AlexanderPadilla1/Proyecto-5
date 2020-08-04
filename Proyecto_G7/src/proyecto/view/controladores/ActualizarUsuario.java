package proyecto.view.controladores;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

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
public class ActualizarUsuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@EJB
	private ServicioUsuario servicioUsuario;
	private List<String> countries;
	private String pais_seleccionado;
	private Usuario usuario;
	
	@PostConstruct
	public void init() {
		this.countries = this.servicioUsuario.countries();
		final FacesContext fc = FacesContext.getCurrentInstance();
		final String userId= fc.getExternalContext().getRequestParameterMap().get("userId");
		this.usuario=this.servicioUsuario.obtenerObjetoPorId(userId);
	}
	
	public void update () throws IOException {
		this.usuario.setPais(this.pais_seleccionado);
		this.servicioUsuario.update(this.usuario);
		final ExternalContext context= FacesContext.getCurrentInstance().getExternalContext();
		context.redirect("index.xhtml");		
		
	}
	
	
	public List<String> getCountries() {
		return countries;
	}
	public void setCountries(final List<String> countries) {
		this.countries = countries;
	}
	public String getPais_seleccionado() {
		return this.pais_seleccionado;
	}
	public void setPais_seleccionado(final String pais_seleccionado) {
		this.pais_seleccionado = pais_seleccionado;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
