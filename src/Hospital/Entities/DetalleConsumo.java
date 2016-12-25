/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Entities;

/**
 *
 * @author IVAN
 */
public class DetalleConsumo {
    /*
     Código de consumo
int
Código de producto
int
Cantidad
int
Precio unitario
double
Subtotal
double
     */
    private int codigoconsumo;
    private int codigoproducto;
    private int cantidad;
    private double preciounitario;
    private double subtotal;

    /**
     * @return the codigoconsumo
     */
    public int getCodigoconsumo() {
        return codigoconsumo;
    }

    /**
     * @param codigoconsumo the codigoconsumo to set
     */
    public void setCodigoconsumo(int codigoconsumo) {
        this.codigoconsumo = codigoconsumo;
    }

    /**
     * @return the codigoproducto
     */
    public int getCodigoproducto() {
        return codigoproducto;
    }

    /**
     * @param codigoproducto the codigoproducto to set
     */
    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the preciounitario
     */
    public double getPreciounitario() {
        return preciounitario;
    }

    /**
     * @param preciounitario the preciounitario to set
     */
    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
