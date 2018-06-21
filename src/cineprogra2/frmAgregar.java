/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cineprogra2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ella no te ama;
 */
public class frmAgregar extends javax.swing.JFrame {

    DefaultListModel mdlLista= new DefaultListModel();
    ResultSet rstLista=null;
    ResultSet rs;
    ResultSet rstdirectores=null;
    DefaultComboBoxModel nombregeneros = new DefaultComboBoxModel();
    ResultSet rstgenero=null; 
    DefaultComboBoxModel mdlDirectores = new DefaultComboBoxModel();
    ResultSet rstproductores=null;
    DefaultComboBoxModel mdlPrductores=new DefaultComboBoxModel();
    Genero g= new Genero();
    Productores p = new Productores();
    Directores d= new Directores();
    
    public frmAgregar() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        txtID.setEnabled(true);
        rstgenero = g.llenarGeneros();
        rstproductores= p.llenarProductores();
        rstdirectores= d.llenarDirectores();
        
        
        try {
            while (rstgenero.next()){
                
                nombregeneros.addElement(rstgenero.getString(2));
            }
            cmbGenero.setModel(nombregeneros);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while (rstproductores.next()){
                
                mdlPrductores.addElement(rstproductores.getString(2));
            }
            cmbProductor.setModel(mdlPrductores);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
        while (rstdirectores.next()){
                
                mdlDirectores.addElement(rstdirectores.getString(2)+" "+rstdirectores.getString(3));
            }
            cmbdirector.setModel(mdlDirectores);
            } catch (SQLException ex) {
            Logger.getLogger(frmAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Limpiar() {
       txtAño.setText("");
       txtDuracion.setText("");
       txtID.setText("");
       txtTitulo.setText("");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btngenero = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbProductor = new javax.swing.JComboBox<>();
        btnproductor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbdirector = new javax.swing.JComboBox<>();
        btndirector = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Pelicula");

        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        jLabel2.setText("Titulo:");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jLabel3.setText("Año:");

        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });

        jLabel4.setText("Duracion:");

        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        jLabel5.setText("Seleccione un genero:");

        btngenero.setText("Agregar genero");
        btngenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngeneroActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione productor:");

        btnproductor.setText("Agregar productor");
        btnproductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductorActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione director:");

        btndirector.setText("Agregar director");
        btndirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndirectorActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar pelicula");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel8.setText("minutos");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbdirector, 0, 171, Short.MAX_VALUE)
                                    .addComponent(cmbProductor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnproductor)
                                    .addComponent(btngenero)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addComponent(btndirector))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnGuardar)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngenero))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnproductor))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbdirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndirector))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btngeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngeneroActionPerformed
        // TODO add your handling code here:
        int id = cmbGenero.getItemCount()+1;
        String nombre;
        do{
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del genero");    
        }while(nombre.isEmpty());
        
        g.insertar(id, nombre);
        nombregeneros.addElement(nombre);
    }//GEN-LAST:event_btngeneroActionPerformed

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void btnproductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductorActionPerformed
        // TODO add your handling code here:
        int id = cmbProductor.getItemCount()+1;
        String nombre;
        do{
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del productor");    
        }while(nombre.isEmpty());
         
        p.insertar(id, nombre);
        mdlPrductores.addElement(nombre);
    }//GEN-LAST:event_btnproductorActionPerformed

    private void btndirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndirectorActionPerformed
        // TODO add your handling code here:
        int id = cmbdirector.getItemCount()+1;
        String nombre;String apellidos;
          do{
         nombre =JOptionPane.showInputDialog("Ingrese el nombre del director");    
        }while(nombre.isEmpty());
          do{
        apellidos =JOptionPane.showInputDialog("Ingrese el o los apellidos del director");    
        }while(apellidos.isEmpty());
        
        
        d.insertar(id, nombre,apellidos);
        mdlDirectores.addElement(nombre+" "+apellidos);
    }//GEN-LAST:event_btndirectorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
        if(txtTitulo.getText().isEmpty() ||txtAño.getText().isEmpty() || txtDuracion.getText().isEmpty() ||txtID.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        }else{
            int idP=Integer.parseInt(txtID.getText());
            int idGenero=cmbGenero.getSelectedIndex()+1;
            int idProductor= cmbProductor.getSelectedIndex()+1;
            int idD=cmbdirector.getSelectedIndex()+1;
            String titulo=txtTitulo.getText();
            int anio=Integer.parseInt(txtAño.getText());
            String duracion = txtDuracion.getText();
            Pelicula p=new Pelicula();
           p.insertarPeliCompleta(idP, titulo, anio, duracion, idD, idProductor, idGenero);
            Limpiar();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
        char tecla = evt.getKeyChar();
        if(Character.isDigit(tecla)){
            
        }else{
            evt.consume();
        }
        if(txtID.getText().length()>2){
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        // TODO add your handling code here:
        char tecla = evt.getKeyChar();
        if(Character.isDigit(tecla)){
            
        }else{
            evt.consume();
        }
        if(txtAño.getText().length()>3){
            evt.consume();
        }
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        // TODO add your handling code here:
        char tecla = evt.getKeyChar();
        if(Character.isDigit(tecla)){
            
        }else{
            evt.consume();
        }
        if(txtDuracion.getText().length()>9){
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmPrincipal obj=new frmPrincipal();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmLogin log = new frmLogin();
                    log.setVisible(true);
                    new frmAgregar().setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(frmAgregar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btndirector;
    private javax.swing.JButton btngenero;
    private javax.swing.JButton btnproductor;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbProductor;
    private javax.swing.JComboBox<String> cmbdirector;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
