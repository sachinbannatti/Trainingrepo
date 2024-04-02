package Java_Programs;

public class Program_005 {

	public static void main(String[] args) {
		String str="ABCD";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("The reverse of the given string is :"+rev);
		
	

	}

}
