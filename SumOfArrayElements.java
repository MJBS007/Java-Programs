package ArrayPrograms;

public class SumOfArrayElements {

	public static void main(String[] args) {
		//Declaring and Initializing an Array
		int [] a = {1, 2, 3, 4, 5 };
		
		//Initializing variable 
		int sum = 0;
		
		//Using for loop to move inside array
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
			{
				System.out.println(sum);
			}
		}

	}

}
