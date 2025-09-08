/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymain;

/**
 *
 * @author jerem
 */
// LibraryMain.java
import java.util.Scanner;

public class LibraryMain {
    private static final Book[] books = new Book[100]; // Advanced array usage: fixed-size array
    private static int bookCount = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("Library Management System");
            System.out.println("1. Add Fiction Book");
            System.out.println("2. Add Non-Fiction Book");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addFictionBook();
                    break;
                case 2:
                    addNonFictionBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Exiting system.");
    }

    private static void addFictionBook() {
        if (bookCount >= books.length) {
            System.out.println("Library full.");
            return;
        }
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
       books[bookCount++] = new FictionBook(id, title, author, year, genre);
        System.out.println("Fiction book added.");
    }

    private static void addNonFictionBook() {
        if (bookCount >= books.length) {
            System.out.println("Library full.");
            return;
        }
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        books[bookCount++] = new NonFictionBook(id, title, author, year, subject);
        System.out.println("Non-fiction book added.");
    }

    private static void searchBook() {
        System.out.print("Enter ID to search: ");
        String id = scanner.nextLine();
        for (int i = 0; i < bookCount; i++) { // Loop over array
            if (books[i].getId().equals(id)) {
                System.out.println(books[i]);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void generateReport() {
        System.out.println("Library Report:");
        System.out.println("Total Books: " + bookCount);
        for (int i = 0; i < bookCount; i++) { // Loop to print report
            System.out.println(books[i]);
        }
        System.out.println("End of Report.");
    }
}
        
    

