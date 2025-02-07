package clases;

public class Estudiantes extends Persona{
    
    private String carrera;

    public Estudiantes(String nombre, int edad, Direccion direccion, String carrera) {
        super(nombre, edad, direccion);
        this.setCarrera(carrera);
    }
    public Estudiantes(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.setCarrera(carrera);
        this.setDireccion(null);
    }

    public void mostrarInformacion(){
        System.out.println("Estudiante");
    }

    
    public String estudiar(){
        return this.getNombre() + " está estudiando " + this.getCarrera();
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String toString() { 
        return "Estudiantes [" + super.toString() + "carrera=" + this.carrera + "]";
    }

    
}
