package com.generation.animales;

public class Gato extends Animal implements Mascota{

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la caja");
		
	}

	@Override
	public void correr() {
		System.out.println("Estoy corriendo como gato");
		
	}

	@Override
	public void baniar() {
		System.out.println("Estoy bañandome con mi lengua");
		
	}
	
}
