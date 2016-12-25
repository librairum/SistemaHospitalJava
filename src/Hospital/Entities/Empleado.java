/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IVAN
 */
public class Empleado {
    private int codigo;
    private String apellidos;
    private String nombres;
    private int tipo;
    private String login;
    private String password;
    private int turno;
    public static List<Empleado> lista = new ArrayList<Empleado>();
    public Empleado(){
    }
    public void Insertar(Empleado e){
        this.codigo = e.getCodigo();
        this.apellidos = e.getApellidos();
        this.nombres = e.getNombres();
        this.tipo = e.getTipo();
        this.login = e.getLogin();
        this.password = e.getPassword();
        this.turno = e.getTurno();
                lista.add(e);
    }
    public void Actualizar(Empleado e)
    {
        for(int i = 0 ; i < lista.size(); i++)
        {
            if(lista.get(i).getCodigo() == e.getCodigo())
            {
                this.setApellidos(e.getApellidos());
                this.setLogin(e.getLogin());
                this.setNombres(e.getNombres());
                this.setPassword(e.getPassword());
                this.setTipo(e.getTipo());
                this.setTurno(e.getTurno());
            }
        }
    }
    public Empleado Buscar(Empleado e) {
        Empleado registro = null;
        for(int i = 0 ; i < lista.size(); i++)
        {
            if(lista.get(i).getCodigo() == e.getCodigo())
            {
                registro =  lista.get(i);
            }
        }
        return registro;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }
}
