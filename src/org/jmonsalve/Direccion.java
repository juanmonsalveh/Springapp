package org.jmonsalve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

	@Autowired
	public void setCalle(@Value("falsa")String calle) {
		this.calle = calle;
	}
	public String getCarrera() {
		return carrera;
	}
	
	@Autowired
	public void setCarrera(@Value("123")String carrera) {
		this.carrera = carrera;
	}
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", carrera=" + carrera + "]";
	}
	
	
	

}
