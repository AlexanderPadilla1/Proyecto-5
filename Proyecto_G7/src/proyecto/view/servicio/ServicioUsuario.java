package proyecto.view.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import proyecto.view.modelo.Usuario;

@Stateless
public class ServicioUsuario {
	
	private List<Usuario> usuarios;
	
	public ServicioUsuario() {
		this.usuarios = new ArrayList<Usuario>();
			}

	public void create (final Usuario usuario) {
		usuario.setId(this.usuarios.size() + 1);
		this.usuarios.add(usuario);
		
	}
	
	public void update (final Usuario usuario) {
		usuario.setNombre(usuario.getNombre());
		usuario.setApellido(usuario.getApellido());
		usuario.setEdad(usuario.getEdad());
		usuario.setPais(usuario.getPais());
		usuario.setId(usuario.getId());
		
	}
	
	public List <Usuario> list() {
		return this.usuarios;
		
	}
	
	public List<String> countries () {
		final List<String> countries = new ArrayList<String>();
		countries.add("Venezuela");
		countries.add("Colombia");
		countries.add("Ecuador");
		countries.add("Perú");
		return countries;
				
	}
	
	
	public void delete (final Usuario usuario) {
		System.out.println("Usuario Eliminado");
		this.usuarios.remove(usuario);
		
	}
	
	public Usuario obtenerObjetoPorId(final String userId) {
		return this.usuarios.get(Integer.parseInt(userId) - 1);
	}
	
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(final List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
