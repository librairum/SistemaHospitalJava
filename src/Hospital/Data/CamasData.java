/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Hospital.Data;

import Hospital.Entities.Camas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IVAN
 */

public class CamasData {
    public List<Camas> lista = new ArrayList<Camas>();
    public void Insertar(Camas c){
        
        lista.add(c);
    }
    public String TraerNuevoCodigo(){
        return String.valueOf(lista.size() + 1);
    }
    public Camas TraerRegistro(int codigo){
        Camas c = lista.get(codigo);
        return c;
    }
    public List<Camas> TraerLista(){
        return lista;
    }
    
}
