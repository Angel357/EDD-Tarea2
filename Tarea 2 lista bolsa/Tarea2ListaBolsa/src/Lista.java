/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Lista {
    protected Bolsa inicio, fin;
    
    public Lista(){
        inicio= null;
        fin=null;
    }
    
    public void Insertar(String elemento){
        inicio=new Bolsa(elemento,inicio);
        if(fin==null){
            fin=inicio;
            
        }
    }
    
    public int Cuantos(){
        Bolsa Recorrer=inicio;
        int contador=0;
        while(Recorrer!=null){
            Recorrer = Recorrer.siguiente;
            contador++;
        }
        return contador;
    }
    
    public Boolean esVacia(){
        if(inicio==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
