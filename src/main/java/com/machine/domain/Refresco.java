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
public class Refresco {
    private double precio;
    private String sabor;
    private int stock;
    private boolean agotado;
    private double cl; //cantidad

   //constructor

    public Refresco(double precio, String sabor, int stock, double cl) {
        this.precio = precio;
        this.sabor = sabor;
        this.stock = stock;
        this.cl = cl;
        if(stock <= 0 ){
            this.agotado = true;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAgotado() {
        return agotado;
    }

    public double getCl() {
        return cl;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Refresco{" + "precio=" + precio + ", sabor=" + sabor + ", stock=" + stock + ", agotado=" + agotado + ", cl=" + cl + '}';
    }

}
