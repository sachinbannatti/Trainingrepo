package Java_Programs;

import java.util.Scanner;

import javax.management.StringValueExp;

public class Program_004 {

	public static void main(String[] args) {
		// Reverse the given number by using string buffer
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number is to be reversed");
		int num=sc.nextInt();
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println("The reverse number of thr given number num is= "+rev);
		

	}

}
