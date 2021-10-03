package geeko;

import java.util.Scanner;

public class CheckOdd_by_OR {
	
	public static void main(String args[]) {
		int mask=1;
		System.out.println("ENter the 1st number to check odd or even:-");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		method1(num1,mask);
		sc.nextLine();
		System.out.println("ENter the 2nd number to check odd or even:-");
		int num2=sc.nextInt();
		method1(num2,mask);
		sc.close();
		
		
	}
	public static void method1(int n,int mask) {
		if((n|mask)==n) {
			System.out.println("THe number is odd");
		}
		
		else if((n|mask)==n+1) {
			System.out.println("THe number is even");
		}
	}

}
