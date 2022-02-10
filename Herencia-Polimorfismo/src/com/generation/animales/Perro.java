package com.generation.animales;

public class Perro extends Animal implements Mascota{

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con la pelota");
		
	}

	@Override
	public void correr() {
		System.out.println("Estoy corriendo detras de un auto");
		
	}

	@Override
	public void baniar() {
		System.out.println("Estoy bañandome como perro");
		
	}
	

}
