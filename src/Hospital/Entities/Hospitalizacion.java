/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Entities;

/**
 *
 * @author IVAN
 */
public class Hospitalizacion {
    private int codigohospitalizacion;
    private int codigopaciente;
    private int codigoempleado;
    private int numerocama;
    private String fechallegada;
    private String horallegada;
    private String fechasalida;
    private String horasalida;
    private int estaod;

    /**
     * @return the codigohospitalizacion
     */
    public int getCodigohospitalizacion() {
        return codigohospitalizacion;
    }

    /**
     * @param codigohospitalizacion the codigohospitalizacion to set
     */
    public void setCodigohospitalizacion(int codigohospitalizacion) {
        this.codigohospitalizacion = codigohospitalizacion;
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
     * @return the codigoempleado
     */
    public int getCodigoempleado() {
        return codigoempleado;
    }

    /**
     * @param codigoempleado the codigoempleado to set
     */
    public void setCodigoempleado(int codigoempleado) {
        this.codigoempleado = codigoempleado;
    }

    /**
     * @return the numerocama
     */
    public int getNumerocama() {
        return numerocama;
    }

    /**
     * @param numerocama the numerocama to set
     */
    public void setNumerocama(int numerocama) {
        this.numerocama = numerocama;
    }

    /**
     * @return the fechallegada
     */
    public String getFechallegada() {
        return fechallegada;
    }

    /**
     * @param fechallegada the fechallegada to set
     */
    public void setFechallegada(String fechallegada) {
        this.fechallegada = fechallegada;
    }

    /**
     * @return the horallegada
     */
    public String getHorallegada() {
        return horallegada;
    }

    /**
     * @param horallegada the horallegada to set
     */
    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

    /**
     * @return the fechasalida
     */
    public String getFechasalida() {
        return fechasalida;
    }

    /**
     * @param fechasalida the fechasalida to set
     */
    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    /**
     * @return the horasalida
     */
    public String getHorasalida() {
        return horasalida;
    }

    /**
     * @param horasalida the horasalida to set
     */
    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    /**
     * @return the estaod
     */
    public int getEstaod() {
        return estaod;
    }

    /**
     * @param estaod the estaod to set
     */
    public void setEstaod(int estaod) {
        this.estaod = estaod;
    }
}
