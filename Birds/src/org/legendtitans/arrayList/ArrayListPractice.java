package org.legendtitans.arrayList;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] coolPeople = new String[3]; 
		coolPeople[0] = "Derek";
		coolPeople[1] = "Tommy";
		coolPeople[2] = "Tommy2";
		
		//Get Values
		System.out.println(coolPeople[0]);
		System.out.println(coolPeople[1]);
		System.out.println(coolPeople[2] + "\n");
		
		
		ArrayList<String> notCoolPeople = new ArrayList<String>();
		
		//Add values
		
		notCoolPeople.add("Spanky");
		notCoolPeople.add("Slappy");
		notCoolPeople.add("Smokey");
		
		//Get values
		
		System.out.println(notCoolPeople.get(0));
		System.out.println(notCoolPeople.get(1));
		System.out.println(notCoolPeople.get(2));
		
		//1. remove the middle element and add a new one
		
		notCoolPeople.remove(1);
		
		notCoolPeople.add("Sparky");
		
		System.out.println(notCoolPeople.get(0));
		System.out.println(notCoolPeople.get(1));
		System.out.println(notCoolPeople.get(2));

	}

}
