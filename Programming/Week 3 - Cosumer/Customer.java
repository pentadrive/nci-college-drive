/*
Customer.java
@Author P. Maypa
7 Feb 2017
*/

// app to ask the user for their name and for 5 individual number
// then calculate the sume total
//importing utility package
import java.util.*;

public class Customer{
	public static void main(String args[]){

int number1;
int number2;
int number3;
int number4;
int number5;
int sum ;
String name;

//assignment variables
name="";
number1=0;
number2=0;
number3=0;
number4=0;
number5=0;
sum=0;

//objects
Scanner keyboard; //bringing in the Scanner
keyboard=new Scanner(System.in); //creating an instance

//input - so we ask the question
System.out.println("pLEASE ENTER YOUR NAME");
name=keyboard.nextLine(); //grabbing the name and storing it

System.out.println("Please enter your first number ?");
number1=keyboard.nextInt();

System.out.println("Please enter your second number ?");
number2=keyboard.nextInt();

System.out.println("Please enter your third number ?");
number3=keyboard.nextInt();

System.out.println("Please enter your fourth number ?");
number5=keyboard.nextInt();


//Process
sum=number1=number2+number3+number4+number5;

//output - Print out message

System.out.println("Hello " + name + " your sum total is " + sum);

	}
}