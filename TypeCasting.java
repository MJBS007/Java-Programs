package javaInterview1;

public class TypeCasting {

	public static void main(String[] args) {
		// This is the example of widening
		//byte to short
		byte b=2;
		short s=b;
		System.out.println(s);
		
		//byte to int
		int i=b;
		System.out.println(i);
		
		//byte to long
		long l=b;
		System.out.println(l);
		
		//byte to float
		float f=b;
		System.out.println(f);
		
		//byte to double
		double d=b;
		System.out.println(d);
		
		//int to float
		int i1=10;
		float f1=i1;
		System.out.println(i1);
		
		//Example for Narrowing 
		//int to short
		int xyz = 1;
		 short rrr= (short) xyz;
		 System.out.println(rrr);
		 
		 // long to byte
		 long lg=35;
		 byte bt= (byte) lg;
		 System.out.println(bt);
	}

}
