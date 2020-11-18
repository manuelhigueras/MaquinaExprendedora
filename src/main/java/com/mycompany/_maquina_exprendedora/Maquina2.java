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

public class Maquina2 {
    
    private int num_refresco, code;
    private Refresco2[] lata;
    private double costo, cambio;
    private double ingreso = 0;
     
    public Maquina2() {
        this.num_refresco = 0;
        this.code = 0;
        this.lata = new Refresco2[0];
        this.costo = 0;
        this.cambio = 0;
    }
    
    public Maquina2(int num_refresco, int code, double costo, double cambio, int pos) {
        this.num_refresco = num_refresco;
        this.code = code;
        this.lata = new Refresco2[pos];
        this.costo = costo;
        this.cambio = cambio;
    }

    public void addRefresco(Refresco2[] refresco, int posicion){
        if(posicion >= 0 && posicion < this.lata.length){
            this.lata[posicion] = new Refresco2(costo, tamMili, name, sabor, num_refresco);
            posicion = posicion + 1;
        }
    }
    
    private boolean esPosicionValida(int posicion){
        boolean cond = false;
        if(posicion >= 0 && posicion < this.lata.length){
            cond = true;
        }
        return cond;
    }
    
    public int refrescoDisponible(int num_refresco){
        return num_refresco;
    }
    
    public void reponerRefrescos(Refresco lata, int num_refresco) throws AvisosExceptions{
        lata.get_reponeLata();
        this.num_refresco += num_refresco;
        throw new AvisosExceptions("Has repuesto " + this.num_refresco + " refrescos");
        //return "Has repuesto " + this.num_refresco + " refrescos";
    }
    
    public boolean StockRefresco(boolean cond){
        if(cond == false){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void DisponibilidadRefrescoEspecifico(Refresco lata) throws AvisosExceptions {
        String msg;
        if(lata.getNum_refresco() > 0){
            msg = "Refresco{Nombre:"+lata.getNombre()+"; Sabor:"+lata.getSabor()
                    +"; Disponibilida_Latas:"+lata.getNum_refresco();
            throw new AvisosExceptions(msg);
        }
        else{
            msg = "No hay refrescos de este tipo.";
           throw new AvisosExceptions(msg);
        }
    }
    
    public void CodigoAdministrativo(int code_gen, int pos) throws AvisosExceptions{
        String msg;
        if(this.code == code_gen){
            this.lata[pos] = lata.get_quitaLata();
            msg = "Codigo Aceptado, recoja producto"
            throw new throws AvisosExceptions ;
        }
        else{
             "Codigo Incorrecto, intente de nuevo";   
        }     
        
    }
    
    public String VenderRefresco(Refresco lata, int code){
        if ((this.code == code) && (this.cambio > 0)) {
            if (lata.getNum_refresco() > 0) {
                if (num_refresco > 0) {
                    lata.get_quitaLata();
                    this.num_refresco--;
                    this.ingreso += this.costo;
                    this.cambio -= this.cambio;
                    return "Producto insertado, aqui tiene su producto";
                } else {
                    return "No hay refrescos.";
                }
            } else {
                return "No tenemos este sabor especifico";
            }
        } else {
            return "No tenemos cambio. Disculpe las molestias";
        }
    }
    
    public String IngresoRefrescos(){
        return "Tienes en la maquina " + this.ingreso + " euros.";
    }    
    
    //  VERSION 2.0
    /*
    public double refrescoDisponible, refrescoVendido, costo, total;
    
    public Maquina(double RefrescoDisponible) {
        this.refrescoDisponible = RefrescoDisponible;
        this.refrescoVendido = 0;
        this.costo = 0.5;
        this.total = 0;
    }    

    public void setRefrescoDisponible(double RefrescoDisponible) {
        this.refrescoDisponible = RefrescoDisponible;
    }

    public void setRefrescoVendido(double RefrescoVendido) {
        this.refrescoVendido = RefrescoVendido;
    }

    public void vender(double VentanumRefresco){
        
        if(refrescoDisponible > VentanumRefresco){
            if(refrescoDisponible > 0){
                System.out.println("..... TOMA TU LATA");
                refrescoDisponible-= VentanumRefresco;
                refrescoVendido+= VentanumRefresco;
                total += costo * VentanumRefresco;
            } 
        }
        else{
            System.out.println("NO HAY LATAS SUFICIENTES");
        }

    }
    
    public void reponer(double num_latas_repuesto){
        refrescoDisponible += num_latas_repuesto;
    }
    
    @Override
    public String toString() {
        return "Maquina{" + "refrescoDisponible=" + refrescoDisponible + ", refrescoVendido=" + refrescoVendido + ", total=" + total + '}';
    }

    */
    
    // VERSION 1.0
    
    /*
    
    private double num_lata, num_venta, num_sobrante, total_ing;
    Refresco lata = new Refresco();
    
    //Constructor basico
    public Maquina(){
        this.num_lata = 20;
        num_venta = 0;
        num_sobrante = 20;
        total_ing = 0;
    }
    
    //Constructor Gen
    public Maquina(double valor){
        this.num_lata = valor;
        num_venta = 0;
        num_sobrante = valor;
        total_ing = 0;
    }
    
    public double getNum_venta() {
        return num_venta;
    }

    public void setNum_venta(double cont) {
        this.num_venta += cont;
    }
    
    public double getNum_sobrante() {
        return num_sobrante;
    }

    public void setNum_sobrante(double num_sobrante) {
        this.num_sobrante -= num_sobrante;
    }

    public double getTotal_ing() {
        return total_ing;
    }

    public void setTotal_ing(double ingreso) {
        if(total_ing == 0)
            this.total_ing += lata.getCosto();
        else
            this.total_ing = lata.getCosto() * ingreso;
    }

    @Override
    public String toString() {
        return "Maquina{" + "num_lata=" + num_lata + ", num_venta=" + num_venta + ", num_sobrante=" + num_sobrante + ", total_ing=" + total_ing + '}';
    }
    
    */


}
