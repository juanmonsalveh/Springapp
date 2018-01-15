package org.jmonsalve;

import org.springframework.beans.factory.annotation.Autowired;

public class Administrador {

	private int idAdmin;
	private String name;
	@Autowired
	private Direccion direccion;
	

	public Administrador() {
	}
	
	public Administrador(int idAdmin, String name){
		this.idAdmin = idAdmin;
		this.name = name;
	}
	
	public Administrador(int idAdmin, String name, Direccion direccion){
		this.idAdmin = idAdmin;
		this.name = name;
		this.direccion = direccion;
	}
	
	public void imprimirDireccion(){
		System.out.println(this.name+": \"Mi direccion es: lalala\"");
	}
	

	
	@Override
	public String toString() {
		return "Administrador [idAdmin=" + idAdmin + ", name=" + name + ", direccion=" + direccion + "]\n";
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Direccion getDireccion() {
		return direccion;
	}
	
	//@Autowired//, bien puede ser en el setter o en el mismo parametro
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
}
