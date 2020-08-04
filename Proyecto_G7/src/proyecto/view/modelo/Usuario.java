package proyecto.view.modelo;

import java.util.List;

public class Usuario {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String edad;
	private String pais;
	private String ci;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getPais() {
		return this.pais;
	}
	public void setPais(final String pais) {
		this.pais = pais;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	
	
	
	


}
