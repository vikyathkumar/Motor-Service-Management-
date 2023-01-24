/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Factory;

import Business.Client.Client;
import Business.Employee.Employee;
import Business.Person.Person;
import Business.Mechanic.Mechanic;

/**
 *
 * @author group3
 */
public class UsersFactory {

    public static Person create(String userType,
            String personId,
            int age,
            String firstName,
            String lastName,
            String userName,
            String password,
            String saltValue
    ) {
        switch (userType) {
            case "Employee":
                return new Employee(personId, age, firstName, lastName, userName, password, saltValue);
            case "Client":
                return new Client(personId, age, firstName, lastName, userName, password, saltValue);
            case "Mechanic":
                return new Mechanic(personId, age, firstName, lastName, userName, password, saltValue);
        }
        return null;
    }
}
