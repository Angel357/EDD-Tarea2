/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Bolsa {
    
    public String elemento;
    public Bolsa siguiente;
    
    public Bolsa(String el,Bolsa b){
        elemento=el;
        siguiente=b;
    }
    
}
