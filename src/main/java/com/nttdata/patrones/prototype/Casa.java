package com.nttdata.patrones.prototype;

public abstract class Casa implements Cloneable {

	private int numHabitaciones;
	private String direccion;
	private int tamano;
	
	public Casa clone() throws CloneNotSupportedException {
		return (Casa) super.clone();
	}

	public abstract String verCasa();
	
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	
	
}
