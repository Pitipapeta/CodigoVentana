package Paquete;

import Paquete.Contenedor;
import Paquete.Hub;

public class Puerto {

    Hub[] hubs;
    Contenedor contenedor;
    Contenedor[][] puerto = new Contenedor[10][12];

    public Puerto(){
        this.hubs = new Hub[3];
    }

    public Puerto(Hub[] hubs){
        this.hubs = hubs;
    }

    public boolean Apilar(Contenedor cont) {
        if (cont != null) {
            for (int i = 0; i < hubs.length; i++) {
                if (hubs[i].apilar(cont)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String contenedorBase(int prio){
        String plano = new String();
        for (int i = 0; i < puerto.length; i++) {
            for (int j = 0; j < puerto[i].length; j++) {
                if(i == (puerto.length -1) && prio == contenedor.getPrio()){
                    plano += contenedor.mostrarDatos() + "\n";
                }else return "No se ha encontrado ningun contenedor";
            }
        }
        return plano;
    }

    public boolean Desapilar(int nHub, int colum){

        if (colum < 0 || colum >= hubs.length) return false;
        for (int i = 0; i < hubs.length; i++) {
            if (hubs[nHub] != null) {
                Hub vacio = hubs[nHub];
                return true;
            }
        }
        return true;
    }

    public String toString() {
        String plano = new String();
        for (int i = 0; i < hubs.length; i++) {
            plano += hubs.toString() + "\n";
        }
        return plano;
    }


}

