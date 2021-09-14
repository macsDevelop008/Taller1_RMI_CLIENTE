/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.prueba.view;

import com.mycompany.prueba.model.RMIInterface;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.rmi.RemoteException;
import javax.swing.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Camilo
 */
public class GUIGraficar extends javax.swing.JFrame {

    /**
     * Creates new form GUIGraficar
     */
    private RMIInterface servicioInterface;
    public GUIGraficar(RMIInterface serIInt) {
        initComponents();
        servicioInterface = serIInt;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGraficar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setTitle("Graficar");
        btnGraficar.setBackground(new java.awt.Color(51, 51, 51));
        btnGraficar.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 120, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Chart Sorts");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 150, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("src/main/java/images/fondodos.jpg")); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 823, 505));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
         JFreeChart grafico = null;
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        try {
            int nJugadores = servicioInterface.getPlayers().size();
            int nPersonajes = servicioInterface.getCharacters().size();
            int nEspecies = servicioInterface.getSorts().size();
            datos.addValue(nJugadores,"Grafica 1","Jugadores");
            datos.addValue(nPersonajes,"Grafica 1","Personajes");
            datos.addValue(nEspecies,"Grafica 1","Especies");
            DefaultPieDataset datosPie = new DefaultPieDataset();
            datosPie.setValue("Jugadores "+ nJugadores, nJugadores);
            datosPie.setValue("Personajes "+ nPersonajes, nPersonajes);
            datosPie.setValue("Especies " + nEspecies, nEspecies);
            grafico = ChartFactory.createPieChart("Grafica", datosPie, true, true, false);
            
        ChartPanel cPanel = new ChartPanel(grafico);
        JFrame informacion = new JFrame("Grafica");
        informacion.getContentPane().add(cPanel);
        informacion.pack();
        informacion.setVisible(true);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_btnGraficarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIGraficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIGraficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIGraficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIGraficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
