package com.techinnoveta.java8;

import java.util.Scanner;

class MyBook extends Book{
	int price;
	MyBook(String title, String author) {
		super(title, author);
	}
	
	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	@Override
	void display() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("Price: " + this.price);
	}	
}

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

public class Java8 {
	   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}