/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface.Admin;

import Business.Mechanic.Mechanic;
import Business.ServiceCenter.ServiceOrg;
import Encrypt.Passcode.PasscodeUtils;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pragnya
 */
public class AddMechanic extends javax.swing.JPanel {

    /**
     * Creates new form AddMechanic
     */
    private JPanel userProcessContainer;

    public AddMechanic(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        pwdField = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        pwd_label = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        exp_label = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        fn_label = new javax.swing.JLabel();
        ln_label = new javax.swing.JLabel();
        age_label = new javax.swing.JLabel();
        experience = new javax.swing.JTextField();
        un_label = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Mechanic");

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        pwdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFieldActionPerformed(evt);
            }
        });

        pwd_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pwd_label.setText("Password");

        exp_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exp_label.setText("Years of Experience");

        fn_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fn_label.setText("First Name");

        ln_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ln_label.setText("Last Name");

        age_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        age_label.setText("Age");

        un_label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        un_label.setText("Username");

        submitJButton.setBackground(new java.awt.Color(115, 195, 137));
        submitJButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(un_label))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pwd_label)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fn_label)
                                    .addComponent(age_label)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ln_label))
                                    .addComponent(experience, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(exp_label))))))
                .addGap(17, 17, 17))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {age, experience, firstName, lastName, pwdField, userName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ln_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(exp_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(experience, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(fn_label)
                        .addGap(5, 5, 5)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(un_label)
                    .addComponent(pwd_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {age, experience, firstName, lastName, userName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkSpace empwjp = (AdminWorkSpace) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        String salt = PasscodeUtils.getSalt(30);
        String first_name = firstName.getText();
        String last_name = lastName.getText();
        String user_name = userName.getText();
        String pwd = pwdField.getText();
        String password = PasscodeUtils.generateSecurePassword(pwd, salt);

        String ageDoc = age.getText();
        String experienceDoc = experience.getText();

        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("ServiceCheckDB");
            DBCollection userCollection = db.getCollection("Mechanics");
            BasicDBObject bO = new BasicDBObject();
            int count = (int) userCollection.count() + 100;
            String emp_id = "D00" + count;
            bO.put("_id", emp_id);
            bO.put("firstName", first_name);
            bO.put("lastName", last_name);
            bO.put("userName", user_name);
            bO.put("password", password);
            bO.put("Saltvalue", salt);
            bO.put("age", ageDoc);
            bO.put("exp", experienceDoc);
            List<BasicDBObject> list = new ArrayList<>();
            bO.put("clients", list);

            userCollection.insert(bO);
            ServiceOrg MotorServiceOrganisation = ServiceOrg.getInstance();
            MotorServiceOrganisation.addMech(new Mechanic(emp_id, Integer.parseInt(ageDoc), first_name, last_name, user_name, password, salt));
            JOptionPane.showMessageDialog(null, "Created Account for Mechanic Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Failed to add mechanic. Try again!");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void pwdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JLabel age_label;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel exp_label;
    private javax.swing.JTextField experience;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel fn_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel ln_label;
    private javax.swing.JTextField pwdField;
    private javax.swing.JLabel pwd_label;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel un_label;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
