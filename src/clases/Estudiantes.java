package clases;

import excepciones.DniException;
import excepciones.EdadException;
import excepciones.NombreException;

public class Estudiantes extends Persona{
    //ATRIBUTOS
    private String carrera;
    
    //CONSTRUCTORES
    public Estudiantes(String nombre, String edad, String dni, Direccion direccion, String carrera)
    throws NombreException, EdadException, DniException {
        super(nombre, edad, dni, direccion);
        this.setCarrera(carrera);
    }

    //METODOS
    public void mostrarInformacion(){
        System.out.println("Estudiante");
    }

    
    public String estudiar(){
        return this.getNombre() + " está estudiando " + this.getCarrera();
    }

    //GETTERS & SETTERS
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //TO STRING
    @Override
    public String toString() { 
        return "Nombre: " + this.getNombre() + "\nEdad: " + this.getEdad() + "\nDNI: " + this.getDni() + 
        "\nCarrera: " + this.carrera + "\n";
    }

    
}
