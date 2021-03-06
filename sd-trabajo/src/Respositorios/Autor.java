
package Respositorios;

import java.io.Serializable;
import java.util.HashMap;

public class Autor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private int ip;
	@SuppressWarnings("unused")
	private String contraseņa;
	private HashMap<String, String> userPass = new HashMap<String, String>();

	private Autor() {
		this.nombre = null;
		this.apellidos = null;
		this.ip = 0;
		this.contraseņa = "admin";

	}

	private Autor(String nombre, String apellidos, int ip, String contraseņa) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ip = ip;
		this.contraseņa = contraseņa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public HashMap<String, String> getUserPass() {
		return userPass;
	}

	public void setUserPass(HashMap<String, String> userPass) {
		this.userPass = userPass;
	}

}
