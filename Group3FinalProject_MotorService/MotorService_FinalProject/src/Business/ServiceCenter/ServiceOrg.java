/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ServiceCenter;

import Business.Organization.Organization;

import Business.Employee.Employee;
import Business.Client.Client;
import Business.Mechanic.Mechanic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author group3
 */
public class ServiceOrg extends Organization {

    List<Employee> empList = new ArrayList<>();
    List<Client> cliList = new ArrayList<>();
    List<Mechanic> mechList = new ArrayList<>();

    
    // singleton pattern
    private static ServiceOrg instance;
    
    private ServiceOrg() {
//        super(name);
        instance = null;
    }

    public static ServiceOrg getInstance() {
        if (instance == null) {
            instance = new ServiceOrg();
        }
        return instance;
    }

}
