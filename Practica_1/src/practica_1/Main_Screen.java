/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import javax.swing.JOptionPane;

/**
 *
 * @author danii
 */
public class Main_Screen extends javax.swing.JFrame {
    
    Automata aF;

    /**
     * Creates new form Main_Screen
     */
    public Main_Screen() {
        initComponents();
        JPHilera.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFExpresion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCrearAF = new javax.swing.JButton();
        JPHilera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TFCadena = new javax.swing.JTextField();
        btnEvaluarH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLMostrarAF = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese la expresión regular");

        btnCrearAF.setText("Crear Automata");
        btnCrearAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAFActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese la hilera a evaluar");

        btnEvaluarH.setText("Evaluar Hilera");
        btnEvaluarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarHActionPerformed(evt);
            }
        });

        JLMostrarAF.setEditable(false);
        JLMostrarAF.setColumns(20);
        JLMostrarAF.setRows(5);
        jScrollPane1.setViewportView(JLMostrarAF);

        javax.swing.GroupLayout JPHileraLayout = new javax.swing.GroupLayout(JPHilera);
        JPHilera.setLayout(JPHileraLayout);
        JPHileraLayout.setHorizontalGroup(
            JPHileraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHileraLayout.createSequentialGroup()
                .addGroup(JPHileraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPHileraLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2))
                    .addGroup(JPHileraLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnEvaluarH)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPHileraLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(TFCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPHileraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        JPHileraLayout.setVerticalGroup(
            JPHileraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPHileraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEvaluarH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TFExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnCrearAF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(JPHilera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TFExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCrearAF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPHilera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAFActionPerformed
        String hilera = TFExpresion.getText().replace(".", "");
        aF = new Automata(hilera);
        JPHilera.setVisible(true);
        JLMostrarAF.setText(aF.mostrarAF());
    }//GEN-LAST:event_btnCrearAFActionPerformed

    private void btnEvaluarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarHActionPerformed
        boolean esAceptada = aF.run(TFCadena.getText());
        if (esAceptada == true){
            JOptionPane.showMessageDialog(null, "La hilera es aceptada");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La hilera es rechazada");    
        }
    }//GEN-LAST:event_btnEvaluarHActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea JLMostrarAF;
    private javax.swing.JPanel JPHilera;
    private javax.swing.JTextField TFCadena;
    private javax.swing.JTextField TFExpresion;
    private javax.swing.JButton btnCrearAF;
    private javax.swing.JButton btnEvaluarH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
