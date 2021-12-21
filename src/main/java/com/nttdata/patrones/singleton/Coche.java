package com.nttdata.patrones.singleton;

public class Coche {
	
	private String matricula;
	private static Coche instancia;
	
	private Coche(String matricula) {
		this.matricula = matricula;
	}
	
	public static Coche getInstance(String matricula) {
		if (instancia == null) {
			instancia = new Coche(matricula);
		}
		else {
			System.out.println("El objeto coche ya se ha instanciado.");
		}
		
		return instancia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
