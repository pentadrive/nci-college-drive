/*
Cinema.java
@Author P. Maypa
7 Feb 2017
*/

// app to ask the user for their name and for 5 individual number
// then calculate the sume total
//importing utility package
import java.util.*;

public class Cinema{
	public static void main(String args[]){

final int student;
final int oldAgePension;
final int child;
final int adult;

int studentQuant ;
int oldAgePensionQuant ;
int childQuant ;
int adultQuant ;
int sum ;

student = 12 ;
oldAgePension = 10 ;
child = 7 ;
adult = 15 ;
sum = 0 ;

studentQuant = 0;
oldAgePensionQuant = 0 ;
childQuant = 0 ;
adultQuant = 0;
sum = 0;
//assignment variables


//objects
Scanner keyboard; //bringing in the Scanner
keyboard=new Scanner(System.in); //creating an instance



System.out.println("Enter the amount of student ticket");
studentQuant=keyboard.nextInt();

System.out.println("Enter the amount of Old Age Pension ticket");
oldAgePensionQuant=keyboard.nextInt();

System.out.println("Enter the amount of child ticket");
childQuant=keyboard.nextInt();

System.out.println("Enter the amount of child ticket");
adultQuant=keyboard.nextInt();


//Process
sum = studentQuant + oldAgePensionQuant + childQuant + adultQuant;

//output - Print out message

System.out.println("The total is " + sum);

	}
}