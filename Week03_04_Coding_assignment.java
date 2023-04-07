package week3and4;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Week03_04_Coding_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//videos - tests for all of the methods and show that everything runs properly and no errors
		
		/*
		 * 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		 * 
		 */
		System.out.println("1)");
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};// in video, just add another number to demo that it works
		
		// do not use ages [7] - how do you do it then? 
		
	//	System.out.println(ages[0] - ages[ages.length - 1]);
		
		//when I declared length and sum as int, value was truncated even though it came out as a double (28.0)
			double length  = ages.length; //declared variable for array length
			double sum = 0; // default sum value for loop. needed outside the loop because if it is in the loop, it gets redefined each iteration
			
			for (int i = 0; i < ages.length; i++) {
				sum += ages[i]; // 0 + int/value of index i.e. for ages[1] 0 + 9
			
		}
			double average = sum / length; //declared double for result because result is a decimal.
				
			System.out.println("Average ages = " + average);
			
			
			/*
			 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

			 */
			System.out.println("2)");
		double d = 0;
		
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		for (int i = 0; i < names.length; i++) {
			d += names[i].length();
		}
		
		
		double lengthOfNames = names.length; 	
		double namesAverage = d / lengthOfNames; 
		
		System.out.println("Average length of names = " + namesAverage);
		
		System.out.print("Names in array: ");
		for ( int j = 0; j < names.length; j ++) {
			System.out.print( names[j] + " ");
		}
		System.out.println("");
		
		
		//3.	How do you access the last element of any array?
		System.out.println("3)");
		System.out.println("Last element of an array: " + names[(names.length - 1)]);//length of the array - 1
		
		//4.	How do you access the first element of any array?
		System.out.println("4)");
		System.out.println("First elelment of an array: " + names[0]);// the first element of an array is always 0 
		
		//5.	Create a new array of int called nameLengths. 
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

		System.out.println("5)");
		int [] nameLengths = new int [names.length]; 
		for ( int k = 0; k < names.length; k ++) {
			nameLengths [k] = names[k].length();
		System.out.print(names[k]+ " = "  + nameLengths[k] + ", ");
		                             		
		}
		
		//System.out.println("test "+ nameLengths[3]); this is how I tested that it added to the array in the way that I expected. 
		
//		System.out.println("Name Lengths: ");
//		for (int f = 0; f < names.length; f ++) {
//			System.out.println("Name: " + names[f] + " - Length: " + nameLengths[f]);
//		}
//			
			
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		//Print the result to the console.
		System.out.println("");
		System.out.println("6)");
		int lengthsSum = 0;
		for (int w = 0; w < nameLengths.length; w++) {
			lengthsSum += nameLengths[w];
		}
			
		System.out.println("Sum of all elements in nameLengths = " + lengthsSum);
		
		
		System.out.println("7)");
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to
//		itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		
			
			System.out.println(concatWord("Hello", 3));
		
		System.out.println("8)");
		//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name
		//(the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(fullName("Dianna", "Franco"));
		
		System.out.println("9)");
		//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		int [] test =  {50, 80, 9};
		sumGreaterThan100 (test);
		
		
		System.out.println("10)");
		//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double [] doubleTest = {3.14, 7.27, 23.19};
		
		System.out.println("Average of first array: " + avgOfDoubles(doubleTest));
		
		
		System.out.println("11)");
		//11.	Write a method that takes two arrays of double and returns true if the average of the elements
		//in the first array is greater than the average of the elements in the second array.
		//can use method created in question 10 if created with the right parameters to use for this question
		
		double [] doubleTestTwo = {2322.511, 350189.2, 55004.12};
		System.out.println("Average of second array: " + avgOfDoubles(doubleTestTwo));
		
		System.out.print("First array is larger: ");
		compareAvgDoubles(doubleTest, doubleTestTwo);
		
		
		System.out.println("12)");
//		12.	Write a method called willBuyDrink that takes a boolean isHotOutside,
//		and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		boolean hotOutside = true;
		System.out.println(willBuyDrink(hotOutside, 8.2));
		
		System.out.println("13)");
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		//I do photography and would like to figure out what to charge for sessions based on length of session, travel costs, and number of photos to edit. 
		//Method will need: int lengthOfSession (this will be in minutes),
		//double travelCost (multiplied by IRS mileage calculation = .655/mile), and double editedPhotos (photos to edit for client * hourly charge for editing)
		System.out.println("Calculate your session cost: ");
		sessionCost();
		
		
		
	}//end of main
	
	public static void sessionCost() {
		
		double hourlyRate = 50;//$50/hr for session time and editing time
		double IRSMileage = .655;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("How long is the sesssion (in hours)?");
		double sessionLength = kb.nextDouble(); 
		System.out.println(sessionLength * hourlyRate);
		
		System.out.println("How far will you travel for this session?");
		double distance = kb.nextDouble();
		System.out.println(distance * IRSMileage);
		

		
		System.out.println("How many photos will the client receive?");
		double photos = kb.nextDouble();
		double editingCost = photos * .25 * hourlyRate; 

		System.out.println(editingCost);
		 
		if (distance > 25) {
		double sessionTimeCost = sessionLength * hourlyRate; 
		double travelCost = distance * IRSMileage; 
		double overhead = sessionTimeCost + travelCost + editingCost; 
		double profit = overhead * .25;
		System.out.println("For this session, charge: $" + (overhead + profit));
		}
		
		else {	
			double sessionTimeCost = sessionLength * hourlyRate; 
		double overhead = sessionTimeCost + editingCost; 
		double profit = overhead * .25;
		System.out.println("For this session, charge: $" + (overhead + profit));
		}
		
		
		
		
		
		
		
	}//end of sessionCost
	
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		boolean hot = isHotOutside; 
		boolean willBuyDrink = (hot == true && moneyInPocket > 10.50);
		
		return willBuyDrink;	
		
		
	}//end of willBuyDrink
	
	public static String concatWord (String word, int n ) {
		String concatWord = ""; 
		for (int i = 0; i < n; i ++) {
			concatWord += word; 
			//System.out.print(concatWord);
		}
			
		return concatWord;
		
	}//end of concatWord
	
	public static String fullName ( String firstName, String lastName) {
		String fullName = (firstName + " " + lastName); 
		return fullName;
	}//end of fullName
	
	public static void sumGreaterThan100 (int[] input) {
		int start = 0; 
		for(int p = 0; p < input.length; p ++) {
			start += input[p];
		}
		boolean greaterThan100 =  (start > 100);
		System.out.println(greaterThan100);
				
	}//end of sumGreaterThan100
	
	public static double avgOfDoubles (double[] input) {
		
		double length  = input.length; //declared variable for array length
		double sum = 0; // default sum value for loop. needed outside the loop because if it is in the loop, it gets redefined each iteration
		
		for (int i = 0; i < input.length; i++) {
			sum += input[i]; // 0 + int/value of index i.e. for ages[1] 0 + 9
		
	}
		double average = sum / length; //declared double for result because result is a decimal.
			
		
		return average;
	}//end of avgOfDobules
	
	public static void compareAvgDoubles (double[] firstArray, double[] secondArray) {
		
		double firstArrayAvg = avgOfDoubles(firstArray);
		
		double secondArrayAvg = avgOfDoubles(secondArray);
		
		boolean firstIsGreater = (firstArrayAvg > secondArrayAvg);
		System.out.println(firstIsGreater);
	}//end of compareAvgDoubles
	
	
	
}//end of class
