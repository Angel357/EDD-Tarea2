
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Tarea2ListaBolsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista=new Lista();
        int opcion=0;
        String El;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,""
                    + "1. Agregar elemento\n"
                    + "2. Contar elementos\n"
                    + "3. la bolsa esta vacia\n"
                    + "4. Salir\n"));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros de la lista");
            }
            switch(opcion){
                case 0:
                    break;
                case 1:
                    El=JOptionPane.showInputDialog(null,"Ingrese el elemento");
                    lista.Insertar(El);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Numero de elementos en bolsa: "+lista.Cuantos());
                    break;
                case 3:
                    if(lista.esVacia()){
                        JOptionPane.showMessageDialog(null, "La lista esta vacia");
                    }
                    else{
                        
                        JOptionPane.showMessageDialog(null, "La lista esta NO vacia");
                    }
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Incorrecta!!!");
                    break;
            }
            
        }while(opcion!=4);
        
        
    }
    
}
