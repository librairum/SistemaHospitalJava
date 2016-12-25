/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
 class Tipo
{
     private String codigo;
     private String descripcion;
     public String getCodigo(){
        return codigo;
     }
     public void setCodigo(String codigo){
         this.codigo = codigo;
     }
     public String getDescripcion(){
         return descripcion;
     }
     public void setDescripcion(String descripcion){
         this.descripcion = descripcion;
     }
     public List<Tipo> TraerLista(){
         List<Tipo> lista = new ArrayList<Tipo>();
         Tipo t ;
         t = new Tipo();
         t.setCodigo("0"); t.setDescripcion("Administrador");
         lista.add(t);
         t = new Tipo();
         t.setCodigo("1"); t.setDescripcion("Empleado");
         lista.add(t);
         return lista;
     }
}
/*Creacion de clase Turno*/
    class Turno extends AbstractListModel implements ComboBoxModel{
        private int codigo;
        private String descripcion;
        public List<Turno> lista = new ArrayList<Turno>();
        public int getCodigo(){
            return codigo;
        }
        public void setCodigo(int codigo){
            this.codigo = codigo;
        }
        public String getDescripcion(){
            return descripcion;
        }
        public void setDescripcion(String descripcion){
            this.descripcion = descripcion;
        }
        public List<Turno> TraerTurnos(){
            Turno t = null;
            List<Turno> lista = new ArrayList<Turno>();
            t = new Turno();
            t.setCodigo(0);
            t.setDescripcion("Noche");
            
            lista.add(t);
            t = new Turno();
            t.setCodigo(1);
            t.setDescripcion("Dia");
            lista.add(t);
            return lista;
        }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }
/*Fin Creacion de clase Turno*/
public class ListaData extends AbstractListModel 
implements ComboBoxModel{
    ArrayList listaTipos = new ArrayList();
    public ListaData(){
        
    }
    public void TraerTipos(){
    for(int i = 0; i < new Tipo().TraerLista().size(); i++){
            listaTipos.add(new Tipo().TraerLista().get(i).getDescripcion());
        }
    }
    public void TraerTurnos(){
    
    }
    String selection = "0";
   
    @Override
    public int getSize() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return listaTipos.size();
    }

    @Override
    public Object getElementAt(int index) {
        //throw new UnsupportedOperationException("Not supported yet.");
        return listaTipos.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        //throw new UnsupportedOperationException("Not supported yet.");
        selection = (String)anItem;
    }

    @Override
    public Object getSelectedItem() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return selection;
    }
    
}
