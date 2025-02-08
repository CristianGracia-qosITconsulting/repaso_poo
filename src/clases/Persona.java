package clases;

import java.util.ArrayList;

import excepciones.DniException;
import excepciones.EdadException;
import excepciones.NombreException;

public class Persona{
    // ATRIBUTOS
    private String nombre, edad, dni;
    private Direccion direccion;
    private static ArrayList<Persona> personas = new ArrayList<Persona>();

    //CONSTRUCTORES
    public Persona(String nombre, String edad, String dni, Direccion direccion)
    throws NombreException, EdadException, DniException {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setDni(dni);
        this.setDireccion(direccion);

        personas.add(this);
    }

    //METODOS

    public void mostrarDirección(){
        System.out.printf("""
                Calle: %s
                Ciudad: %s
                Codigo Postal: %s
                """, this.direccion.getCalle(), this.direccion.getCiudad(), this.direccion.getCodigoPostal());
        System.out.println();
    }

    static public void mostrarPersonas(){
        System.out.println("======PERSONAS======");
        for (Persona p : personas) {
            System.out.println(p.toString());
        }
    }

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreException{
        if(nombre.length() > 20) throw new NombreException();

        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);
            if (!Character.isLetter(caracter)) throw new NombreException();
        }

        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) throws EdadException{
        int edadInt;
        try{
            edadInt = Integer.parseInt(edad);
        }catch(Exception e){
            throw new EdadException();
        }

        if (edadInt < 10 && edadInt > 90) throw new EdadException();

        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniException {

        if (dni.length() != 9) throw new DniException("DNI invalido");

        int numDni;
        char letra;
        try {
            letra = dni.charAt(dni.length()-1);
            numDni = Integer.parseInt(dni.substring(0, dni.length()-1));
        } catch (Exception e) {
            throw new DniException("DNI invalido");
        }
        /* 
        String letras = "TRWAGMYFPDXBNJZSOVHLCKE";     
        int posLetra = numDni%23;
        if (letras.charAt(posLetra) != letra) throw new DniException();
        */

        for (Persona p : Persona.personas) {
            if (p.dni.equals(dni)) {
                throw new DniException("Este DNI ya está registrado");
            }
        }
        this.dni = dni;
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
        result = prime * result + ((edad == null) ? 0 : edad.hashCode());
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
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
        if (edad == null) {
            if (other.edad != null)
                return false;
        } else if (!edad.equals(other.edad))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        return true;
    }
    //TOSTRING
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad + "DNI: " + this.dni + "\n";
    }

}
