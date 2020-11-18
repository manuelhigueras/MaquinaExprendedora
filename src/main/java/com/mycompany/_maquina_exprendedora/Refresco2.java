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
public class Refresco2 extends Refresco{
    
    private double costo;
    private int ml, num_refresco;
    private String nombre, sabor;
    
    public Refresco2(){
        this.costo = 0;
        this.nombre = "";
        this.sabor = "";
        this.ml = 0;
        this.num_refresco = 0;
    }

    public Refresco2(double costo, int ml, String nombre, String sabor, int num_refresco) {
        this.costo = costo;
        this.ml = ml;
        this.nombre = nombre;
        this.sabor = sabor;
        this.num_refresco = num_refresco;
    }

    public double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getNum_refresco() {
        return num_refresco;
    }

    public void setNum_refresco(int num_refresco) {
        this.num_refresco = num_refresco;
    }
    
    public int get_quitaLata(){
        this.num_refresco--;
        return num_refresco;
    }
    
    public int get_reponeLata(){
        this.num_refresco++;
        return num_refresco;
    }

}
