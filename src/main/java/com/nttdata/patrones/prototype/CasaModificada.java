package com.nttdata.patrones.prototype;

public class CasaModificada extends Casa {
	
	@Override
	public String verCasa() {
		return "Dirección: " + this.getDireccion() + "; Número habitaciones: " + this.getNumHabitaciones() + "; Tamaño: " + this.getTamano();
	}
	
}
