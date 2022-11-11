package ArrayPrograms;

public class CopyArrayToArray {

	public static void main(String[] args) {
		
		// Declare & Initialize one Array
		int [] a = new int [] {1, 3, 4, 8, 9};
		int  b[] = new int [] {a.length};
		for (int i=0; i<a.length; i++) {
			//b[i]=a[i];
		}
		System.out.println("Elements of Original Array: ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+ "");
		}
		
		System.out.println("Elements of Copied Array: ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(b[i]+ "");
		}

		
	       //Initialize array     
        int [] arr1 = new int [] {1, 2, 3, 4, 5};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];     
        }      
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
	}
	

}
