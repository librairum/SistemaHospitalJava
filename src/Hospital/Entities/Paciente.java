/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Entities;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author IVAN
 */
public class Paciente {
    private int codigo;
    private String apelidos;
    private String nombres;
    private String telefono;
    private String dni;
    public static int cantregistros = 0;
    public static String mensaje = "Hola Mundo";
    public static List<Paciente> lista = new ArrayList<Paciente>();
    /**
     * @return the codigo
     */
    
    public Paciente(){
        
         
    }
    
    public void Insertar(Paciente p ){                                
        lista.add(p);
    }
    public String Imprimir(int cCodigo){
//        JOptionPane.showMessageDialog(null, "DAO : Cantidad de registro es :" + String.valueOf(lista.size()));
        Paciente p =  lista.get(cCodigo);
        return "Codigo:" +  p.getCodigo() +  " Nombre :" +   p.getNombres()  + " " + p.getApelidos();
    }
    
    public Paciente BuscarxTipo(int opcion, String parametro){
        Paciente p=null;
        switch(opcion)
        {
            case 1:
                for(int i = 0 ; i < lista.size(); i ++){
                    if(lista.get(i).getDni().equals(parametro)){
                        p = lista.get(i);
                        break;
                    }
                }
                break;
            case 2:
                for(int i = 0 ; i < lista.size(); i ++){
                    if(lista.get(i).getNombres().contains(parametro)){
                        p = lista.get(i);
                        break;
                    }
                }
                break;
            default:
              p = lista.get(codigo);
                break;
        }
        return p;
    }
    public void Actualizar(Paciente p){
        Paciente registro = lista.get(p.getCodigo()-1);
        for(int i = 0 ; i < lista.size() ; i++){
            if(lista.get(i).getCodigo() == p.getCodigo())
            {
            registro.setNombres(p.getNombres());
            registro.setApelidos(p.getApelidos());
            registro.setTelefono(p.getTelefono());
            JOptionPane.showMessageDialog(null, "Actualizado");
            }
        }
     
    }
    public void Eliminar(Paciente p){
        for(int i = 0 ; i < Paciente.lista.size(); i++){
            if( Paciente.lista.get(i).getCodigo() == p.getCodigo()){
                Paciente.lista.remove(i);
                JOptionPane.showMessageDialog(null, "Eliminado");
            }
        }
    }
    public int TraerNuevoCodigo(){
        
        return this.lista.size()+1;
    }
    public String TraerCodAlfaNumerico(){
        String ceros = "0000";
        
        String codigo = "PA" + 
                         ceros.substring(0,
                            ceros.length() - String.valueOf(this.cantregistros).length())   
                         +
                        String.valueOf(this.cantregistros);
        return codigo;
    }
    public String TraerCantirarRegistros(){
        if( cantregistros == 0){
            return "Sin resgistros";
        }else{
            return String.valueOf(cantregistros);
        }
        
    }
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
     * @return the apelidos
     */
    public String getApelidos() {
        return apelidos;
    }

    /**
     * @param apelidos the apelidos to set
     */
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }
    
   

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
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
    

}
