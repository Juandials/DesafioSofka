/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Juan
 */
public class Main {
    public static void main(String[] args) {
        PasajeDeAvion prueba = new PasajeDeAvion();
        prueba.DeterminarPrecio(1001, 8 );//Determina precio con descuento
        prueba.DeterminarPrecio(1000, 7 );//Determina precio sin descuento        
        List<CargaBoing747> tablaDeSeguimiento = new ArrayList<CargaBoing747>();
        tablaDeSeguimiento.add(new CargaBoing747(23));
        tablaDeSeguimiento.add(new CargaBoing747(345));
        tablaDeSeguimiento.add(new CargaBoing747(12));
        tablaDeSeguimiento.add(new CargaBoing747(45));
        tablaDeSeguimiento.add(new CargaBoing747(56));
        tablaDeSeguimiento.add(new CargaBoing747(34));
        tablaDeSeguimiento.add(new CargaBoing747(112));
        tablaDeSeguimiento.add(new CargaBoing747(67));
        tablaDeSeguimiento.add(new CargaBoing747(87));
        tablaDeSeguimiento.add(new CargaBoing747(90));
        tablaDeSeguimiento.add(new CargaBoing747(80));
        tablaDeSeguimiento.add(new CargaBoing747(245));
        tablaDeSeguimiento.add(new CargaBoing747(1230));
        tablaDeSeguimiento.add(new CargaBoing747(42));
        tablaDeSeguimiento.add(new CargaBoing747(11));
        for (int i = 0; i < tablaDeSeguimiento.size(); i++) {            
            if(tablaDeSeguimiento.get(i).VerificarPesoBulto()==true){
                System.out.println("El bulto #"+(i+1)+" excede la carga máxima permitida, no se puede asignar valor de bulto");
            }            
            tablaDeSeguimiento.get(i).CalcularValorBulto();
        }
        Vuelo vuelo = new Vuelo();//Instancia de un nuevo vuelo
        System.out.println("El bulto más liviano es de:"+vuelo.BultoMasLiviano(tablaDeSeguimiento)+" kg");
        System.out.println("El bulto más pesado es de: "+vuelo.BultoMasPesado(tablaDeSeguimiento)+" kg");
        System.out.println("La cantidad de bultos es : "+vuelo.CantidadDeBultos(tablaDeSeguimiento));
        System.out.println("El promedio de peso de los bultos es: "+vuelo.PromedioPesoDeBultos(tablaDeSeguimiento)+" kg");
        System.out.println("");
        System.out.println("Tabla de seguimiento");
        System.out.println("");
        System.out.println("Número de bulto | Peso de bulto | Valor del bulto (COP) | Valor del bulto (USD)");
        for (int i = 0; i < tablaDeSeguimiento.size(); i++) {
            System.out.println("----------------------------------------------");
            System.out.println("#"+(i+1)+" | "+tablaDeSeguimiento.get(i).getPesoBulto()+" | "
                    +tablaDeSeguimiento.get(i).getValorBulto()+" | "
                    +(tablaDeSeguimiento.get(i).getValorBulto()/3687));
        }
    }
}
