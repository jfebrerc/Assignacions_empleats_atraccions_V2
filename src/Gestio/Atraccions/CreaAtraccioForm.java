/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestio.Atraccions;

import Classes.Atraccio;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu
 */
public class CreaAtraccioForm extends javax.swing.JFrame {

    /**
     * Creates new form CreaAtraccioForm
     */
    public CreaAtraccioForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Crear Atraccio");
        
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
        nomAtraccio = new javax.swing.JTextField();
        tipusAtraccio = new javax.swing.JTextField();
        dataInnauguracio = new javax.swing.JTextField();
        alturaMin = new javax.swing.JTextField();
        accessibilitat = new javax.swing.JTextField();
        Express = new javax.swing.JTextField();
        CrearButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Nova Atracció");

        nomAtraccio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomAtraccioActionPerformed(evt);
            }
        });

        tipusAtraccio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipusAtraccioActionPerformed(evt);
            }
        });

        dataInnauguracio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataInnauguracioActionPerformed(evt);
            }
        });

        alturaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaMinActionPerformed(evt);
            }
        });

        accessibilitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessibilitatActionPerformed(evt);
            }
        });

        Express.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpressActionPerformed(evt);
            }
        });

        CrearButton.setText("Crear");
        CrearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Esborrar");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("nomAtraccio");

        jLabel4.setText("tipusAtraccio");

        jLabel5.setText("dataInnauguracio");

        jLabel6.setText("alturaMinima");

        jLabel7.setText("accessibilitat");

        jLabel8.setText("accesExpress");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CrearButton)
                .addGap(18, 18, 18)
                .addComponent(ClearButton)
                .addGap(18, 18, 18)
                .addComponent(CancelButton)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Express, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accessibilitat, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alturaMin, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataInnauguracio, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipusAtraccio, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomAtraccio, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nomAtraccio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tipusAtraccio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(dataInnauguracio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(alturaMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(accessibilitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(Express, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearButton)
                    .addComponent(ClearButton)
                    .addComponent(CancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void CrearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearButtonActionPerformed
        nomAtraccio.getText();   
        tipusAtraccio.getText();
        dataInnauguracio.getText();
        alturaMin.getText();
        accessibilitat.getText();
        Express.getText();
        
        Atraccio.arrayAtraccio.add(new Atraccio(nomAtraccio.getText(),tipusAtraccio.getText(),dataInnauguracio.getText(),alturaMin.getText(),accessibilitat.getText(),Express.getText()));
        JOptionPane.showMessageDialog(this, "Atraccio registrada correctament");
        nomAtraccio.setText("");
        tipusAtraccio.setText("");
        dataInnauguracio.setText("");
        alturaMin.setText("");
        accessibilitat.setText("");
        Express.setText("");
    }//GEN-LAST:event_CrearButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        nomAtraccio.setText("");
        tipusAtraccio.setText("");
        dataInnauguracio.setText("");
        alturaMin.setText("");
        accessibilitat.setText("");
        Express.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void nomAtraccioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomAtraccioActionPerformed
        
        
    }//GEN-LAST:event_nomAtraccioActionPerformed

    private void tipusAtraccioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipusAtraccioActionPerformed
     
    }//GEN-LAST:event_tipusAtraccioActionPerformed

    private void dataInnauguracioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataInnauguracioActionPerformed
        
    }//GEN-LAST:event_dataInnauguracioActionPerformed

    private void alturaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaMinActionPerformed
        
    }//GEN-LAST:event_alturaMinActionPerformed

    private void accessibilitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessibilitatActionPerformed
       
    }//GEN-LAST:event_accessibilitatActionPerformed

    private void ExpressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpressActionPerformed
        
    }//GEN-LAST:event_ExpressActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
        MenuAtraccioForm menuAtraccio = new MenuAtraccioForm();
        menuAtraccio.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreaAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreaAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreaAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreaAtraccioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreaAtraccioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton CrearButton;
    private javax.swing.JTextField Express;
    private javax.swing.JTextField accessibilitat;
    private javax.swing.JTextField alturaMin;
    private javax.swing.JTextField dataInnauguracio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nomAtraccio;
    private javax.swing.JTextField tipusAtraccio;
    // End of variables declaration//GEN-END:variables
}
