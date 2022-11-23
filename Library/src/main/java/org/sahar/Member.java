package org.sahar;

import java.util.ArrayList;
import java.util.Scanner;

public class Member extends User {
    //additional member field (compare to user class) is a list of borrowed book
    private ArrayList<Book> borrowedBook;
    Scanner scanner = new Scanner(System.in);

    //Constructor Member
    public Member() {
        this.borrowedBook=new ArrayList<Book>();
    }

    public Member(String userName, String password) {
        super(userName, password);
        this.borrowedBook=new ArrayList<Book>();

    }

    public Member(String firstName, String lastName, String userName, String password,ArrayList<Book> borrowedBook) {
        super(firstName, lastName, userName, password);
        this.borrowedBook = new ArrayList<Book>();

    }

    public ArrayList<Book> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(ArrayList<Book> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    //Adds book to the member's borrowed bok list.
    public void addToBorrowedBook(Book book){
        System.out.println("please enter the book name: ");
        String n= scanner .nextLine();
        borrowedBook.add(book.setTitle(n));
        System.out.println("The book has been successfully added.");
    }

    //Removes book from member's borrowed book list when it's been return to the library.
    public void removeFromBorrowedBook(Book book){
        System.out.println("Please enter the book name you want to return: ");
        String n= scanner .nextLine();
        this.borrowedBook.remove(n);
        System.out.println("The book return has ben registered now.");
    }
    //prints all items of books in member borrowed list
    public void printBorrowedBook(){
        System.out.println("You have "+ this.borrowedBook.size() +" items in your list: \n");
        for (int i=0;i<this.borrowedBook.size();i++){
            System.out.println((i+1) + ", " + this.borrowedBook.get(i).getTitle()) ;
        }
    }
// options for a member.
    public void showOptionMember(){
        System.out.println("What action do you want to do:");
        System.out.println("1) Borrow a new book ");
        System.out.println("2) Return a book");
        System.out.println("3) Show all available books");
    }
}
