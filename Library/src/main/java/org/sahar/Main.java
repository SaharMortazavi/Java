package org.sahar;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Library library = new Library();
        Member member = new Member();
        Book book = new Book();
        BookKeeper bookKeeper = new BookKeeper();
        System.out.println("please select one of options below: ");
        System.out.println("this is the best");
        System.out.println("this is from another branch");
        Scanner scanner = new Scanner(System.in);
        int in;
        int actionChoice1;
        int actionChoice2;

        do {
            //Displays first options to gets type of user
            user.getTypeOfUser();
            in = scanner.nextInt();
            switch (in) {
                // displays options for member and gets the action
                case 1:
                    System.out.println("-------Welcome to the library ------\n");
                    member.showOptionMember();
                    actionChoice1 = scanner.nextInt();
                    switch (actionChoice1) {
                        case 1:
                            Book b = new Book();
                            member.addToBorrowedBook(b);
                            break;
                        case 2:
                            Book c = new Book();
                            member.removeFromBorrowedBook(c);
                            break;
                        case 3:
                            member.printBorrowedBook();
                            break;
                    }
                    break;

                //displays options for bookkeeper and gets the action
                case 2:
                    System.out.println("-------Welcome to the library ------\n");
                    bookKeeper.showOptionBookKeeper();
                    actionChoice2 = scanner.nextInt();
                    switch (actionChoice2) {
                        case 1:
                            library.addToBookCollection(book);
                            break;
                        case 2:
                            library.removeFromBookCollection(book);
                            break;
                        case 3:
                            library.addNewMember(member);
                            break;
                        case 4:
                            library.printBookCollection();
                            break;

                    }

            }
            break;


        } while (in != 3);
    }
}
