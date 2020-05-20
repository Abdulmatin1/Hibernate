package com.LinkedList;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {

		
	LinkedList<String> StudentLists = new LinkedList<String>();
	
	StudentLists.add("kamal");
	StudentLists.add("jamal");
	StudentLists.add("ahmad");
	StudentLists.add("zamir");
	
	System.out.println(StudentLists);
	
	StudentLists.add(2, "Kazim");
	
	System.out.println(StudentLists);
	
	LinkedList<String> StudentLists1 = new LinkedList<String>();
	StudentLists1.add("Shaban");
	StudentLists1.add("farzad");
	StudentLists1.add("dawood");
	StudentLists1.add("ajmal");
	
	StudentLists.addAll(StudentLists1);
	System.out.println(StudentLists);
	
	LinkedList<String> StudentLists2 = new LinkedList<String>();
	
	StudentLists2.add("fawad");
	StudentLists2.add("fahim");
	StudentLists2.add("fakhunda");
	StudentLists2.add("tahir");
	
	
	StudentLists.addAll(2, StudentLists2);
	
	System.out.println(StudentLists);
	
	System.out.println(StudentLists.removeAll(StudentLists2));
	System.out.println(StudentLists);
	System.out.println("======for each loop========\n");
	
	for(String a : StudentLists) {
		System.out.println(a);
	}
	
	
	
	System.out.println("======for loop========\n");
	for(int x = 0; x < StudentLists.size(); x ++) {
		System.out.println(StudentLists.get(x));
	}
	
	
	

	}

}
