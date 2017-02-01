/*
Sweetshop.java
Author
31 jan 2017
*/
import java.util.*;
public class Sweetshop{
	public static void main (String args[]){

	double icecreamCost;
	double lolliesCost;
	int icecream ;
	int lollies;
	double sum;

	///assign variables
	icecreamCost=5.20;
	lolliesCost=1.50;
	icecream=0;
	lollies=0;
	sum=0;

	//objects
	//1. Bringing in the scanner class
	//2. Give it a name
	//3. Create acopyof it so that we can use it

	Scanner keyboard;

	//Assign
	keyboard=new Scanner(System.in);
	//allows user input

	System.out.println("How many lollies do you want");
	//storing the next interger that comes
	lollies=keyboard.nextInt();

	System.out.println("How many icecreams do you want");
	icecream=keyboard.nextInt();

	//process - Calculations
	sum=(lollies*lolliesCost)+(icecream*icecreamCost);

	//output
System.out.println("The total cost of your shopping is" + sum);
	}
}