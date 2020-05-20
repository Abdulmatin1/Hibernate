package com.LinkedList;

import java.util.LinkedList;

public class Library {

	public static void main(String[] args) {
		

		Books book1 = new Books(1, "Holy Quran", "Allah", "Porphet Mohammad", 1000);
		Books book2 = new Books(2, "Hadis", "Prophet Mohammad", "khaliphate", 500);
		Books book3 = new Books(1, "Masnawi", "Malana", "bihaqi", 10);
		 
		
		LinkedList<Books> library = new LinkedList<Books>();
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		
		for(Books b : library) {
			
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.numprint);
		}
		
		
		
		
		
		
		
	}

}
