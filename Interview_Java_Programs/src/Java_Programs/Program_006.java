package Java_Programs;

import java.util.Scanner;

public class Program_006 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String rev="";
		char a[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("The reverse of the given string is :"+rev);
	}

}
