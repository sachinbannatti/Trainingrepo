package Java_Programs;

import java.util.Scanner;

public class Program_002 {

	public static void main(String[] args) {
		// swapping the two number without creating 3rd variable
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The value of a and b after swap: a="+a+" b="+b);

	}

}
