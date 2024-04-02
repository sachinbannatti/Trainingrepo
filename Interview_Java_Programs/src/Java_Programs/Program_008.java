package Java_Programs;

public class Program_008 {

	public static void main(String[] args) {
		String str="ABCDE";
		String rev="";
		String org=str;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(org)) {
			System.out.println("The Enter string is palindrome");
		}else {
			System.out.println("The enter string is not palindrome");
		}
		
		

	}

}
