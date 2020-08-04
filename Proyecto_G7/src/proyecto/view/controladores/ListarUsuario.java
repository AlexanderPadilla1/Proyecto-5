package proyecto.view.controladores;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import proyecto.view.modelo.Usuario;
import proyecto.view.servicio.ServicioUsuario;

@Named
@ViewScoped
public class ListarUsuario implements Serializable{


	private static final long serialVersionUID = 1L;
    @EJB
    private ServicioUsuario servicioUsuario;
    private List<Usuario> listaUsuarios;
    
    @PostConstruct
    public void init() {
        this.listaUsuarios = this.servicioUsuario.list();
    }
    
    public List<Usuario> getListaUsuarios() {
        return this.listaUsuarios;
    }
    
    public void setListaUsuarios(final List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}