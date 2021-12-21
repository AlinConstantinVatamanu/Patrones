package com.nttdata.patrones.builder;

public class MonitorBuilder implements IBuilder {

	private int precio;
	private int pulgadas;
	private String marca;
	
	
	public MonitorBuilder conPrecio(int precio) {
		this.precio = precio;
		return this;
	}
	
	public MonitorBuilder conPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
		return this;
	}
	public MonitorBuilder conMarca(String marca) {
		this.marca = marca;
		return this;
	}
	
	
	@Override
	public Monitor build() {
		Monitor monitor = new Monitor();
		monitor.setPrecio(this.precio);
		monitor.setPulgadas(this.pulgadas);
		monitor.setMarca(this.marca);
		return monitor;
	}

}
