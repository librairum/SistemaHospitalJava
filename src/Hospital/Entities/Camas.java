/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Entities;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author IVAN
 */
public class Camas {
    private int numero;
    private int categoria;
    private double precio;
    private int estado;
    public static List<Camas> lista = new ArrayList<Camas>();
    public Camas(){}
    public void Insertar(Camas c){        
         lista.add(c);                        
    }
    public void Actualizar(Camas c){                         
        
        for(int i = 0; i < lista.size(); i ++){
            Camas  registro = lista.get(i);
            if(c.getNumero() == registro.getNumero()){    
               
                registro.setCategoria(c.getCategoria());                
                registro.setPrecio(c.getPrecio());                 
                registro.setEstado(c.getEstado());                 
                return;                
            }
        }                         
    }
    
    public void Eliminar(Camas c){
        int codigo = c.getNumero() - 1;
        Camas registro = lista.get(codigo);
        lista.remove(codigo);
    }
    public boolean Buscar(Camas c){
        boolean encontro = false;
        for(int i = 0; i < this.lista.size(); i++){
            Camas registro = lista.get(i);
           
            if(c.getNumero() == registro.getNumero() ){
                encontro =  true;
            }
        }
        return encontro;
    }
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
}
