package Business.Mechanic;

import Business.Client.Client;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vamsimokari
 */
public class Mechanic extends Person {

    private List<Client> clientsList;

    public List<Client> getclientsList() {
        return clientsList;
    }

    public void setclientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }


    public Mechanic(){
    }
    public Mechanic(String personId, int age, String firstName, String lastName, String userName, String password, String salt) {

        super(personId, age, firstName, lastName, userName, password, salt);

        this.clientsList = new ArrayList<>();
    }
   public List<Mechanic>  getDetails(){
       List<Mechanic> empDetails = new ArrayList();
            MongoClient mongoClient = new MongoClient("localhost", 27017); 
         DB db = mongoClient.getDB("ServiceCheckDB");
         DBCollection userCollection = db.getCollection("Mechanics");
         DBCursor cursor = null;
         cursor = userCollection.find();
         
            while(cursor.hasNext()){
                DBObject obj = cursor.next();
                String personId = obj.get("_id").toString();
                String firstName = obj.get("firstName").toString();
                String lastName = obj.get("lastName").toString();
                String userName = obj.get("userName").toString();
                String password = obj.get("password").toString();
                String saltValue = obj.get("Saltvalue")!=null?obj.get("Saltvalue").toString():PasscodeUtils.getSalt(30);
                Mechanic Health= new Mechanic(personId,45,firstName,lastName,userName,password,saltValue);
                empDetails.add(Health);
            }
          return empDetails;

    }
    
    
}
