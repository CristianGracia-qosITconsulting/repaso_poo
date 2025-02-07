package clases;

public class Persona implements Comparable {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private Direccion direccion;

    // CONSTRUCTORES
    public Persona(String nombre, int edad, Direccion direccion) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDireccion(direccion);
    }

    public Persona(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDireccion(null);
    }

    // METODOS
    public void mostrarInformacion(){
        System.out.println("Persona");
    }

    public void mostrarDirección(){
        System.out.println(this.direccion.toString());
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    // HASHCODE & EQUALS

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + edad;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }


    //TOSTRING

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad+"]";
    }

    @Override
    public int compareTo(Object o) {
        Persona objPersona = ((Persona) o);
        
        if(this.edad == objPersona.getEdad()) return 0;
       
        if(this.edad > objPersona.getEdad()) return 1;
        else return -1;
    }

}
