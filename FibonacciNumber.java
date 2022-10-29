package javaprogramsbasic1;

public class FibonacciNumber {

	public static void main(String[] args) {
		int num = 0;
		int nextnum = 1;
		System.out.println(num);
		System.out.println(nextnum);
		while (num<20)
		{
			int sum = num + nextnum;
			
			{
				System.out.println(sum);
			}
			num=nextnum;
			nextnum=sum;	
		}
				
	}
}
