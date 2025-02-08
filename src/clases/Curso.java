package clases;

import java.util.ArrayList;

public class Curso{
    //ATRIBUTOS
    private String nombreCurso;
    private Profesor profesor;
    private ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
    private static ArrayList<Curso> cursos = new ArrayList<Curso>();

    
    //CONSTRUCTORES
    public Curso(String nombreCurso, Profesor profesor, ArrayList<Estudiantes> estudiantes) {
        setNombreCurso(nombreCurso);
        setProfesor(profesor);
        setEstudiantes(estudiantes);

        cursos.add(this);
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

    public static void mostrarCursos(){
        System.out.println("=======CURSOS=======");
        for (Curso c : cursos) {
            System.out.printf("-- %s --\n", c.getNombreCurso().toUpperCase());
            System.out.println("PROFESOR:");
            System.out.println(c.profesor.getNombre());
            System.out.println("ESTUDIANTES:");
            for(Estudiantes est : c.estudiantes){
                System.out.println(est.toString());
            }
            System.out.println();
        }
    }

    //GETTERS & SETTERS
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

    //TOSTRING
    @Override
    public String toString() {
        return "Curso: " + this.nombreCurso + "\nProfesor: " + profesor.getNombre() + "\n";
    }
    
}
