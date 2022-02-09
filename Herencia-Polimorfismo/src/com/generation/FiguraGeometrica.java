package com.generation;

public class FiguraGeometrica {
	protected String nombre;
	protected float alto;
	protected float ancho;
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	protected float calcularArea() {
		return this.alto*this.ancho;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return this.alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getAncho() {
		return this.ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}
}
