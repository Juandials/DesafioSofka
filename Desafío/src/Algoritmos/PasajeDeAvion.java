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
public class PasajeDeAvion{

   private final double tarifaPorKM = 35.00;
   private double precioPasaje;
   
   public double DeterminarPrecio(int distancia, int numeroDeDias){
       precioPasaje=distancia*tarifaPorKM;
       if(distancia > 1000 && numeroDeDias > 7){
           precioPasaje = (precioPasaje-(precioPasaje*(0.30)));
       }
       System.out.printf("$ %.2f\n",precioPasaje);
       return precioPasaje;
   }  
   
}
