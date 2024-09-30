package com.campusdual.classroom;

/**
 * La clase {@code PoliceOfficer} representa a un oficial de policía con una unidad específica.
 * <p>
 * Hereda de la clase {@code Person} y añade una propiedad adicional para el squad.
 * </p>
 *
 * @version 1.0
 */
public class PoliceOfficer extends Person {

	protected String squad;

	/**
	 * Constructor de la clase {@code PoliceOfficer}.
	 *
	 * @param name     El nombre del oficial de policía.
	 * @param surname  El apellido del oficial de policía.
	 * @param squad    El squad al que pertenece el oficial de policía.
	 */
	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	/**
	 * Muestra los detalles del oficial de policía, incluyendo su squad.
	 * <p>
	 * Sobrescribe el método {@code getDetails()} de la clase {@code Person}.
	 * </p>
	 */
	@Override
	public void getDetails() {
		System.out.println("Oficial de Policía " + name + " " + surname + ", Squad: " + squad);
	}
}
