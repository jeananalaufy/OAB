//Import -> command, shift, O

package com.training.bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
	
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
		
		
		Set <Employee> empSet = new HashSet <> ();
		empSet.add (new Employee(101, "Jeanan", "IT", 2000));
		empSet.add (new Employee(102, "Hamed", "IT", 3000));
		empSet.add (new Employee(103, "Sarah", "IT", 4000));
		
		
		for(Employee emp: empSet) {
			System.out.println(emp);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
