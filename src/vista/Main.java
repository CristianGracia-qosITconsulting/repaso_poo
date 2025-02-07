package vista;

import java.util.ArrayList;

import clases.Curso;
import clases.Direccion;
import clases.Estudiantes;
import clases.Persona;
import clases.Profesor;

public class Main {
    public static void main(String[] args) throws Exception {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
        ejercicio9();

    }

    static void ejercicio1() {
        Persona persona = new Persona("Juan", 20);
        System.out.println(persona.toString());
    }

    static void ejercicio2() {
        Persona persona = new Persona("Juan", 20);
        Persona persona2 = new Persona("Juan", 25);
        persona2.setEdad(20);

        System.out.println(persona.equals(persona2));
    }

    static void ejercicio3() {
        Persona p = new Estudiantes("Evaristo", 80,"Medicina");
        System.out.println(p.toString());
    }

    static void ejercicio4() {
        Estudiantes p = new Estudiantes("Evaristo", 80,"Medicina");
        System.out.println(p.estudiar());
    }

    static void ejercicio5() {
        Profesor p = new Profesor("Edmundo", 55, "Religión");
        p.trabajar();
    }

    static void ejercicio6(){
        Persona p = new Profesor("María", 50, "Lengua italiana");
        Persona e = new Estudiantes("Juan", 20,"Filología");
        Persona pe = new Persona("Antonio", 30);

        Persona[] arRPersonas = {pe, e, p};

        for(Persona el : arRPersonas){
            el.mostrarInformacion();
            System.out.println();
        }
    }

    static void ejercicio7(){
        Persona p = new Persona("Pedro", 29, new Direccion("Calle Chipiona", "Cádiz", "11560"));
        p.mostrarDirección();
    }

    static void ejercicio8(){
        Persona personaMayor = new Persona("Consolación", 84);
        Persona personaAdulta = new Persona("Daniel", 31);
        Persona personaJoven = new Persona("Rodrigo", 20);
        Persona personaJoven2 = new Persona("Daniel", 20);

        System.out.println(personaMayor.compareTo(personaJoven));
        System.out.println(personaJoven.compareTo(personaJoven2));
        System.out.println(personaAdulta.compareTo(personaMayor));
    }

    public static void ejercicio9(){
        Curso c1 = new Curso("Curso1");

        Estudiantes e1 = new Estudiantes("Carlos", 27, "Medicina");
        Estudiantes e2 = new Estudiantes("Juan", 29, "Medicina");
        Estudiantes e3 = new Estudiantes("Susana", 21, "Medicina");


        Estudiantes[] listaEstudiantes = {e1,e2};
        c1.matricularEstudiantes(listaEstudiantes);
        c1.matricularEstudiantes(e3);

        Profesor profesor = new Profesor("Joaquin", 54, "Medicina");
        c1.setProfesor(profesor);

        c1.mostrarEstudiantes();
        c1.mostrarProfesor();


        Estudiantes ee1 = new Estudiantes("Juan Carlos", 21, "Arquitectura");
        Estudiantes ee2 = new Estudiantes("Ramón", 23, "Arquitectura");
        Estudiantes ee3 = new Estudiantes("María", 25, "Arquitectura");

        ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        estudiantes.add(ee1); estudiantes.add(ee2); estudiantes.add(ee3);
        Profesor p = new Profesor("Adolfo", 41, "Arquitecto");

        Curso c2 = new Curso("Curso2", p, estudiantes);

        System.out.println("====LISTA DE CURSOS====");
        Curso.mostrarCursos();

        //CAMBIO NOMBRE DE CURSO1 Y VUELVO A IMPRIMIR LA LISTA DE CURSOS;
        System.out.println("====LISTA DE CURSOS====");
        c1.setNombreCurso("Curso cambiado");
        Curso.mostrarCursos();


        
    }
}
