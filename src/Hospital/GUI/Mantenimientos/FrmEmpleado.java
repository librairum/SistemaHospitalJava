/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.GUI.Mantenimientos;

import Hospital.Data.EmpleadoData;
import Hospital.Data.EmpleadoTabla;
import Hospital.Data.ListaData;
import Hospital.Entities.Camas;
import Hospital.Entities.Empleado;
import java.io.*;
import javax.swing.AbstractListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IVAN
 */

public class FrmEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEmpleado
     */
    EmpleadoData data = new EmpleadoData();
    EmpleadoTabla modelo ; 
    Empleado empleado ;
    ListSelectionModel tabla;
    private boolean esGrabar = false;
    public FrmEmpleado() {
        initComponents();
        CargarTipo();
        CargarTurno();
                              
        HabilitarControles(false);
        HabilitarBotones(true);
        limpiar();
        CargarLista();
        
        //Con esta linea lleno las JTABLE con registro(data)
        modelo  = new EmpleadoTabla(data.TraerEmpleados());
        this.tblControl.setModel(modelo);
        
        //Linea de codigo para agregar evento de JTABLE al seleccion registro
        tabla = this.tblControl.getSelectionModel();        
        tabla.addListSelectionListener(
        new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                   tabla = (ListSelectionModel)e.getSource();
                    if(tabla.isSelectionEmpty()){                    
                    }else{
                        int  selectedrow = tabla.getMinSelectionIndex();                        
                        modelo.getValueAt(selectedrow, 0);                         
                    }                 
            }
         }              
        );
        
        
    }
    void leerdatosdesdetxt() {
        try{
        Empleado e;
        
        FileReader fr = null;
        fr = new FileReader("C:\\Users\\IVAN\\Documents\\NetBeansProjects\\Program\\src\\BD\\Empleados.txt");
            BufferedReader b = new BufferedReader(fr);
            String cadena = "";
            Empleado.lista.clear();
            while( (cadena =  b.readLine()) != null){ 
              String[] datos =   cadena.split("\\|"); 
              e = new Empleado();              
             
              e.setCodigo(Integer.parseInt(datos[0]));
              e.setApellidos(datos[1]);
              e.setNombres(datos[2]);
              e.setTipo(Integer.parseInt(datos[3]));
              e.setLogin(datos[4]);
              e.setPassword(datos[5]);
              e.setTurno(Integer.parseInt(datos[6]));
              e.Insertar(e);
              data.Insertar(e);
            }
            
          
            b.close();
            }catch(FileNotFoundException ex )
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }catch(IOException ioexception){
                JOptionPane.showMessageDialog(null, ioexception.getMessage());
            }
    }
     void cargarDatos(){
         
         String[] datos = new String[Empleado.lista.size()];
        int x = 0;
        for(Empleado  registro: Empleado.lista){                        
            datos[x] = String.valueOf(registro.getCodigo() + " - "+ registro.getNombres());
            x++;
        }
        this.lstEmpleados.setListData(datos);
          //  this.tblControl.set
        //this.lst.setListData(datos);
    }
     void CargarLista(){                      
        try{
            
            leerdatosdesdetxt();
            cargarDatos();
                                                      
        }catch(Exception ex)
        {
        
        }
                         
    }
    private void HabilitarBotones(boolean valor){
        this.btnNuevo.setEnabled(valor);
        this.btnEditar.setEnabled(valor);
        this.btnEliminar.setEnabled(valor);
        this.btnGuardar.setEnabled(!valor);
        this.btnCancelar.setEnabled(!valor);
        this.btnSalir.setEnabled(valor);
    }
    private void HabilitarControles(boolean valor){
        this.txtCodigo.setEnabled(false);
        this.txtNombres.setEnabled(valor);
        this.txtApellidos.setEnabled(valor);
        this.txtLogin.setEnabled(valor);
        this.txtPassword.setEnabled(valor);
        this.cboTipo.setEnabled(valor);
        this.cboTurno.setEnabled(valor);
    }
    private void cancenlar(){
        HabilitarControles(false);
        HabilitarBotones(true, true, true, false, false, true);
        limpiar();
        CargarLista();
        esGrabar = false;
    }
    private void mensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    private void CargarTipo(){
        this.cboTipo.removeAllItems();
        //this.cboTipo.setModel(new ListaData());
        this.cboTipo.addItem("Administrador");
        this.cboTipo.addItem("Cajero");
    }
    private void CargarTurno(){
        this.cboTurno.removeAllItems();
        this.cboTurno.addItem("Dia");
        this.cboTurno.addItem("Noche");
    }
    private int getTurnoValue(String pDescripcion){
        int  codigo = 0;
        if(pDescripcion.equals("Dia") ){
            codigo = 0; 
        }else if(pDescripcion.equals("Noche")){
            codigo = 1;
        }
        return codigo;
    }
    private int getTipoValue(String pDescripcion){
        int codigo = 0;
        if(pDescripcion.equals("Administrador")){
        
        }
        return codigo ;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblControl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cboTurno = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEmpleados = new javax.swing.JList();

        tblControl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblControlMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblControl);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 5));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(btnNuevo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setLayout(new java.awt.GridLayout(7, 2));

        jLabel1.setText("codigo :");
        jPanel1.add(jLabel1);
        jPanel1.add(txtCodigo);

        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2);
        jPanel1.add(txtApellidos);

        jLabel3.setText("Nombres :");
        jPanel1.add(jLabel3);
        jPanel1.add(txtNombres);

        jLabel4.setText("Tipo :");
        jPanel1.add(jLabel4);

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboTipo);

        jLabel5.setText("Login :");
        jPanel1.add(jLabel5);
        jPanel1.add(txtLogin);

        jLabel6.setText("Password :");
        jPanel1.add(jLabel6);

        txtPassword.setText("jPasswordField1");
        jPanel1.add(txtPassword);

        jLabel7.setText("Turno:");
        jPanel1.add(jLabel7);

        cboTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cboTurno);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lstEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEmpleadosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
          HabilitarControles(true);
        HabilitarBotones(false);
        limpiar();
        int codigo = new EmpleadoData().TraerCodigoEmpleado();
        this.txtCodigo.setText(String.valueOf(codigo));
        esGrabar = true;
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void limpiar(){
        this.txtCodigo.setText("");
        this.txtNombres.setText("");
        this.txtLogin.setText("");
        this.txtPassword.setText("");
        this.txtApellidos.setText("");
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    private boolean Validar(){
        if(txtApellidos.getText().equals("") )
        {
            mensaje("Ingresar apellido");
            this.txtApellidos.requestFocus();
            return false;
        }
        if(txtNombres.getText().equals("")){
            mensaje("Ingresar nombres");
            this.txtNombres.requestFocus();
            return false;
        }
        if(txtLogin.getText().equals("")){
            mensaje("Ingresar Login");
            this.txtLogin.requestFocus();
            return false;
        }
        
            if(txtPassword.getPassword().length == 0 ){
               mensaje("Ingresar clave");
               this.txtPassword.requestFocus();
               return false;
            }
        
        return true;
    }
    private void Exportarafichero(){
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
         fw = new FileWriter("C:\\Users\\IVAN\\Documents\\NetBeansProjects\\Program\\src\\BD\\Empleados.txt");                  
          pw = new PrintWriter(fw);
          
         for(int x = 0 ; x < Empleado.lista.size(); x++){
             Empleado fila =  Empleado.lista.get(x);
          
             String linea = fila.getCodigo() + "|" + fila.getApellidos() + "|" 
                     +  fila.getNombres() + "|" + fila.getTipo() + "|" 
                     + fila.getLogin() + "|"+ fila.getPassword() + "|"+ fila.getTurno();             
              pw.println(linea);
         }
        }catch(Exception ex){
         ex.printStackTrace();
        }finally{
            try{
                if(fw != null){
                    fw.close();
                }
            }catch(Exception ex2){
                ex2.printStackTrace();
            }
         }
            
        }
    void HabilitarBotones(boolean nuevo, boolean editar, boolean eliminar, 
                          boolean guardar, boolean cancelar, boolean salir ){
        this.btnNuevo.setEnabled(nuevo);
        this.btnEditar.setEnabled(editar);
        this.btnEliminar.setEnabled(eliminar);
        this.btnGuardar.setEnabled(guardar);
        this.btnCancelar.setEnabled(cancelar);
        this.btnSalir.setEnabled(salir);
    }
    void cancelar(){
        HabilitarControles(false);
        HabilitarBotones(true, true, true, false, false, true);
        limpiar();
        CargarLista();
        esGrabar = false;
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(!Validar()) return;
        empleado = new Empleado();
        empleado.setCodigo(Integer.parseInt(txtCodigo.getText()));
        empleado.setNombres(this.txtNombres.getText());
        empleado.setApellidos(this.txtApellidos.getText());
        empleado.setTipo(this.cboTipo.getSelectedIndex() + 1);
        empleado.setTurno(this.cboTurno.getSelectedIndex() + 1);
        empleado.setLogin(this.txtLogin.getText());
        
        empleado.setPassword(this.txtPassword.getText());
        if(esGrabar){
            
            data.Insertar(empleado);
            empleado.Insertar(empleado);
        }else{            
            data.Actualizar(empleado);
            empleado.Actualizar(empleado);
        }
        Exportarafichero();
        modelo  = new EmpleadoTabla(data.TraerEmpleados());
        this.tblControl.setModel(modelo);
        
         HabilitarControles(false);
        HabilitarBotones(true);
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        HabilitarControles(true);
        HabilitarBotones(false);
        esGrabar = false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        limpiar();
        esGrabar = false;
        empleado = new Empleado();
        
         int indice = this.tblControl.getSelectionModel().getMinSelectionIndex();         
         String codigo =   this.tblControl.getValueAt(indice, 0).toString();                    
         empleado.setCodigo(Integer.parseInt(codigo));
         data.Eliminar(empleado);
        
         modelo  = new EmpleadoTabla(data.TraerEmpleados());
        this.tblControl.setModel(modelo);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        HabilitarControles(false);
        HabilitarBotones(true);
        limpiar();
        esGrabar = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblControlMouseClicked
        if(this.tblControl.getSelectionModel() != null){
            int indice = this.tblControl.getSelectionModel().getMinSelectionIndex();
            //"Codigo","Nombres","Apellidos","Tipo","Turno","Login","Clave"};
            String codigo =  this.tblControl.getValueAt(indice, 0).toString();
            this.txtCodigo.setText(codigo);
            String nombres = this.tblControl.getValueAt(indice, 1).toString();
            this.txtNombres.setText(nombres);
            String apellidos = this.tblControl.getValueAt(indice, 2).toString();
            this.txtApellidos.setText(apellidos);
            int tipo ;
            tipo = Integer.parseInt(this.tblControl.getValueAt(indice, 3).toString());
            this.cboTipo.setSelectedIndex(tipo - 1);;
            int turno = Integer.parseInt(this.tblControl.getValueAt(indice, 4).toString());
            this.cboTurno.setSelectedIndex(turno - 1);
            String login = this.tblControl.getValueAt(indice, 5).toString();
            this.txtLogin.setText(login);
            String clave = this.tblControl.getValueAt(indice, 6).toString();
            this.txtPassword.setText(clave);
        }
    }//GEN-LAST:event_tblControlMouseClicked

    private void lstEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEmpleadosValueChanged
        String valor =  this.lstEmpleados.getSelectedValue().toString();
        int posicion = valor.indexOf("-");
        valor =  valor.substring(0, posicion);
        
        Empleado e = new Empleado();
        e.setCodigo(Integer.parseInt(valor.trim()));
        Empleado dato = e.Buscar(e);
        this.txtCodigo.setText(String.valueOf(dato.getCodigo()));
        this.cboTipo.setSelectedIndex(dato.getTipo() - 1 );
        this.cboTurno.setSelectedIndex(dato.getTurno() - 1);
        this.txtApellidos.setText(dato.getApellidos());
        this.txtLogin.setText(dato.getLogin());
        this.txtNombres.setText(dato.getNombres());
        this.txtPassword.setText(dato.getPassword());
    }//GEN-LAST:event_lstEmpleadosValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JComboBox cboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstEmpleados;
    private javax.swing.JTable tblControl;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
