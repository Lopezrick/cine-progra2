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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmBuscar extends javax.swing.JFrame {

    DefaultComboBoxModel nombregeneros = new DefaultComboBoxModel();
    DefaultTableModel mdlTabla=new DefaultTableModel();
    ResultSet rstTabla=null;
    ResultSet rstgenero=null;
    Genero g= new Genero();
    Pelicula a=new Pelicula();
    /**
     * Creates new form frmBuscar
     */
    public frmBuscar() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        rstgenero = g.llenarGeneros();
        rbID.setSelected(true);
        rbID.setEnabled(false);
        txtTitulo.setEnabled(false);
        txtID.requestFocus();
        
        try {
            while (rstgenero.next()){
                
                nombregeneros.addElement(rstgenero.getString(2));
            }
            cmbGenero.setModel(nombregeneros);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbGenero.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbID = new javax.swing.JRadioButton();
        rbTitulo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        btnMostrartodo = new javax.swing.JButton();
        rbGenero = new javax.swing.JRadioButton();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(mdlTabla);
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Buscar por:");

        rbID.setText("ID pelicula");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        rbTitulo.setText("Titulo ");
        rbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTituloActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el ID:");

        jLabel3.setText("Ingrese el titulo:");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        btnMostrartodo.setText("Todas las peliculas");
        btnMostrartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrartodoActionPerformed(evt);
            }
        });

        rbGenero.setText("Genero");
        rbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbGeneroActionPerformed(evt);
            }
        });

        jLabel4.setText("Generos:");

        jTable2.setModel(mdlTabla);
        jScrollPane2.setViewportView(jTable2);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

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
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbID)
                    .addComponent(rbTitulo)
                    .addComponent(rbGenero))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrartodo)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(rbID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbGenero)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMostrartodo)
                                    .addComponent(btnBuscar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LimpiarTabla(){
        int filas=mdlTabla.getRowCount();
        for (int i=0; i<filas;i++){
            mdlTabla.removeRow(0);
        }
    }
    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
        // TODO add your handling code here:
        rbGenero.setEnabled(true);
         cmbGenero.setEnabled(false);
            rbID.setEnabled(false);
            rbTitulo.setEnabled(true);
          rbTitulo.setSelected(false);
         rbGenero.setSelected(false);
        txtTitulo.setEnabled(false);
        txtTitulo.setText("");
        txtID.setEnabled(true);
        txtID.requestFocus();  
        
        
    }//GEN-LAST:event_rbIDActionPerformed

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

    private void rbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTituloActionPerformed
        // TODO add your handling code here:
        
         rbID.setSelected(false);
         rbGenero.setSelected(false);
         rbID.setEnabled(true);
         rbTitulo.setEnabled(false);
         rbGenero.setEnabled(true);
         cmbGenero.setEnabled(false);
        txtID.setEnabled(false);
        txtID.setText("");
        txtTitulo.setEnabled(true);
        txtTitulo.requestFocus();   
        
        
    }//GEN-LAST:event_rbTituloActionPerformed

    private void btnMostrartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrartodoActionPerformed
        // TODO add your handling code here:
        LimpiarTabla();
        mdlTabla.setColumnIdentifiers(new Object []{"ID","Titulo","Genero","Año","Duracion","Productor","Nombre director","Apellidos"});
        Pelicula a = new Pelicula();
        rstTabla=a.mostrarTodas();
        
            try {
                while(rstTabla.next()){
                    mdlTabla.addRow(new Object []{(rstTabla.getInt(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getInt(4)),(rstTabla.getInt(5)),(rstTabla.getString(6)),(rstTabla.getString(7)),(rstTabla.getString(8))});
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmBuscar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
    }//GEN-LAST:event_btnMostrartodoActionPerformed

    private void rbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbGeneroActionPerformed
        // TODO add your handling code here:
        cmbGenero.setEnabled(true);
        rbID.setSelected(false);
         rbTitulo.setSelected(false);
        txtID.setText("");
        txtID.setEnabled(false);
        txtTitulo.setText("");
        txtTitulo.setEnabled(false);
        rbID.setEnabled(true);
        rbTitulo.setEnabled(true);
        rbGenero.setEnabled(false);
    }//GEN-LAST:event_rbGeneroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        rstTabla=null;
        LimpiarTabla();
        if(rbID.isSelected()){
        if(!(txtID.getText().isEmpty())){
        
            int id=Integer.parseInt(txtID.getText());
            if(id>0){
             rstTabla=a.buscarporID(id);
            
            
        mdlTabla.setColumnIdentifiers(new Object []{"ID","Titulo","Genero","Año","Duracion","Productor","Nombre director","Apellidos"});
        
            try {
                while(rstTabla.next()){
                    mdlTabla.addRow(new Object []{(rstTabla.getInt(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getInt(4)),(rstTabla.getInt(5)),(rstTabla.getString(6)),(rstTabla.getString(7)),(rstTabla.getString(8))});
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmBuscar.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtID.setText("");
            txtID.requestFocus();   
            }
            else{
             JOptionPane.showMessageDialog(null,"Debe ingresar un ID valido");   
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el ID");
        }    
        }
        
        else if(rbTitulo.isSelected()){
        if(!(txtTitulo.getText().isEmpty())){
        
            
            rstTabla=a.buscarporTitulo("'"+txtTitulo.getText()+"'");
            
            
        mdlTabla.setColumnIdentifiers(new Object []{"ID","Titulo","Genero","Año","Duracion","Productor","Nombre director","Apellidos"});
        
            try {
                while(rstTabla.next()){
                    mdlTabla.addRow(new Object []{(rstTabla.getInt(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getInt(4)),(rstTabla.getInt(5)),(rstTabla.getString(6)),(rstTabla.getString(7)),(rstTabla.getString(8))});
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No se encontró");
                Logger.getLogger(frmBuscar.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtTitulo.setText("");
            txtTitulo.requestFocus();
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Debe ingresar el Titulo");
        }    
        }
        else if(rbGenero.isSelected()){
            rstTabla=a.buscarporGenero(cmbGenero.getSelectedIndex()+1);
            mdlTabla.setColumnIdentifiers(new Object []{"ID","Titulo","Genero","Año","Duracion","Productor","Nombre director","Apellidos"});
        
            try {
                while(rstTabla.next()){
                    mdlTabla.addRow(new Object []{(rstTabla.getInt(1)),(rstTabla.getString(2)),(rstTabla.getString(3)),(rstTabla.getInt(4)),(rstTabla.getInt(5)),(rstTabla.getString(6)),(rstTabla.getString(7)),(rstTabla.getString(8))});
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"No se encontró");
                Logger.getLogger(frmBuscar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmPrincipal obj =new frmPrincipal();
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
            java.util.logging.Logger.getLogger(frmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmBuscar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(frmBuscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrartodo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rbGenero;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbTitulo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
