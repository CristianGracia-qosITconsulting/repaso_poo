package clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Curso{
    // ATRIBUTOS
    private String nombreCurso;
    private Profesor profesor;
    private ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
    
    // CONSTRUCTORES
    public Curso(String nombreCurso) {
        setNombreCurso(nombreCurso);
    }

    public Curso(String nombreCurso, Profesor profesor, ArrayList<Estudiantes> estudiantes) {
        setNombreCurso(nombreCurso);
        setProfesor(profesor);
        setEstudiantes(estudiantes);
    }
    //METODOS
    public void matricularEstudiantes(Estudiantes e){
        this.estudiantes.add(e);
    }
    public void matricularEstudiantes(Estudiantes[] e){
        for(Estudiantes est : e){
            this.estudiantes.add(est);
        }
    }

    public void mostrarEstudiantes(){
        for (Estudiantes es : this.estudiantes) {
            System.out.println(es.toString());
        }
    }

    public void mostrarProfesor(){
        System.out.println(this.profesor.toString());
    }

    // GETTERS & SETTERS
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // TO STR
    @Override
    public String toString() {
        return "Curso [nombreCurso=" + nombreCurso + ", profesor=" + profesor + ", estudiantes="
                + estudiantes.toString() + "]";
    }
    
}
