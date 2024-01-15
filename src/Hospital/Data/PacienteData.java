/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Data;

/**
 *
 * @author IVAN
 */
import java.util.*;
import Hospital.*;
import Hospital.Entities.Paciente;
import javax.swing.JOptionPane;
public class PacienteData {
    public static List<Paciente> lista = new ArrayList<Paciente>();
    
    public PacienteData(){}
    public void Insertar(Paciente p){
        lista.add(p);
        JOptionPane.showMessageDialog(null, "Registrado");
    }
    public void Actualizar(Paciente p, String nombres, String apellidos, String telefono, String dni) {
        for (int i = 0; i < lista.size(); i++) {
            if (p.getCodigo() == lista.get(i).getCodigo()) {
                Paciente registro = lista.get(i);
                DatosPersonales nuevosDatos = obtenerDatosPersonales(nombres, apellidos, telefono, dni);
                registro.setDatosPersonales(nuevosDatos);
            }
        }
    }

    private DatosPersonales obtenerDatosPersonales(String nombres, String apellidos, String telefono, String dni) {
        return new DatosPersonales(nombres, apellidos, telefono, dni);
    }

    public void Eliminar(Paciente p) {
        for (int i = 0; i < lista.size(); i++) {
            if (p.getCodigo() == lista.get(i).getCodigo()) {
            }
        }
    }
    
    public int TraerNuevoCodigo(){
        return lista.size() + 1;
    }
    
    
}
