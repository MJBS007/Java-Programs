package ArrayPrograms;

public class CopyArray2 {

	public static void main(String[] args) {
		int [] arr1 = new int [] {1,3,4,5,6};
		int [] arr2 = new int [arr1.length];
		
		for (int i=0; i<arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}
		System.out.println("Displaying of Array 1 elements");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Displaying Array 2 elements");
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+ " ");
		}
		

	}

}
