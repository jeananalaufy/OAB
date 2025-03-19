//Import -> command, shift, O


//	Write java code to do the following tasks:
//	1. Add customer to a list
//  2. Update customer information (details from user)
//	3. Delete a particular customer (get customer details from user)
//	4. Show all customer details 


package com.training.bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class task1 {
	
	//LinkedList
	
	public static void main(String[] args) {
		List <String> names = new ArrayList <String> (); 
		
		names.add("Ahmed");
		names.add("Hassan");
		names.add("Ali");
		names.add("Fatimah");

		
		
		
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
		// Set 
		
		Set <String> namesset = new HashSet<String>();
		
		namesset.add(new String("Jeanan"));
		namesset.add(new String("Mohammed"));
		
		
		for(String name:namesset) {
			System.out.println(name);
		}
		
		
		Set <customer> cusSet = new HashSet <> ();
		cusSet.add (new customer(101, "Jenna", "IT", 2000));
		cusSet.add (new customer(102, "Noora", "IT", 3000));
		cusSet.add (new customer(103, "Sarah", "IT", 4000));
		
		
		for(customer emp: cusSet) {
			System.out.println(emp);
		}

		
		
		
		
		

		
		
	}
	

}
