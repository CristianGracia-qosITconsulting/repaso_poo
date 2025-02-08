package clases;

import excepciones.DniException;
import excepciones.EdadException;
import excepciones.NombreException;

public class Profesor extends Persona{
    //ATRIBUTOS
    private String especialidad;

    //CONSTRUCTORES
    public Profesor(String nombre, String edad, String dni, Direccion direccion, String especialidad)
    throws NombreException, EdadException, DniException {
        super(nombre, edad, dni, direccion);
        setEspecialidad(especialidad);
    }
    //MÉTODOS

    //GETTERS & SETTERS
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nDNI: " + this.getDni() + 
        "\nEspecialidad: " + this.especialidad + "\n";
    }


}
