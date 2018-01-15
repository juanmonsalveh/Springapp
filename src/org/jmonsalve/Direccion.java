package org.jmonsalve;

import org.springframework.stereotype.Component;

@Component
public class Direccion {
	
	private String calle;
	private String carrera;
	
	public Direccion() {
		
	}
	
	public Direccion(String calle, String carrera) {
		this.calle = calle;
		this.carrera = carrera;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", carrera=" + carrera + "]";
	}
	
	
	

}
