/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Entities;

/**
 *
 * @author IVAN
 */
public class Consumo {
    /*
     Código de consumo
int
Autogenerado
Código de paciente
int
Fecha consumo
String
DD/MM/AAAA
Total a Pagar
double
Estado
int
0 = Pendiente
     */
    private int codigo;
    private int codigopaciente;
    private String fechaconsumo;
    private double totalapagar;
    private int estado;

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
     * @return the codigopaciente
     */
    public int getCodigopaciente() {
        return codigopaciente;
    }

    /**
     * @param codigopaciente the codigopaciente to set
     */
    public void setCodigopaciente(int codigopaciente) {
        this.codigopaciente = codigopaciente;
    }

    /**
     * @return the fechaconsumo
     */
    public String getFechaconsumo() {
        return fechaconsumo;
    }

    /**
     * @param fechaconsumo the fechaconsumo to set
     */
    public void setFechaconsumo(String fechaconsumo) {
        this.fechaconsumo = fechaconsumo;
    }

    /**
     * @return the totalapagar
     */
    public double getTotalapagar() {
        return totalapagar;
    }

    /**
     * @param totalapagar the totalapagar to set
     */
    public void setTotalapagar(double totalapagar) {
        this.totalapagar = totalapagar;
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
