/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital.Data;

import Hospital.Entities.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author fredr
 */
public class EmpleadoUpdater {
    private final Empleado registro;
    private final Empleado nuevo;

    public EmpleadoUpdater(Empleado registro, Empleado nuevo) {
        this.registro = registro;
        this.nuevo = nuevo;
    }

    public void actualizarEmpleado() {
        actualizarCampos();
        mostrarMensajeActualizacion();
    }

    private void actualizarCampos() {
        registro.setNombres(nuevo.getNombres());
        registro.setApellidos(nuevo.getApellidos());
    }

    private void mostrarMensajeActualizacion() {
        String nsj = registro.getNombres() + "\n" + registro.getApellidos() + "\n" +
                registro.getTipo() + "\n" + registro.getTurno() + "\n" +
                registro.getLogin() + "\n";
        JOptionPane.showMessageDialog(null, nsj);
    }
}
