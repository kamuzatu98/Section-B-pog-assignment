/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymain;

/**
 *
 * @author jerem
 */
public  class FictionBook extends Book {
    private String genre;
    
    public FictionBook(String id, String title, String author, int year, String genre1) {
        super(id, title, author, year);
        this.genre = genre;
        
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
  
@Override
public String getCategory(){
    return"Fiction -" + genre;
}
}


    


