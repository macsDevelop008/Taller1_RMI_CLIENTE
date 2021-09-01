/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.prueba.view;

import com.mycompany.prueba.model.RMIInterface;
import com.mycompany.prueba.valueobject.EspecieVO;
import com.mycompany.prueba.valueobject.JugadorVO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo
 */
public class GUICreateSort extends javax.swing.JFrame {

    /**
     * Creates new form GUICreateSort
     */
    private RMIInterface servicioInterface;

    public GUICreateSort(RMIInterface serIInt) {
        initComponents();
        servicioInterface = serIInt;
        this.setLocationRelativeTo(null);



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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDSort = new javax.swing.JTextField();
        txtNameSort = new javax.swing.JTextField();
        jLabelIcoSort = new javax.swing.JLabel();
        btnCreateSort = new javax.swing.JButton();
        labelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Sort");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtIDSort.setName("txtIdSort"); // NOI18N
        getContentPane().add(txtIDSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 227, -1));

        txtNameSort.setName("txtNameSort"); // NOI18N
        getContentPane().add(txtNameSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 227, -1));

        jLabelIcoSort.setIcon(new javax.swing.ImageIcon("src/main/java/images/sort.png")); // NOI18N
        getContentPane().add(jLabelIcoSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        btnCreateSort.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnCreateSort.setText("Create");
        btnCreateSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, 40));

        labelfondo.setIcon(new javax.swing.ImageIcon("src/main/java/images/fondodos.jpg")); // NOI18N
        getContentPane().add(labelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*private void txtIDSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDSortActionPerformed*/

    private void btnCreateSortActionPerformed(java.awt.event.ActionEvent evt) //GEN-FIRST:event_btnCreateSortActionPerfoEspecieadd your handling code here:
        {
            EspecieVO evo = null;
            String id;
            String nom;
            double reg = 1;

            Date da = new Date();

            id = txtIDSort.getText().trim();
            nom = txtNameSort.getText().trim();




            evo = new EspecieVO(id, nom, reg, da);
            try {
                servicioInterface.addSort(evo);
                JOptionPane.showMessageDialog(this, "La especie de tu personaje ha sido cread");
            } catch (RemoteException ex) {
                Logger.getLogger(GUICreatePlayer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        //GEN-LAST:event_btnCreateSortActionPerformed

        /**
         * @param args the command line arguments
         */


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCreateSort;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabelIcoSort;
        private javax.swing.JLabel labelfondo;
        private javax.swing.JTextField txtIDSort;
        private javax.swing.JTextField txtNameSort;
        // End of variables declaration//GEN-END:variables
    }

