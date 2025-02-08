package vista;

import java.util.ArrayList;

import clases.Curso;
import clases.Direccion;
import clases.Estudiantes;
import clases.Persona;
import clases.Profesor;

public class Main {
    public static void main(String[] args){
        /*
         * Se comprueba:
         *  Nombre: longitud de cadena y que sean letras.
         *  Edad: Que la cadena pueda ser un número de 10 a 90
         *  DNI: Que la cadena tenga un tamaño de 9 caracteres, que los 8 primeros sean dígitos y el último una letra.
         *       No compruebo que sea válido con el %23 y la posición de la letra para realizar pruebas, pero está hecho y comentado
         *       en el setDni().
         *       Que no exista ninguna persona con ese DNI.
         * 
         * Contiene:
         * ArrayList estáticos que almacena las personas y cursos que se instancian.
         * Métodos estáticos que imprime las personas y cursos. 
         */
        try {
            Estudiantes e1 = new Estudiantes("Juan", "22", "12245678C", new Direccion("calle Sin Salida", "Alicante", "03001"), "Derecho");
            Estudiantes e2 = new Estudiantes("Alberto", "25", "13345678C", new Direccion("calle Chipiona", "Alicante", "03001"), "Derecho");
            Estudiantes e3 = new Estudiantes("Lucia", "23", "18245678C", new Direccion("Avenida Benito", "Alicante", "03001"), "Derecho");
            Estudiantes e4 = new Estudiantes("Inés", "27", "14345678C", new Direccion("Calle San Juan", "Alicante", "03001"), "Química");
            Estudiantes e5 = new Estudiantes("Daniel", "24", "15345678C", new Direccion("Calle sin Salida", "Alicante", "03001"), "Química");
            Profesor p1 = new Profesor("Luis", "49", "16345678C", new Direccion("Calle San Blas", "Alicante", "03001"), "Abogado");
            Profesor p2 = new Profesor("Noemi", "36", "17345678C", new Direccion("Calle Me la invento", "Alicante", "03001"), "Químico");
            
            ArrayList<Estudiantes> estudiantesDerecho = new ArrayList<Estudiantes>();
            estudiantesDerecho.add(e1); estudiantesDerecho.add(e2); estudiantesDerecho.add(e3);
            Curso c1 = new Curso("Curso de Derecho", p1, estudiantesDerecho);

            ArrayList<Estudiantes> estudiantesQuimica = new ArrayList<Estudiantes>();
            estudiantesQuimica.add(e4); estudiantesQuimica.add(e5);
            Curso c2 = new Curso("Curso de Química", p2, estudiantesQuimica);


            Persona.mostrarPersonas();
            System.out.println();
            Curso.mostrarCursos();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
