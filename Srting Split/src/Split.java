//Janson Chiu 
// 10/27/16
// APCS Period 1 
// Split String 

// This program takes in a string with and without any spaces and returns the stuff in between the pieces of bread.

import java.util.Arrays;

public class Split 
{
	public static void main(String[] args) 
	{

	middleOfSandwich("bread");
	middleOfSandwich("breadcheesebread");
	middleOfSandwich("breadchicken");
	middleOfSandwich("breadbread");
	middleOfSandwich("breadchickenbread");
	middleOfSandwich("breadbreadchicken");
	middleOfSandwich("chickenbreadbread");
	middleOfSandwich("applebreadchickenbread");
	middleOfSandwich("lettucetomatobreadchickenbreadtomatolettuce");
	middleOfSandwich("lettucebreadbreadchickenbreadchicken");
	middleOfSandwich("chickenbreadlettucetomatobreadchicken");
	
	System.out.println();
	middleOfSandwichWithSpaces("bread");
	middleOfSandwichWithSpaces("chicken");
	middleOfSandwichWithSpaces("bread chicken");
	middleOfSandwichWithSpaces("bread bread");
	middleOfSandwichWithSpaces("bread chicken bread");
	middleOfSandwichWithSpaces("bread bread chicken");
	middleOfSandwichWithSpaces("chicken bread bread");
	middleOfSandwichWithSpaces("apple bread chicken bread");
	middleOfSandwichWithSpaces("lettuce tomato bread chicken bread tomato lettuce");
	middleOfSandwichWithSpaces("lettuce bread bread chicken bread chicken");
	middleOfSandwichWithSpaces("chicken bread lettuce tomato bread chicken");
	}
	
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		

	public static void middleOfSandwich (String sandwich) { // without any spaces 
		String[] object = sandwich.split("bread");
		int firstbread = sandwich.indexOf("bread");
		int secondbread = sandwich.indexOf("bread", firstbread+5);
		if(firstbread < 0) {
			System.out.println("Not a sandwich");
		}
		
		else if(firstbread>=0 && secondbread>0){
			
			String middleOfBread = sandwich.substring(firstbread+5,secondbread);
				if(middleOfBread.length() >1) {
					
					System.out.println(middleOfBread);
				} else {
					System.out.println("Not a sandwich");
				}
		}else if(object == null){
			System.out.println("Not a sandwich");
		}else{
			System.out.println("Not a sandwich");
		}
	}
	
	public static void middleOfSandwichWithSpaces (String sandwich) { // with spaces 
		
		String[] splitSpaces = sandwich.split(", ");

		middleOfSandwich(Arrays.toString(splitSpaces));
	}
		
}

	
		//Your task:
	// Make sure you have bread first
	// FindYourKeyword 
	//Test if there is anything between the two breads 
	
	

		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	
		//Your task pt 2:
		//Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		// * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		// * Again, what if it's a fancy sandwich with multiple pieces of bread?
	
		
		




