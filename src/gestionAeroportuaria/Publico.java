package gestionAeroportuaria;

public class Publico extends Aeropuerto{
    private  double subvencion;

    public Publico(String nombre, String pais, String cuidad) {
        super(nombre, pais, cuidad);
    }

    public Publico(double subvencion, String nombre, String pais, String cuidad, Compañia[] cn) {
        super(nombre, pais, cuidad, cn);
        this.subvencion = subvencion;
    }

    public Publico(double subvencion, String nombre, String pais, String cuidad) {
        super(nombre, pais, cuidad);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    } 
}
