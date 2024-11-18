package gestionAeroportuaria;

public class Pasajeros {
    private final String nombre;
    private final String pasaporte;
    private final String nacion;

    public Pasajeros(String nombre, String pasaporte, String nacion) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacion = nacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPasaporte() {
        return pasaporte;
    }
    public String getNacion() {
        return nacion;
    }
}
