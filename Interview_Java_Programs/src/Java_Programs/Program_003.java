package Java_Programs;

public class Program_003 {

	public static void main(String[] args) {
		// Reverse the given number 
		
		int num=1234;
		System.out.println("You already enter the number as num= "+num);
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("The rev number of num: "+rev);
	}

}
