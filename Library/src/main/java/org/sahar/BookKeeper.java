package org.sahar;

import java.util.ArrayList;

public class BookKeeper extends User{


/* we do not setter, because we have constructor
    // Setter personnelID
    public void setPersonnelID(long personnelID) {
        this.personnelID = personnelID;
    }*/
    //Constructor
    public BookKeeper(){
    }
    public BookKeeper(String userName,String password){
        super(userName,password);
    }
    public BookKeeper(String firstName,String lastName, String userName,String password){
        super(firstName,lastName,userName,password);
    }

// options for a Bookkeeper(staff)
    public void showOptionBookKeeper(){
        System.out.println("What do you want to do:");
        System.out.println("1) Add Book");
        System.out.println("2) Delete Book");
        System.out.println("3) Add new member");
        System.out.println("4) Display available book list");
    }
}
