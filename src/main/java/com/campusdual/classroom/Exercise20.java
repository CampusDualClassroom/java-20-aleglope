package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Exercise20} proporciona métodos para crear una lista de objetos de tipo {@code Person}
 * y sus subclases, y para mostrar los detalles de cada persona en la lista.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y poblar una lista con objetos {@code Person}, {@code Teacher}, {@code PoliceOfficer} y {@code Doctor}.</li>
 *     <li>Recorrer la lista y mostrar los detalles de cada persona.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class Exercise20 {

    /**
     * Crea y retorna una lista de personas, incluyendo instancias de {@code Person}, {@code Teacher},
     * {@code PoliceOfficer} y {@code Doctor}.
     * <p>
     * Inicializa la lista como un {@code ArrayList}, añade los objetos especificados y retorna la lista.
     * </p>
     *
     * @return Una lista poblada con objetos de tipo {@code Person} y sus subclases.
     */
    public static List<Person> getPeopleList() {
        // Inicializar la lista como ArrayList
        List<Person> peopleList = new ArrayList<>();

        // Crear y añadir los objetos a la lista
        // Primer elemento: objeto Person → John Smith
        Person person = new Person("John", "Smith");
        peopleList.add(person);

        // Segundo elemento: objeto Teacher → María Montessori, Área: Educación
        Teacher teacher = new Teacher("María", "Montessori", "Educación");
        peopleList.add(teacher);

        // Tercer elemento: objeto PoliceOfficer → Jake Peralta, Squad: B-99
        PoliceOfficer policeOfficer = new PoliceOfficer("Jake", "Peralta", "B-99");
        peopleList.add(policeOfficer);

        // Cuarto elemento: objeto Doctor → Gregory House, Especialización: Nefrología e infectología
        Doctor doctor = new Doctor("Gregory", "House", "Nefrología e infectología");
        peopleList.add(doctor);

        return peopleList;
    }

    /**
     * Recorre la lista de personas y muestra los detalles de cada una de ellas.
     * <p>
     * Para cada objeto en la lista, se invoca el método {@code getDetails()} que muestra la información
     * específica de cada persona.
     * </p>
     *
     * @param peopleList La lista de objetos de tipo {@code Person} y sus subclases.
     */
    public static void showPeopleDetails(List<Person> peopleList) {
        // Recorrer cada persona en la lista y mostrar sus detalles
        for (Person person : peopleList) {
            person.getDetails();
        }
    }

    /**
     * Punto de entrada del programa que demuestra la creación de una lista de personas y la
     * visualización de sus detalles.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear y poblar la lista de personas
        List<Person> peopleList = getPeopleList();

        // Mostrar los detalles de cada persona en la lista
        showPeopleDetails(peopleList);
    }
}
