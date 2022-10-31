package javaprogramsbasic1;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num= scr.nextInt();
		if(num%2==0)
		{
			System.out.println("The Number you are entered is Even Number");
		}
		else 
		{
			System.out.println("The Number you are entered is Odd Number");
		}
	}

}
