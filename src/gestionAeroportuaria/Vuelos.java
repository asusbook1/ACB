package gestionAeroportuaria;

public class Vuelos {
     private final String id;
     private final String origen;
     private final String destino;
     private final double precio;
     private final int pjsMaximo;
     private int pjsActuales;
     private final Pasajeros listaPjs[];

    public Vuelos(String id, String origen, String destino, double precio, 
            int pjsMaximo) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.pjsMaximo = pjsMaximo;
        
        this.pjsActuales = 0;
        this.listaPjs = new Pasajeros[pjsMaximo];
    }
    
    
    public void PonerPasajeros(Pasajeros pasajero){
        listaPjs[pjsActuales] = pasajero;
        pjsActuales = pjsActuales + 1;
    }
    public String getId() {
        return id;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public double getPrecio() {
        return precio;
    }
    public int getPjsMaximo() {
        return pjsMaximo;
    }
    public int getPjsActuales() {
        return pjsActuales;
    }
    
    public Pasajeros getPasajeros(int i){
        return listaPjs[i];
    }
    public Pasajeros getpPasajeros(String pasaporte){
        boolean encontrado = false;
        int i = 0;
        Pasajeros an = null;
        while((encontrado == false)&&(i < listaPjs.length)){
            if(pasaporte.equals(listaPjs[i].getPasaporte())){
                encontrado = true;
                an = listaPjs[i];                
            }
            i = i + 1;
        }
        return an;
    }
}
    
    

