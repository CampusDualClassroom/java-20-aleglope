package com.campusdual.classroom;

/**
 * La clase {@code Doctor} representa a un médico con una especialización específica.
 * <p>
 * Hereda de la clase {@code Person} y añade una propiedad adicional para la especialización.
 * </p>
 *
 * @version 1.0
 */
public class Doctor extends Person {

	protected String specialization;

	/**
	 * Constructor de la clase {@code Doctor}.
	 *
	 * @param name           El nombre del médico.
	 * @param surname        El apellido del médico.
	 * @param specialization La especialización del médico.
	 */
	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	/**
	 * Muestra los detalles del médico, incluyendo su especialización.
	 * <p>
	 * Sobrescribe el método {@code getDetails()} de la clase {@code Person}.
	 * </p>
	 */
	@Override
	public void getDetails() {
		System.out.println("Doctor " + name + " " + surname + ", especialista en " + specialization.toLowerCase());
	}
}
