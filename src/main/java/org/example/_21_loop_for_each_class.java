package org.example;

import java.util.ArrayList;



public class _21_loop_for_each_class {



	public static void main(String[] args) {


		// for-each = 	traversing technique to iterate through the elements in an array/collection
		//				less steps, more readable
		//				less flexible
		//				it's enhanced for loop


		//way 1
		//String[] animals = {"cat","dog","rat","bird"};
		//way 2 of storing strings
		ArrayList<String> animals = new ArrayList<String>();


		animals.add("cat");

		animals.add("dog");

		animals.add("rat");

		animals.add("bird");


		for (String i : animals) { // : means "in"

			System.out.println(i);
		}

	}
}