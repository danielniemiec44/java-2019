package com.example.objects;

public class Main {

    public static void main(String[] args) {
	    Book book = new Book("Java","jakis autor",200,50.0);
        Book book1 = new Book("Java1","kolejny autor",250,100.0);

	    System.out.println(book.toString());
	    System.out.println(book1.toString());
    }
}
