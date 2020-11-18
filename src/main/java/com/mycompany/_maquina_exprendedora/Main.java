/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._maquina_exprendedora;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VERSION 3.0 //TERMINAR APARTE - RECORDATORIO
        
        //double costo, int ml, String nombre, String sabor, int num_refresco
        Refresco lata = new Refresco(0.50, 500, "Coca-cola", "Light", 10);
        
        //int num_refresco, int code, Refresco lata, double costo, double cambio
        Maquina SM125 = new Maquina(20, 52, lata, 1, 100);











        //VERSION 2.0
        /*
        Maquina pepsi = new Maquina(30);
        System.out.println(pepsi.toString());
        //pepsi.vender();
        pepsi.vender(20);
        System.out.println(pepsi.toString());
        pepsi.vender(8);
        System.out.println(pepsi.toString());
        
        pepsi.reponer(15);
        */
        /*pepsi.vender();
        pepsi.vender();
        pepsi.vender();
        pepsi.vender();
        pepsi.vender();
        pepsi.vender();
        pepsi.vender();*/
        
        //->System.out.println(pepsi.toString());
        
        //Version 1.0
        //Maquina coca_cola = new Maquina();
        /*
        Maquina coca_cola = new Maquina(50);
        
        coca_cola.setNum_venta(1);
        coca_cola.setNum_sobrante(1);
        coca_cola.setTotal_ing(1);
        
        System.out.println("Numero de latas sobrantes: " + coca_cola.getNum_sobrante());
        System.out.println("Venta de latas: " + coca_cola.getNum_venta());
        System.out.println("Total de ingresos: " + coca_cola.getTotal_ing());
        
        coca_cola.setNum_venta(15);
        coca_cola.setNum_sobrante(15);
        coca_cola.setTotal_ing(15);
        
        System.out.println("Numero de latas sobrantes: " + coca_cola.getNum_sobrante());
        System.out.println("Venta de latas: " + coca_cola.getNum_venta());
        System.out.println("Total de ingresos: " + coca_cola.getTotal_ing());
        */
        
        
    }
    
}
