package vista;

import java.util.ArrayList;

import clases.Curso;
import clases.Direccion;
import clases.Estudiantes;
import clases.Persona;
import clases.Profesor;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("======EJERCICIO 1======");
        ejercicio1();
        System.out.println("======EJERCICIO 2======");
        ejercicio2();
        System.out.println("======EJERCICIO 3======");
        ejercicio3();
        System.out.println("======EJERCICIO 4======");
        ejercicio4();
        System.out.println("======EJERCICIO 5======");
        ejercicio5();
        System.out.println("======EJERCICIO 6======");
        ejercicio6();
        System.out.println("======EJERCICIO 7======");
        ejercicio7();
        System.out.println("======EJERCICIO 8======");
        ejercicio8();
        System.out.println("======EJERCICIO 9======");
        ejercicio9();

    }


    static void ejercicio1() {

        Persona persona = new Persona("Juan", 20); // Instancia de clase Persona.
        System.out.println(persona.toString()); // Llamada al método toString()

        System.out.println();
    }

    static void ejercicio2() {
        Persona persona = new Persona("Juan", 20);
        Persona persona2 = new Persona("Juan", 25);
        
        // uso de hashcode y equals para que objetos sean iguales si coinciden en los valores.
        System.out.println(persona.equals(persona2)); //false
        
        persona2.setEdad(20);  //Uso de setter

        System.out.println(persona.equals(persona2)); //true

        System.out.println();
    }

    static void ejercicio3() {

        //instancia de Estudiantes que hereda de Persona
        Persona p = new Estudiantes("Evaristo", 80,"Medicina");
        System.out.println(p.toString()); //toString de Estudiante

        System.out.println();
    }

    static void ejercicio4() {
        Estudiantes p = new Estudiantes("Evaristo", 80,"Medicina");
        System.out.println(p.estudiar()); //llamada al método estudiar desde el objeto "p"

        System.out.println();
    }

    static void ejercicio5() {
        Profesor p = new Profesor("Edmundo", 55, "Religión");
        //Llamada al método trabajar() que es un método de la interfaz Trabajador que implementa Profesor
        p.trabajar(); 

        System.out.println();
    }

    static void ejercicio6(){
        Persona p = new Profesor("María", 50, "Lengua italiana");
        Persona e = new Estudiantes("Juan", 20,"Filología");
        Persona pe = new Persona("Antonio", 30);

        //creo un array de tipo Persona e introduzco objetos de Persona y que hereden de Persona.
        Persona[] arRPersonas = {pe, e, p};

        /*
         * Recorro el array en un for each y llamo al método mostrarInformación() con cada objeto
         * Este será diferente dependiendo de la clase debido al polimorfismo.
        */
        for(Persona el : arRPersonas){
            el.mostrarInformacion(); 
            System.out.println();
        }

        System.out.println();
    }

    static void ejercicio7(){
        // creo un objeto de la clase persona llamando a un constructor que pide un objeto de Direccion.
        Persona p = new Persona("Pedro", 29, new Direccion("Calle Chipiona", "Cádiz", "11560"));
        // imprimo el objeto direccion (en este caso, el método contiene un toString de dirección)
        p.mostrarDirección(); 

        System.out.println();
    }

    static void ejercicio8(){
        Persona personaMayor = new Persona("Consolación", 84);
        Persona personaAdulta = new Persona("Daniel", 31);
        Persona personaJoven = new Persona("Rodrigo", 20);
        Persona personaJoven2 = new Persona("Daniel", 20);

        /*
         *implementé en la clase Persona la interfaz comparable.
         * Comparo las edades de los objetos y dependiendo si es mayor, menor o igual
         * devuelven 1,-1 o 0 respectivamente.
         */
        System.out.println(personaMayor.compareTo(personaJoven));
        System.out.println(personaJoven.compareTo(personaJoven2));
        System.out.println(personaAdulta.compareTo(personaMayor));

        System.out.println();
    }

    public static void ejercicio9(){
        /*
         * La clase curso contiene 2 constructores, uno solo te pide el nombre del curso y el otro el nombre del curso,
         * un objeto Profesor y un ArrayList de Estudiantes.
         */
        Curso c1 = new Curso("Curso1");

        Estudiantes e1 = new Estudiantes("Carlos", 27, "Medicina");
        Estudiantes e2 = new Estudiantes("Juan", 29, "Medicina");
        Estudiantes e3 = new Estudiantes("Susana", 21, "Medicina");


        Estudiantes[] listaEstudiantes = {e1,e2};
        // Sobrecarga de métodos en matricularEstudiantes(), se puede añadir un unico objeto Estudiante o un Array de Estudiantes.
        c1.matricularEstudiantes(listaEstudiantes);
        c1.matricularEstudiantes(e3);

        Profesor profesor = new Profesor("Joaquin", 54, "Medicina");
        c1.setProfesor(profesor);

        // En los métodos de mostrar Objetos solo llamo al toString por no perder mucho tiempo, 
        //en la rama de Cursos de este mismo repositorio lo tengo mas currado. 
        c1.mostrarEstudiantes();
        c1.mostrarProfesor();


        Estudiantes ee1 = new Estudiantes("Juan Carlos", 21, "Arquitectura");
        Estudiantes ee2 = new Estudiantes("Ramón", 23, "Arquitectura");
        Estudiantes ee3 = new Estudiantes("María", 25, "Arquitectura");

        ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
        estudiantes.add(ee1); estudiantes.add(ee2); estudiantes.add(ee3);
        Profesor p = new Profesor("Adolfo", 41, "Arquitecto");
        
        //lamo al constructor de Curso que pide el objeto Profesor y el ArrayList de estudiantes.
        Curso c2 = new Curso("Curso2", p, estudiantes); 
        
    }
}
