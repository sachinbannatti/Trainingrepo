package Java_Programs;

public class Program_001 {
	
	// swap two number number by creating 3rd variable
	
		int a=100, b=200;
		
	public static void main(String args[]) {
		Program_001 prgm=new Program_001();
		int c;
		c=prgm.a;
		prgm.a=prgm.b;
		prgm.b=c;
		System.out.println("The value of a and b after swap: a="+prgm.a+"  b="+prgm.b );
		
		
		
	}

}
