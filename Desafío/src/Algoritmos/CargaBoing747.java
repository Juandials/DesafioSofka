/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Juan
 */
public class CargaBoing747 {
    private final int capacidadMaximadeCarga = 18000;
    private int valorBulto;
    private int tarifaBulto;
    private int pesoBulto;

    public int getValorBulto() {
        return valorBulto;
    }

    public int getPesoBulto() {
        return pesoBulto;
    }
    

    public CargaBoing747(int pesoBulto) {
        this.pesoBulto=pesoBulto;
    }
    
    
    public boolean VerificarPesoBulto(){
        boolean verificacion=false;
        if(pesoBulto > 500){
            verificacion = true;
        }
        return verificacion;
    }
    public int CalcularValorBulto(){
        if(pesoBulto>=0 && pesoBulto<=25){
            tarifaBulto=0;
            valorBulto=pesoBulto*tarifaBulto;
        }
        if(pesoBulto>=26 && pesoBulto<=300){
            tarifaBulto=1500;
            valorBulto=pesoBulto*tarifaBulto;
        }
        if(pesoBulto>=301 && pesoBulto<=500){
            tarifaBulto=2500;
            valorBulto=pesoBulto*tarifaBulto;
        }
        return valorBulto;
    }
    
}
