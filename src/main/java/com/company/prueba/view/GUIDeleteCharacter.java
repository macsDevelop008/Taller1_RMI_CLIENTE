/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.prueba.view;

import com.mycompany.prueba.model.RMIInterface;
import com.mycompany.prueba.valueobject.JugadorVO;
import com.mycompany.prueba.valueobject.PersonajeVO;

import javax.swing.*;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camilo
 */
public class GUIDeleteCharacter extends javax.swing.JFrame {

    /**
     * Creates new form GUICreateCharacter
     */private RMIInterface servicioInterface;
    public GUIDeleteCharacter(RMIInterface serIInt) {
        initComponents();
        servicioInterface = serIInt;
        this.setLocationRelativeTo(null);
        addPlayerInCho();
        choChar.setEnabled(false);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDeleteChar = new javax.swing.JButton();
        txtStrenChar = new javax.swing.JTextField();
        txtManaChar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        choPlayer = new java.awt.Choice();
        txtEnergyChar = new javax.swing.JTextField();
        choChar = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        txtNameChar = new javax.swing.JTextField();
        jLabelIconChar = new javax.swing.JLabel();
        btnSearchCha = new javax.swing.JButton();
        jLabelFondoChar = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Character");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 78, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Character :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 115, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mana :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Energy :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        btnDeleteChar.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnDeleteChar.setText("Delete");
        btnDeleteChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCharActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 100, 30));

        txtStrenChar.setName("txtStrenChar"); // NOI18N
        getContentPane().add(txtStrenChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 180, -1));

        txtManaChar.setName("txtManaChar"); // NOI18N
        getContentPane().add(txtManaChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Select Player");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        getContentPane().add(choPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, -1));

        txtEnergyChar.setName("txtEnerChar"); // NOI18N
        getContentPane().add(txtEnergyChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 180, -1));
        getContentPane().add(choChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, -1));

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Strength :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        getContentPane().add(txtNameChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));

        jLabelIconChar.setIcon(new javax.swing.ImageIcon("src/main/java/images/characterlogo.png")); // NOI18N
        getContentPane().add(jLabelIconChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        btnSearchCha.setFont(new java.awt.Font("Eras Medium ITC", 1, 14)); // NOI18N
        btnSearchCha.setText("Search");
        btnSearchCha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchChaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchCha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 110, 30));

        jLabelFondoChar.setIcon(new javax.swing.ImageIcon("src/main/java/images/fondodos.jpg")); // NOI18N
        getContentPane().add(jLabelFondoChar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addPlayerInCho(){
        try {
            for ( JugadorVO player:
                    servicioInterface.getPlayers()) {
                choPlayer.add(player.getId()+". "+player.getApodo());
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void btnSearchChaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchChaActionPerformed
        PersonajeVO pvo = null;
        String id;
        String cue;
        String con;
        String apo;
        String email;


        try{
            id = choChar.getSelectedItem().split("\\.")[0];
            pvo = servicioInterface.getCharacter(id);


        }
        catch(RemoteException ex){
            Logger.getLogger(GUICreatePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(pvo != null)
        {
            txtNameChar.setText(pvo.getNombre());
            txtStrenChar.setText(String.valueOf(pvo.getFuerza()));
            txtManaChar.setText(String.valueOf(pvo.getMana()));
            txtEnergyChar.setText(String.valueOf(pvo.getEnergia()));

        }
        else{
            JOptionPane.showMessageDialog(this, "Jugador no existe");
            txtNameChar.setText("");
            txtStrenChar.setText("");
            txtManaChar.setText("");
            txtEnergyChar.setText("");
        }
    }//GEN-LAST:event_btnSearchChaActionPerformed

    private void btnDeleteCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCharActionPerformed

        String id;
        id = choChar.getSelectedItem().split("\\.")[0];
        try{
            servicioInterface.deleteCharater(id);
            JOptionPane.showMessageDialog(this, "Character delete");

        }
        catch(RemoteException ex){
            Logger.getLogger(GUICreatePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnDeleteCharActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        choChar.setEnabled(true);
        String idPlayer;
        idPlayer = choPlayer.getSelectedItem().split("\\.")[0];
        Date fecha = new Date();
        try {
            for ( PersonajeVO character:
                    servicioInterface.getCharactersByPlayer(new PersonajeVO(idPlayer,fecha))) {
                choChar.add(character.getId()+". "+character.getNombre());
            }

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteChar;
    private javax.swing.JButton btnSearchCha;
    private java.awt.Choice choChar;
    private java.awt.Choice choPlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFondoChar;
    private javax.swing.JLabel jLabelIconChar;
    private javax.swing.JTextField txtEnergyChar;
    private javax.swing.JTextField txtManaChar;
    private javax.swing.JTextField txtNameChar;
    private javax.swing.JTextField txtStrenChar;
    // End of variables declaration//GEN-END:variables
}
