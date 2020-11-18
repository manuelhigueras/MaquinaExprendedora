/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.machine.domain;

/**
 *
 * @author user
 */
public class Machine2 {
        
    //ATR
   // private int refrescosDisponibles;
    private int refrescosVendidos;
    private String nombreMaqu;
    private Refresco refresco;
    
    //CONTS 

    public Machine2(String nombreMaqu, Refresco refresco) {
        this.nombreMaqu = nombreMaqu;
        this.refresco = refresco;
    }
    

    public void setRefresco(Refresco refresco) {
        this.refresco = refresco;
    }

    public void setNombreMaqu(String nombreMaquina) {
        this.nombreMaqu = nombreMaquina;
    }

    public int getRefrescosDisponibles() {
        return this.refresco.getStock();
    }

    public int getRefrescosVendidos() {
        return refrescosVendidos;
    }

    //VERSIOM 1.0
    /*
    public void vender(){
        int disponible = this.refresco.getStock() ;
        if( disponible > 0){
            System.out.println(".... toma una lata. Disfruta!!");
            
            disponible --;
            this.refresco.setStock(disponible);
            refrescosVendidos ++;
        }
    }*/
    
    public boolean vender(){
        int disponible = this.refresco.getStock() ;
        if( disponible > 0){
            System.out.println(".... toma una lata. Disfruta!!");
            disponible --;
            this.refresco.setStock(disponible);
            refrescosVendidos ++;
            return true;
        }
        else{
            return false;
        }
    }    
    
    public void reponer(int latasAReponer){
        //TODO: Falta ver que hacemos si reponemos en negativo 
       // refrescosDisponibles = refrescosDisponibles + latasAReponer;
       int disponible = this.refresco.getStock();
       disponible = disponible + latasAReponer;
       this.refresco.setStock(disponible);
       
        System.out.println(".. Has repuesto " + latasAReponer);   
    }
  
    
    public void informe(){
        System.out.println("...................................");
        System.out.println(".              VENTAS             .");
        System.out.println("...................................");
        System.out.println(".  Total latas vendidas: " + refrescosVendidos);
        System.out.println("...................................");
    }

    
    @Override
    public String toString() {
        return "MaquinaExpendedora{" + "refrescosDisponibles=" 
                + this.refresco.getStock() 
                + ", refrescosVend =" + this.getRefrescosVendidos() + "}" ;
    }
    
}
