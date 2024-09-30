package com.campusdual.classroom;

/**
 * La clase {@code Teacher} representa a un maestro con un área de especialización.
 * <p>
 * Hereda de la clase {@code Person} y añade una propiedad adicional para el área.
 * </p>
 *
 * @version 1.0
 */
public class Teacher extends Person {

	protected String area;

	/**
	 * Constructor de la clase {@code Teacher}.
	 *
	 * @param name     El nombre del maestro.
	 * @param surname  El apellido del maestro.
	 * @param area     El área de especialización del maestro.
	 */
	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	/**
	 * Muestra los detalles del maestro, incluyendo su área de especialización.
	 * <p>
	 * Sobrescribe el método {@code getDetails()} de la clase {@code Person}.
	 * </p>
	 */
	@Override
	public void getDetails() {
		System.out.println("Maestro " + name + " " + surname + ", Área: " + area);
	}
}
