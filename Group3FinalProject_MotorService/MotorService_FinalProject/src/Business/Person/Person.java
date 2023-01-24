/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author vamsimokari
 */
public class Person {
    private String personId;
    private int age;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String saltValue;

    public Person(String personId, int age, String firstName, String lastName, String userName, String password, String saltValue) {
        super();
        this.personId = personId;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.saltValue = saltValue;
    }
    public Person(){
    }
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
        public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSaltValue() {
        return saltValue;
    }

    public void setSaltValue(String saltValue) {
        this.saltValue = saltValue;
    }
    @Override
    public String toString() {
        return "personId=" + personId 
            + ", age=" + age 
            + ", firstName=" + firstName 
            + ", lastName=" + lastName + "";
    }
}
