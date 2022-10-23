package javaprogramsbasic1;

public class palindrome {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int sum = 0;
		while (num > 0) {
			
		int rem = num%10;
			sum = sum*10+rem;
			num = num/10;
			
		}
		
		if (sum == temp) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not a palindrome");
		}

	}

}
