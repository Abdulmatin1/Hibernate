package com.util.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListLoops {

	public static void main(String[] args) {


		
		ArrayList<String> studentlist = new ArrayList<String>();
		
		
		studentlist.add("kamal");
		studentlist.add("ahamad");
		studentlist.add("smaim");
		studentlist.add("jamal");
		studentlist.add("kazim");
		
		// looping with iterator interface
		
		Iterator names = studentlist.iterator();
		
		while(names.hasNext()) {
			System.out.println(names.next());
		}
		
		System.out.println("=========listITERATOR=============\n");
		
		ListIterator<String> studentName = studentlist.listIterator();
		while(studentName.hasNext()) {
			
			String name = studentName.next();
			System.out.println(name);
		}
		
		
		System.out.println("===========for each loop===========\n");
		
		for(String list :studentlist ) {
			System.out.println(list);
		}
		
		
		
		System.out.println("===========for loop===========\n");
		for(int name = 0; name <studentlist.size(); name++) {
			
			System.out.println(studentlist.get(name));
		}
		
		System.out.println("===========for echMethod===========\n");
		studentlist.forEach(stunames ->{
			System.out.println(stunames);
		});
		System.out.println("===========for each Reamining Method===========\n");
		
		Iterator<String> allName = studentlist.iterator();
		
		allName.forEachRemaining(theNames ->{
			System.out.println(theNames);
		});
		
		

	}

}
