/**
 * 
 */

/**
 * @author Janson = Collab Exercise 
 *
*/

import java.util.*;
public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers do you want to use?");
		int totalNumber = userInput.nextInt();
		int max;
		int min;
		int maxEven;
		int totalEven = 0;
		for(int count = 0; count < totalNumber;count++) {
			System.out.println("Enter the # to add");
			int nextNumber= userInput.nextInt();
			max = nextNumber;
			min = nextNumber;
			if (nextNumber > max){
				max = nextNumber;
			}
			else if (nextNumber < min) {
				min = nextNumber;
			}
			if (nextNumber % 2 == 0){
				maxEven = nextNumber;
				totalEven += nextNumber;
			if (nextNumber > maxEven){
					maxEven = nextNumber;
			}	
		System.out.println("The smallest number is "+ min);
		System.out.println("The largest number is " + max);
		System.out.println("The sum of all even number is " + totalEven );
		System.out.println("The largest even number is "+ maxEven);
		}
		}
		userInput.close();
	}
}
