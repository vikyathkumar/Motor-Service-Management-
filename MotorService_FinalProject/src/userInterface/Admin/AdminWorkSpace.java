/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Admin;

import userInterface.Admin.ManageEmployee;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.Employee.AddClientJPanel;
import userInterface.Admin.AddEmployee;
import userInterface.Employee.ManageClients;

/**
 *
 * @author vamsimokari
 */
public class AdminWorkSpace extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    public AdminWorkSpace(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAddclient = new javax.swing.JButton();
        btnManageclient = new javax.swing.JButton();
        btnAddclient3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Workspace");

        btnAddclient.setBackground(new java.awt.Color(115, 195, 137));
        btnAddclient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddclient.setText("Add Employee");
        btnAddclient.setPreferredSize(new java.awt.Dimension(160, 30));
        btnAddclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddclientActionPerformed(evt);
            }
        });

        btnManageclient.setBackground(new java.awt.Color(115, 195, 137));
        btnManageclient.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnManageclient.setText("Manage Employee");
        btnManageclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageclientActionPerformed(evt);
            }
        });

        btnAddclient3.setBackground(new java.awt.Color(115, 195, 137));
        btnAddclient3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAddclient3.setText("Add Mechanic");
        btnAddclient3.setPreferredSize(new java.awt.Dimension(160, 30));
        btnAddclient3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddclient3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageclient, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddclient, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddclient3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddclient, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageclient, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddclient3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddclientActionPerformed
        // TODO add your handling code here:
        AddEmployee addEmployee = new AddEmployee(userProcessContainer);
        userProcessContainer.add("AddEmployeeJPanel", addEmployee);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddclientActionPerformed

    private void btnManageclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageclientActionPerformed
        // TODO add your handling code here:
        ManageEmployee manageemployeeJPanel = new ManageEmployee(userProcessContainer);
        userProcessContainer.add("ManageEmployeeJPanel", manageemployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageclientActionPerformed

    private void btnAddclient3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddclient3ActionPerformed
        // TODO add your handling code here:
        AddMechanic addMechanic = new AddMechanic(userProcessContainer);
        userProcessContainer.add("AddMechanicJPanel", addMechanic);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddclient3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddclient;
    private javax.swing.JButton btnAddclient3;
    private javax.swing.JButton btnManageclient;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
