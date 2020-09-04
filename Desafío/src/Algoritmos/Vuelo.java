/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;
import java.util.List;
/**
 *
 * @author Juan
 */
public class Vuelo {
    public int CantidadDeBultos(List <CargaBoing747> tabla){
        return tabla.size();
    }
    public int BultoMasPesado(List <CargaBoing747> tabla){
        int bultoMasPesado=0;
        for (int i = 0; i < tabla.size(); i++) {
            if (tabla.get(i).getPesoBulto()>bultoMasPesado) {
                bultoMasPesado=tabla.get(i).getPesoBulto();
            }
        }    
        return bultoMasPesado;
    }
    public int BultoMasLiviano(List <CargaBoing747> tabla){
        int bultoMasLiviano=0;
        for (int i = 0; i < tabla.size(); i++) {
            if (tabla.get(i).getPesoBulto()>bultoMasLiviano) {
                bultoMasLiviano=tabla.get(i).getPesoBulto();
            }
        }for (int i = 0; i < tabla.size(); i++) {
            if (tabla.get(i).getPesoBulto()<bultoMasLiviano) {
                bultoMasLiviano=tabla.get(i).getPesoBulto();
            }
        }    
        return bultoMasLiviano;
    }
    public float PromedioPesoDeBultos(List <CargaBoing747> tabla){
        int suma=0;
        for (int i = 0; i < tabla.size(); i++) {
            suma=suma+tabla.get(i).getPesoBulto();
        }
        return suma/tabla.size();        
    }
}
