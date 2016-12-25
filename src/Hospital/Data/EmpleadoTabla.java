/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Data;

import Hospital.Entities.Empleado;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author IVAN
 */
public class EmpleadoTabla  implements  TableModel {
    
        private List<Empleado> empleados;
    EmpleadoData datos = new EmpleadoData();
    public EmpleadoTabla(List<Empleado> lista){
        empleados = lista;
    }
    private String[] columnName = {"Codigo","Nombres","Apellidos","Tipo","Turno","Login","Clave"};
    //Eventos
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return empleados.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado fila = empleados.get(rowIndex);
       switch(columnIndex){
            case 0:
                return fila.getCodigo();
            case 1:
                return fila.getNombres();
            case 2:
                return fila.getApellidos();
            case 3:
                return fila.getTipo();
            case 4:
                return fila.getTurno();
            case 5:
                return fila.getLogin();
            case 6:
                return fila.getPassword();
            default:
                return null;
        }
    }
       @Override
    public void setValueAt(Object valor, int fila , int col){
       //lista[col][fila] = valor;
        Empleado entidad = empleados.get(fila);
        switch (col){
            case 0:
                entidad.setCodigo(Integer.parseInt(valor.toString()));
                break;                  
            case 1:
                entidad.setNombres(valor.toString());
                break;
            case 2:
                entidad.setApellidos(valor.toString());
                break;
            case 3: 
                entidad.setTipo(Integer.parseInt(valor.toString()));
                break;
            case 4:
                entidad.setTurno(Integer.parseInt(valor.toString()));
                break;
            case 5:
                entidad.setLogin(valor.toString());
                break;
            default:
                entidad.setPassword(valor.toString());
                break;
        }
       
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    @Override
    public String getColumnName(int columnIndex){
           return columnName[columnIndex];
    }
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return String.class;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }

}
