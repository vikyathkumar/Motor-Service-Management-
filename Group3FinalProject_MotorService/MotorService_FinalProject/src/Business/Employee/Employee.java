/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Person.Person;
import java.util.Date;

/**
 *
 * @author group3
 */
public class Employee extends Person {

    private Date employedDate;
    private int salary;
    public Employee(String personId, int age, String firstName, String lastName, String userName, String password, String saltValue) {
        super(personId, age, firstName, lastName, userName, password, saltValue);
    }
    
    public Employee(String personId, int age, String firstName, String lastName, Date employedDate, int salary, String userName, String password,String saltValue) {

        super(personId, age, firstName, lastName, userName, password, saltValue);
        this.employedDate = employedDate;
        this.salary = salary;
    }

    public Date getEmployedDate() {
        return employedDate;
    }

    public void setEmployedDate(Date employedDate) {
        this.employedDate = employedDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }   
}
