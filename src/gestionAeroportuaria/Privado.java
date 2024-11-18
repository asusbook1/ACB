package gestionAeroportuaria;

public class Privado extends Aeropuerto{
    private String listaEmpresas[] = new String[10];
    private int empresasNum;

    public Privado(String nombre, String pais, String cuidad) {
        super(nombre, pais, cuidad);
    }

    public Privado(String nombre, String pais, String cuidad, Compañia[] cn, String dn[]) {
        super(nombre, pais, cuidad, cn);
        this.listaEmpresas = dn;
        empresasNum =dn.length;
    }
    
    
    public void PonerEmpresas(String dn[]){
        this.listaEmpresas = dn;
        empresasNum = dn.length;
    }
    public void AgrEmpresas(String dn){
        listaEmpresas[empresasNum] = dn;
        empresasNum = empresasNum + 1;
    }
    public String[] getListaEmpresas() {
        return listaEmpresas;
    } 
    public int getEmpresasNum() {
        return empresasNum;
    }    
}

