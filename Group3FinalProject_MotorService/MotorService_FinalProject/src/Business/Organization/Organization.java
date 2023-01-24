/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Client.Client;
import Business.Client.ClientDirectory;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Mechanic.Mechanic;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author group3
 */
public abstract class Organization {

    public String name;
    private EmployeeDirectory employeeDirectory;
    private ClientDirectory clientDirectory;
    private int organizationID;
    private static int counter = 0;

    List<Employee> empList = new ArrayList<>();
    List<Client> cliList = new ArrayList<>();
    List<Mechanic> mechList = new ArrayList<>();

    public Organization() {
//        this.name = name;
        employeeDirectory = new EmployeeDirectory();
        clientDirectory = new ClientDirectory();
        organizationID = counter;
        ++counter;
    }

    public ClientDirectory getclientDirectory() {
        return clientDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpList(List<Employee> emps) {
        this.empList = emps;
    }

    public void addEmp(Employee e) {
        this.empList.add(e);
    }

    public void getEmpList() {
        empList.forEach((e) -> {
            System.out.println(e);
        });
    }

    public void addClient(Client c) {
        this.cliList.add(c);
    }

    public void getClientList() {
        cliList.forEach((m) -> {
            System.out.println(m);
        });
    }

    public void addMech(Mechanic m) {
        this.mechList.add(m);
    }

    public void getMechanicList() {
        mechList.forEach((m) -> {
            System.out.println(m);
        });
    }

    @Override
    public String toString() {
        return name;
    }
}
