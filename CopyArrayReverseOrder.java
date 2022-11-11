package ArrayPrograms;

public class CopyArrayReverseOrder {

	public static void main(String[] args) {
		// Declare Array
		int [] arr1 = new int [] {5,6,7,8,9};
		//Declare another array to copy
		int [] arr2 = new int [arr1.length];
		System.out.println(" Reversed Arrray1 elements ");
		for(int i=arr1.length-1; i>=0; i-- )
		{
			arr2[i]=arr1[i];
			
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Copied arr2");
		for (int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		System.out.println("Reversed elements Copied arr2 ");
		for (int i=arr2.length-1; i>=0; i--)
		{
			System.out.print(arr2[i] + " ");
		}
		
	}

}
