package excepciones;

public class NombreException extends Exception{
    public NombreException(){
        super("Nombre inválido.");
    }
}
