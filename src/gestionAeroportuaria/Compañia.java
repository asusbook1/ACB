package gestionAeroportuaria;

public class Compañia {
    private final String nombre;
    private Vuelos listaVls[] = new Vuelos[10];
    private int nmsVuelos =0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }
    public Compañia(String nombre, Vuelos bn[]) {
        this.nombre = nombre;
        listaVls = bn;
        nmsVuelos = bn.length;
    }
    
    
    public void PonerVuelos(Vuelos Vuelo){
        listaVls[nmsVuelos] = Vuelo;
        nmsVuelos = nmsVuelos + 1;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNmsVuelos() {
        return nmsVuelos;
    }
    public Vuelos getVuelo(int i){
        return listaVls[ i];
    }
    public Vuelos getVuelo(String id){
        boolean encontrado = false;
        int i = 0;
        Vuelos bn = null;
        while ((encontrado == false) &&(i< listaVls.length)) {
            if(id.equals(listaVls[i].getId())){
                encontrado = true;
                bn =listaVls[i];
            }
            i = i+ 1;  
        }
        return bn;
    }
}

