/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymain;

/**
 *
 * @author jerem
 */
public class NonFictionBook extends Book {
    private String subject;
    
    public NonFictionBook(String id, String title, String author, int year, String subject){
        super(id, title, author, year);
        this.subject = subject;
        
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
          this.subject = subject;
    }
    @Override
    public String getCategory(){
        return"Non-Fiction-"+subject;
    }
}
 