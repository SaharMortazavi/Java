package org.sahar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> bookCollection ;
    private ArrayList<Member> memberCollection;

    public Library(){
        this.bookCollection=new ArrayList<Book>();
        this.memberCollection=new ArrayList<Member>();
    }


    Scanner scanner=new Scanner(System.in);

// prints all the books available in the library
    public void printBookCollection(){
        System.out.println("There are currently "+ this.bookCollection.size() +" books available in the Library: \n");
        for (int i=0;i<this.bookCollection.size();i++){
            System.out.println((i+1) + ", " + this.bookCollection.get(i).getTitle()) ;
        }
    }
    //adds new books to the library
    public void addToBookCollection(Book book){
        System.out.println("please enter the book name: ");
        String n= scanner .nextLine();
        bookCollection  .add(book.setTitle(n));
        System.out.println("The book has been successfully added.");
    }
    //removes book from library's Book collection.
    public void removeFromBookCollection(Book book) {
        System.out.println("Please enter the book name you want to return: ");
        String n = scanner.nextLine();
        this.bookCollection.remove(n);
        System.out.println("The book removed successfully.");
    }
    //add new member to Library's Member list:
    public void addNewMember(User user) {
        System.out.println("please enter new member Firstname: ");
        String firstname = scanner.nextLine();
        System.out.println("please enter new member Lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("please enter new member username: ");
        String username = scanner.nextLine();
        System.out.println("please enter new member password: ");
        String password = scanner.nextLine();
        System.out.println("The ne member has been successfully added.");
        User newUser =User.createUser(firstname,lastname,username,password);
    }

}
