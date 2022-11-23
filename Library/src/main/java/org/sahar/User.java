package org.sahar;
import java.util.Scanner;

public class User extends Library{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    //Constructor
    public User() {
        this("FirstName", "LastName", "UserName", "Password");
    }

    public User(String userName, String password) {
        this("FirstName", "LastName", userName, password);
    }

    public User(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    //Getter firstName
    public String getFirstName() {
        return firstName;
    }

    //Setter firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Setter lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter lastName
    public String lastName() {
        return lastName;
    }

    //Getter username
    public String getUserName() {
        return userName;
    }

    //Setter username
    public void setUserName(String userName) {
        this.userName = userName;
    }

    //Getter password
    public String getPassword() {
        return password;
    }

    //setter password
    public void setPassword(String password) {
        this.password = password;
    }
// gets the type of user.
    public void getTypeOfUser() {
        System.out.println("1) Member");
        System.out.println("2) BookKeeper");
        System.out.println("3) quit");
    }
    //creates new user.
    public static User createUser(String firstName, String lastName, String userName, String password){
        return new User(firstName,lastName,userName,password);
}
}


