package Java_Programs;

public class Program_007 {

	public static void main(String[] args) {
		int num=121457;
		int rev=0;
		int org=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			}
			if(rev==org) {
				System.out.println("The enter number is palindrome");
			}else {
				System.out.println("The enter number is not palindrome");
			}

	}

}
