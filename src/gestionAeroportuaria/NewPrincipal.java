package gestionAeroportuaria;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewPrincipal {
    static Scanner entrada = new Scanner(System.in);
    final static int num = 2;
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main(String[] args) { 
        ConexionMySQL.conectar();
        PonerDatos(aeropuertos);
        menu(); 
    }
    public static void PonerDatos(Aeropuerto aero[]){
        aero[0] = new Publico(200000000, "Aeropuerto Internacional el Dorado(BOG)", "Colombia", "Bogota");
        aero[0].PonerCompania(new Compañia("Avianca(AV)"));
        aero[0].PonerCompania(new Compañia("LATAM Colombia(LA)"));
        aero[0].PonerCompania(new Compañia("SATENA(ST)"));
        aero[0].PonerCompania(new Compañia("Wingo(WP)"));
        
        aero[0].getCompania("Avianca(AV)").PonerVuelos(new Vuelos("AV1234","Bogota(BOG)", "Medellin(MDE)", 250000, 180));
        aero[0].getCompania("Avianca(AV)").PonerVuelos(new Vuelos("AV5678","Bogota(BOG)", "Cali(CLO)", 180000, 125));
        aero[0].getCompania("Avianca(AV)").PonerVuelos(new Vuelos("AV9014","Bogota(BOG)", "Cartagena(CTG)", 190000, 134));
        aero[0].getCompania("Avianca(AV)").PonerVuelos(new Vuelos("AV4567","Bogota(BOG)", "Miami(MIA)", 900000, 90 ));
        
        aero[0].getCompania("LATAM Colombia(LA)").PonerVuelos(new Vuelos("LA2345","Bogota(BOG)", "Barranquilla(BAQ)", 170000, 80));
        aero[0].getCompania("LATAM Colombia(LA)").PonerVuelos(new Vuelos("LA6789","Bogota(BOG)", "Pererira(PEI)", 130000, 120));
        aero[0].getCompania("LATAM Colombia(LA)").PonerVuelos(new Vuelos("LA3456","Bogota(BOG)", "Bucarramanga(BGA)", 230000, 124));
        aero[0].getCompania("LATAM Colombia(LA)").PonerVuelos(new Vuelos("LA1236","Bogota(BOG)", "PAnama(PTY)", 700000, 100 ));
        
        aero[0].getCompania("SATENA(ST)").PonerVuelos(new Vuelos("ST345","Bogota(BOG)", "San Andres(ADZ)", 187000, 180));  
        aero[0].getCompania("SATENA(ST)").PonerVuelos(new Vuelos("ST678","Bogota(BOG)", "Leticia(LET)", 200000, 125));
        aero[0].getCompania("SATENA(ST)").PonerVuelos(new Vuelos("ST901","Bogota(BOG)", "Florencia(FLA)", 250000, 134));
        aero[0].getCompania("SATENA(ST)").PonerVuelos(new Vuelos("ST234","Bogota(BOG)", "Villavicicencio(VVC)", 100000, 90 ));
        
        aero[0].getCompania("Wingo(WP)").PonerVuelos(new Vuelos("WP213","Bogota(BOG)", "Monteria(MTR)", 230000, 80));
        aero[0].getCompania("Wingo(WP)").PonerVuelos(new Vuelos("WP453","Bogota(BOG)", "Valledupar(VUP)", 110000, 120));
        aero[0].getCompania("Wingo(WP)").PonerVuelos(new Vuelos("WP789","Bogota(BOG)", "Cucuta(CUC)", 230000, 124));
        aero[0].getCompania("Wingo(WP)").PonerVuelos(new Vuelos("WP012","Bogota(BOG)", "Armenia(AXM)", 160000, 100 ));

        
        //desde aqui el privado
        aero[1] = new Privado("Aeropuerto Privado de la Cuidad de Bogota(SKBO)", "Colombia", "Bogota");       
        aero[1].PonerCompania(new Compañia("Private Wings(PW)"));
        aero[1].getCompania("Private Wings(PW)").PonerVuelos(new Vuelos("PW1234","Bogota(SKBO)", "Medellin(MDE)", 400000, 80));
        aero[1].getCompania("Private Wings(PW)").PonerVuelos(new Vuelos("PW5678","Bogota(SKBO)", "Cali(CLO)", 200000, 56));
        aero[1].getCompania("Private Wings(PW)").PonerVuelos(new Vuelos("PW9012","Bogota(SKBO)", "Cartagena(CTG)", 500000, 80));
        aero[1].getCompania("Private Wings(PW)").PonerVuelos(new Vuelos("PW4567","Bogota(SKBO)", "Panama(PTY)", 1000000, 20));

        aero[1].PonerCompania(new Compañia("JetEdge(JE)"));
        aero[1].getCompania("JetEdge(JE)").PonerVuelos(new Vuelos("JE2345","Bogota(SKBO)", "Miami(MIA)", 1500000, 40));
        aero[1].getCompania("JetEdge(JE)").PonerVuelos(new Vuelos("JE6789","Bogota(SKBO)", "Nueva York(JFK)", 1800000, 35));
        aero[1].getCompania("JetEdge(JE)").PonerVuelos(new Vuelos("JE3456","Bogota(SKBO)", "Madrid(MAD)", 2000000, 45));
        aero[1].getCompania("JetEdge(JE)").PonerVuelos(new Vuelos("JE1236","Bogota(SKBO)", "Paris(CDG)", 2200000, 30));

        aero[1].PonerCompania(new Compañia("AerCaribe(AC)"));
        aero[1].getCompania("AerCaribe(AC)").PonerVuelos(new Vuelos("AC345","Bogota(SKBO)", "Buenos Aires(EZE)", 1300000, 25));
        aero[1].getCompania("AerCaribe(AC)").PonerVuelos(new Vuelos("AC202","Bogota(SKBO)", "Santiago(SCL)", 1100000, 30));
        aero[1].getCompania("AerCaribe(AC)").PonerVuelos(new Vuelos("AC901","Bogota(SKBO)", "Sao Paulo(GRU)", 1400000, 35));
        aero[1].getCompania("AerCaribe(AC)").PonerVuelos(new Vuelos("AC234","Bogota(SKBO)", "Ciudad de Mexico(MEX)", 900000, 40));
        String Empresas[] = {"Bancolombia", "Grupo Aval", "Coca-Cola"};
        ((Privado)aero[1]).PonerEmpresas(Empresas);
    }   
    
    public static void menu() {
        int opcion;
        while (true) {
            System.out.println("------------------------------");
            System.out.println("-- MENU --");
            System.out.println("1. Ver Aeropuertos/Compañias.");
            System.out.println("2. Ver Empresas.");
            System.out.println("3. Ver Vuelos.");
            System.out.println("4. Boletos.");
            System.out.println("5. Abandonar.");
            System.out.print("Escoge: ");
            try {
                opcion = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error.");
                entrada.nextLine();
                continue;
            }
            entrada.nextLine();

            switch (opcion) {
                case 1: {
                    for (int i = 0; i < aeropuertos.length; i = i + 1) {
                        Aeropuerto aero = aeropuertos[i];
                        if (aero == null) {
                            continue;                        
                        }
                        System.out.println("----------------------------------------");
                        System.out.println("AEROPUERTO: " + aero.getNombre());
                        System.out.println("----------------------------------------");
                        System.out.println("Compañias en este aeropuerto:");
                        for (int j = 0; j < aero.getCompaniaNm(); j = j + 1) {
                            System.out.println("   * " + aero.getCompania(j).getNombre());
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("=== SUBVENCIONES Y PATROCINADORES ===");
                    for (int i = 0; i < aeropuertos.length; i = i + 1) {
                        Aeropuerto aero = aeropuertos[i];
                        if (aero == null) {
                            continue;
                        }
                        System.out.println("----------------------------------------");
                        System.out.println("AEROPUERTO: " + aero.getNombre());
                        System.out.println("----------------------------------------");
                        if (aero instanceof Privado privado) {
                            System.out.println("Tipo: Privado");
                            System.out.println("Patrocinadores:");
                            Privado privadoAero = privado;
                            for (String empresa : privadoAero.getListaEmpresas()) {
                                if (empresa != null) {
                                    System.out.println("   * " + empresa);
                                }
                            }
                        }
                        if (aero instanceof Publico publico) {
                            System.out.println("Tipo: Publico");
                            System.out.println("Subvencion gubernamental $" + (int)publico.getSubvencion());
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("=== VUELOS DISPONIBLES ===");
                    for (Aeropuerto aero : aeropuertos) {
                        if (aero == null)
                            continue;
                        System.out.println("----------------------------------------");
                        System.out.println("AEROPUERTO: " + aero.getNombre());
                        System.out.println("----------------------------------------");
                        for (int j = 0; j < aero.getCompaniaNm(); j++) {
                            Compañia compania = aero.getCompania(j);
                            System.out.println(">> COMPAÑIA: " + compania.getNombre());
                            boolean vuelosDisponibles = false;
                            for (int k = 0; k < compania.getNmsVuelos(); k++) {
                                Vuelos vuelo = compania.getVuelo(k);
                                if (vuelo.getPjsActuales() < vuelo.getPjsMaximo()) {
                                    System.out.println("   * Informacion del Vuelo:");
                                    System.out.println("     - ID del vuelo: " + vuelo.getId());
                                    System.out.println("     - Ciudad actual: " + vuelo.getOrigen());
                                    System.out.println("     - Destino: " + vuelo.getDestino());
                                    System.out.println("     - Precio $" + (int)vuelo.getPrecio());
                                    System.out.println("     - Asientos: " + vuelo.getPjsActuales() + "/" + vuelo.getPjsMaximo());
                                    System.out.println("     ----------------------");
                                    vuelosDisponibles = true;
                                }
                            }
                            if (!vuelosDisponibles) {
                                System.out.println("   * No hay vuelos disponibles en esta compañía.");
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    boolean seguirComprando = true;
                    while (seguirComprando) {
                        System.out.println("--- Boleto ---");
                        System.out.print("Quieres comprar un boleto?: ");
                        String respuesta = entrada.nextLine();
                        if (respuesta.equalsIgnoreCase("Si")) {
                            System.out.print("Ingresa el Id del vuelo: ");
                            String vueloId = entrada.nextLine();
                            Vuelos vuelo = null;
                            
                            for (Aeropuerto aero : aeropuertos) {
                                if (aero != null) {
                                    for (int j = 0; j < aero.getCompaniaNm(); j++) {
                                        Compañia compania = aero.getCompania(j);
                                        if (compania != null) {
                                            for (int k = 0; k < compania.getNmsVuelos(); k++) {
                                                Vuelos v = compania.getVuelo(k);
                                                if (v != null && v.getId().equals(vueloId)) {
                                                    vuelo = v;
                                                    break;
                                                }
                                            }
                                            if (vuelo != null) break;
                                        }
                                    }
                                    if (vuelo != null) break;
                                }
                            }
                            if (vuelo == null) {
                                System.out.println("Vuelo no encontrado.");
                            } else {
                                if (vuelo.getPjsActuales() < vuelo.getPjsMaximo()) {
                                    System.out.println("--- Datos del pasajero ---");
                                    System.out.print("Su Nombre: ");
                                    String nombre = entrada.nextLine();
                                    System.out.print("Su Pasaporte: ");
                                    String pasaporte = entrada.nextLine();
                                    System.out.print("Su Nacionalidad: ");
                                    String nacionalidad = entrada.nextLine();
                                    Pasajeros pasajero = new Pasajeros(nombre, pasaporte, nacionalidad);
                                    vuelo.PonerPasajeros(pasajero);
                                    System.out.println("--- Resumen de la compra ---");
                                    System.out.println("Su asiento es el " + vuelo.getPjsActuales() + " en el vuelo " + vueloId +  " con destino a " + vuelo.getDestino());
                                } else {
                                    System.out.println("No hay asientos disponibles.");
                                }
                            }
                        } else {
                            seguirComprando = false;
                        }                       
                        if (seguirComprando) {
                            System.out.print("Quieres comprar otro boleto?: ");
                            String otraCompra = entrada.nextLine();
                            if (!otraCompra.equalsIgnoreCase("Si")) {
                                seguirComprando = false;
                            }
                        }
                    }
                    break;
                } 
                case 5: {
                    System.out.println("Hatsa luego, espero que haga disfrutado de la estadia.");
                    return;
                }
                default: {
                    break;
                }
            }
        }
    }
}
