/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Data;

import Hospital.Entities.Empleado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author IVAN
 */
public class EmpleadoData {
    public static List<Empleado> lista = new ArrayList<Empleado>();
    public int  TraerCodigoEmpleado(){
       
        return lista.size() + 1 ;
    }    
    
    public void Insertar(Empleado e){                
        lista.add(e);;     
        JOptionPane.showMessageDialog(null, "Registro Guardado");
    }
    public void Eliminar(Empleado e){
        for(int i = 0 ; i < lista.size(); i++){
            if(e.getCodigo() == lista.get(i).getCodigo())
            {                
               lista.remove(i);
               JOptionPane.showMessageDialog(null, "Registro eliminado");             
            }
            
        }
        
    }
    public void EliminarTodo(){
        int x = 0 ;
        for(Empleado e : lista)
        {
            
            lista.remove(x);
            x++;
        }
        
    }
    public void Actualizar(Empleado e) {
        for (int i = 0; i < lista.size(); i++) {
            if (e.getCodigo() == lista.get(i).getCodigo()) {
                Empleado registro = lista.get(i);
                EmpleadoUpdater updater = new EmpleadoUpdater(registro, e);
                updater.actualizarEmpleado();
                return;
            }
        }
    }
    
    public Empleado Buscar(int tipo, String valor){
        Empleado registro = null;
        for(int i = 0 ; i < lista.size(); i++){
            registro = lista.get(i);
        }
        return registro;
    }
    
    //Carga datos a Grilla de Empleados
    public List<Empleado> TraerEmpleados(){
      
        return lista;
    }
    
    
}

