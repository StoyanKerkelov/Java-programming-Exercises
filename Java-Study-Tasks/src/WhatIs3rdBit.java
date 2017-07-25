import java.util.Scanner;

public class WhatIs3rdBit {

	/*Write an expression  that checks the value of the third bit of a given number.*/
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		
		if ((num&8)!=0){
			System.out.println("This is  true");//1
			} else {
				System.out.println("Not the case");//0
		}
	}
}
