/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Client;

import Business.Service.Service;
import Business.Person.Person;
import Encrypt.Passcode.PasscodeUtils;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author group3
 */
public class Client extends Person {
//    private String userName;
//    private String password;
    private List<Service> servicesList;
//    private String saltValue;
    private Date registrationDate;
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public List<Service> getservicesList() {
        return servicesList;
    }

    public void setservicesList(List<Service> servicesList) {
        this.servicesList = servicesList;
    }

//    public String getSaltValue() {
//        return saltValue;
//    }
//
//    public void setSaltValue(String saltValue) {
//        this.saltValue = saltValue;
//    }
    public Client(){
    }
    
    public Client(String personId, int age, String firstName, String lastName, String userName, String password, String saltValue){
        super(personId, age, firstName, lastName, userName, password, saltValue);
    }
    
    public Client(String personId, int age, String firstName, String lastName, Date registrationDate, String userName, String password, String salt) {

        super(personId, age, firstName, lastName, userName, password, salt);
        this.registrationDate = registrationDate;
//        this.userName = userName;
//        this.password = password;
        this.servicesList = new ArrayList<>();
//        this.saltValue = salt;
    }
   public List<Client>  getDetails(){
       List<Client> empDetails = new ArrayList();
            MongoClient mongoClient = new MongoClient("localhost", 27017); 
         DB db = mongoClient.getDB("ServiceCheckDB");
         DBCollection userCollection = db.getCollection("clients");
         DBCursor cursor = null;
         cursor = userCollection.find();
         
            while(cursor.hasNext()){
                DBObject obj = cursor.next();
                String personId = obj.get("_id").toString();
                String firstName = obj.get("firstName").toString();
                String lastName = obj.get("lastName").toString();
                Date regDate = (Date)obj.get("registrationDate");
                String userName = obj.get("userName").toString();
                String password = obj.get("password").toString();
                int age =  (int)obj.get("age");
                String saltValue = obj.get("Saltvalue")!=null?obj.get("Saltvalue").toString():PasscodeUtils.getSalt(30);
                Client Health= new Client(personId,age,firstName,lastName,regDate,userName,password,saltValue);
                empDetails.add(Health);
            }
          return empDetails;

    }
    
    
}
