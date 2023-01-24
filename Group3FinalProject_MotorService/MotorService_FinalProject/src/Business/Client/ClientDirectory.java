/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Client;

import Business.Client.Client;
import java.util.ArrayList;

/**
 *
 * @author group3
 */
public class ClientDirectory {
    private ArrayList<Client> employeeList;

    public ClientDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Client> getclientList() {
        return employeeList;
    }
    
    public Client createclient(String name){
       // create client
       return null;
    }
}
