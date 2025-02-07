package clases;

import interfaces.Trabajador;

public class Profesor extends Persona implements Trabajador{
    private String especialidad;

    public Profesor(String nombre, int edad, Direccion direccion, String especialidad) {
        super(nombre, edad, direccion);
        setEspecialidad(especialidad);
    }
    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        setEspecialidad(especialidad); 
        setDireccion(null);
    }

    public void mostrarInformacion(){
        System.out.println("Profesor");
        trabajar();
    }


    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.printf("%s está enseñando %s.", this.getNombre(), this.especialidad);
    }
    @Override
    public String toString() {
        return "Profesor [especialidad: " + especialidad + ", Nombre: " + getNombre() + ", Edad: " + getEdad()
                + "]";
    }


}
