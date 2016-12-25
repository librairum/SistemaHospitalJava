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
public class Medicamento {
    private int codigo;
    private String nombre;
    private String laboratorio;
    private double precio;
    private int stock;
    public static List<Medicamento> lista = new ArrayList<Medicamento>();
    public void Insertar(Medicamento m){
        lista.add(m);
        
    }
    public void Actualiar(Medicamento m){
        Medicamento registro = lista.get(m.getCodigo() - 1);
        if(registro != null){
            registro.setCodigo(m.getCodigo());
            registro.setNombre(m.getNombre());
            registro.setLaboratorio(m.getLaboratorio());
            registro.setPrecio(m.getPrecio());
            registro.setStock(m.getStock());
            
        }
        
    }
    public void Eliminar(Medicamento m){
        for(int x = 0 ; x < lista.size(); x ++){
            if(lista.get(x).getCodigo() == m.getCodigo())
            {
                lista.remove(x);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }
    
    public String TraerNuevoCodigo(){
        String result = String.format("%1$05d", lista.size() + 1);
        return result;
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the laboratorio
     */
    public String getLaboratorio() {
        return laboratorio;
    }

    /**
     * @param laboratorio the laboratorio to set
     */
    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
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
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
