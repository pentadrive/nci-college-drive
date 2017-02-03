/*
*Mystery.java
*@author Frances Sheridan
*21/08/2012
*/

import java.util.Scanner;
class Document4{

public static void main(String args[]){

//declare object(s)
Scanner keyboard;

//create object(s)
keyboard = new Scanner(System.in);

//declare contstant(s)
final double X = 20.5;
final int NUM = 10;

//declare variable(s)
int a, b;
double z;

//Get Input
System.out.println("Enter the first integer:");
a = keyboard.nextInt();

System.out.println("Enter the second integer:");
b = keyboard.nextInt();

//process
z = X + 2 * a - b;

//output
System.out.println("z = "+z);

}

}