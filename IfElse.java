package javaprogramsbasic1;

public class IfElse {

	public static void main(String[] args) {
		//  < >= <= == != conditional operators
		
		int a = 10;
		int b = 70;
		
		if (b>a)
		{
			System.out.println(b+ " is greter than "+a);
		}
		else
		{
			System.out.println(a+ " is greter than "+b);
		}
		
		
		int c = 35;
		if (c==35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		int m = 25;
		int n = 45;
		int x = m+n;
		if (x>=50)
		{
			System.out.println("Eligible to write govt exam");
		}
		else
		{
			System.out.println("Not Eligible to write govt exam");

		}
			
	}

}
