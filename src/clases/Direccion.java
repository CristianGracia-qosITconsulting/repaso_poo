package clases;

public class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String codigoPostal){
        this.setCalle(calle);
        this.setCiudad(ciudad);
        this.setCodigoPostal(codigoPostal);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Calle: " + calle + "\nCiudad: " + ciudad + "\nCodigo postal:" + codigoPostal + "\n";
    }
}
