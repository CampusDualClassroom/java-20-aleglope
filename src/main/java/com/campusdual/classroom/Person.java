package com.campusdual.classroom;

/**
 * La clase {@code Person} representa una persona con nombre y apellido.
 * <p>
 * Incluye un método para mostrar los detalles básicos de la persona.
 * </p>
 *
 * @version 1.0
 */
public class Person {
	protected String name;
	protected String surname;

	/**
	 * Constructor de la clase {@code Person}.
	 *
	 * @param name     El nombre de la persona.
	 * @param surname  El apellido de la persona.
	 */
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	/**
	 * Muestra los detalles básicos de la persona.
	 * <p>
	 * Este método será heredado por las subclases y puede ser sobrescrito para proporcionar detalles
	 * adicionales específicos.
	 * </p>
	 */
	public void getDetails() {
		System.out.println("Nombre completo: " + name + " " + surname);
	}
}
