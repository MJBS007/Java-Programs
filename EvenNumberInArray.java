package ArrayPrograms;

public class EvenNumberInArray {

	public static void main(String[] args) {
		// Declare the Array 
		int [] arr = new int[] {1,3,4,9,45,12,35,2,66,8,17,31,10};
		//Logic to Seperate Even Number in Array
		System.out.println("The Even Numbers in an Array : ");
		//Using for loop enter into array index
		for(int i = 0; i<arr.length; i++)
		{
			if (arr[i]%2==0)
				//if(arr[i]%2!=0) or if(arr[i]%2==1) //For Odd Number
			{
				System.out.println(arr[i]);
			}
		}

	}

}
