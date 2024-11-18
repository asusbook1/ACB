package gestionAeroportuaria;

public class Aeropuerto {
    private final String nombre;
    private final  String pais;
    private final String cuidad;
    private Compañia listaCpnas[] = new Compañia[10];
    private int companiaNm;

    public Aeropuerto(String nombre, String pais, String cuidad) {
        this.nombre = nombre;
        this.pais = pais;
        this.cuidad = cuidad;
        this.companiaNm = 0;
    }
    public Aeropuerto(String nombre, String pais, String cuidad, Compañia cn[]) {
        this.nombre = nombre;
        this.pais = pais;
        this.cuidad = cuidad;
        listaCpnas = cn;
        this.companiaNm = cn.length;
    }
    
    
    public void PonerCompania(Compañia compania){
        listaCpnas[companiaNm] = compania;
        companiaNm = companiaNm + 1;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPais() {
        return pais;
    }
    public String getCuidad() {
        return cuidad;
    }
    public Compañia[] getListaCpnas() {
        return listaCpnas;
    }
    public int getCompaniaNm() {
        return companiaNm;
    }
    public Compañia getCompania(int i){
        return listaCpnas[i];
    }
    public Compañia getCompania(String nombre){
        boolean  encontrado = false;
        int i = 0;
        Compañia cn = null;
        while ((encontrado == false) &&(i <listaCpnas.length)) {
            if(nombre.equals(listaCpnas[i].getNombre())){
                encontrado = true;
                cn = listaCpnas[i];
            }
            i = i +1;
        }
        return cn;
    }  
}
