/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Client;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vamsimokari
 */
public class ManageClientWorkSpace extends javax.swing.JPanel {

    /**
     * Creates new form ManageclientWorkAreaPanel
     */
    JPanel userProcessContainer;

    String custName = null;
    String serviceStatus = "";
    String serviceName = "";
    String serviceDate = "";
    String userId = "";
    DBCollection userCollection;

    enum status {
        NotRequired
    }

    public ManageClientWorkSpace(JPanel userProcessContainer, String custName) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.custName = custName;

        clientTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        clientTable.setRowHeight(30);
        clientTable.setRowMargin(10);
        populateTable(true);
        populateMechanicCombo();
        ManagerLabelName.setText("Hello " + custName + "!");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    List<String> restricted = new ArrayList<>();
    private void populateMechanicCombo() {
        MechanicComboBox2.removeAllItems();
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("ServiceCheckDB");
        DBCollection userCollection = db.getCollection("Mechanics");
        DBCursor cursor = null;
        cursor = userCollection.find();
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            MechanicComboBox2.addItem(obj.get("_id") + "-" + obj.get("userName"));
        }
    }
    String username = "";
    private void populateTable(boolean flag) {
        DefaultTableModel model = (DefaultTableModel) clientTable.getModel();
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("ServiceCheckDB");
        userCollection = db.getCollection("clients");

        DBCursor cursor = null;
        cursor = userCollection.find();
        model.setRowCount(0);
        boolean b = false;
        while (cursor.hasNext()) {
            Object[] row = new Object[model.getColumnCount()];
            DBObject obj = cursor.next();
            if (obj.get("userName").toString().equals(custName)) {
                List<DBObject> list = (List) obj.get("serviceInfo");
                for (DBObject object : list) {
                    userId = obj.get("_id").toString();
                    row[0] = userId;
                    serviceStatus = object.get("serviceStatus").toString();
                    serviceName = object.get("serviceName").toString();
                    row[1] = serviceName;
                    row[2] = serviceStatus;
                    
                    if (!restricted.contains(userId+"/"+serviceName) && serviceStatus.equals("Required")) {
                        model.addRow(row);
                    }
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();
        imgLabel = new javax.swing.JLabel();
        ManagerLabelName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MechanicComboBox2 = new javax.swing.JComboBox<>();
        assigndocbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jScrollPane1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        clientTable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "client ID", "Service", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientTable.setRowHeight(20);
        jScrollPane1.setViewportView(clientTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(120, 120, 670, 220);

        imgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(imgLabel);
        imgLabel.setBounds(620, 650, 940, 170);

        ManagerLabelName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ManagerLabelName.setText("Hello client!");
        add(ManagerLabelName);
        ManagerLabelName.setBounds(50, 50, 420, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Available Mechanic:");
        add(jLabel1);
        jLabel1.setBounds(150, 370, 190, 40);

        MechanicComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        MechanicComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        MechanicComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechanicComboBox2ActionPerformed(evt);
            }
        });
        add(MechanicComboBox2);
        MechanicComboBox2.setBounds(350, 370, 160, 40);

        assigndocbtn.setBackground(new java.awt.Color(115, 195, 137));
        assigndocbtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        assigndocbtn.setText("Book Appointment");
        assigndocbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigndocbtnActionPerformed(evt);
            }
        });
        add(assigndocbtn);
        assigndocbtn.setBounds(560, 370, 210, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void MechanicComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechanicComboBox2ActionPerformed

    }//GEN-LAST:event_MechanicComboBox2ActionPerformed

    private void assigndocbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assigndocbtnActionPerformed
        int selectedRow = clientTable.getSelectedRow();
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("ServiceCheckDB");
        DBCollection MechanicCollection = db.getCollection("Mechanics");
        DBCursor cursor = null;
        cursor = MechanicCollection.find();
        String serviceName = (String) clientTable.getValueAt(selectedRow, 1);
        String serviceStatus = (String) clientTable.getValueAt(selectedRow, 2);
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning!", JOptionPane.WARNING_MESSAGE);

        } else {
            String Mechanic_name = MechanicComboBox2.getSelectedItem().toString();
            String id[] = Mechanic_name.split("-");
            while (cursor.hasNext()) {
                DBObject obj = cursor.next();
                if (obj.get("_id").toString().equals(id[0])) {
                    List<DBObject> list = (List) obj.get("clients");
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    BasicDBObject query = new BasicDBObject();
                    query.append("client_id", userId);
                    query.append("client_name", custName);

                    BasicDBObject services = new BasicDBObject();
                    services.append("serviceName", serviceName);
                    serviceStatus = "Awaiting";
                    services.append("serviceStatus", serviceStatus);
                    List<BasicDBObject> serviceList = new ArrayList<>();
                    serviceList.add(services);
                    query.append("serviceInfo", serviceList);

                    list.add(query);
                    obj.put("clients", list);
                    restricted.add(userId+"/"+serviceName);
                    BasicDBObject basicObj = new BasicDBObject();
                    basicObj.append("_id", id[0]);
                    MechanicCollection.remove(basicObj);
                    MechanicCollection.insert(obj);

                    populateTable(true);
                }
                DBCursor cursor1 = null;
                cursor1 = userCollection.find();
                while(cursor1.hasNext()){
                obj = cursor1.next();
                if(obj.get("_id").equals(userId)){
                    List<DBObject> list = (List)obj.get("serviceInfo");
                    for(DBObject object : list){
                        if(object.get("serviceName").toString().equals(serviceName)){
                                object.put("serviceStatus","Awaiting");
                                break;
                        }
                    }
                    obj.put("serviceInfo",list);
                    BasicDBObject query = new BasicDBObject();
                    query.append("_id",userId);
                    userCollection.remove(query);
                    userCollection.insert(obj);
                }
                
            } 
            }
            JOptionPane.showMessageDialog(null, "Booked an appointment with the mechanic for this service!", "Success", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_assigndocbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ManagerLabelName;
    private javax.swing.JComboBox<String> MechanicComboBox2;
    private javax.swing.JButton assigndocbtn;
    private javax.swing.JTable clientTable;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
