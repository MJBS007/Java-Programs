package oops;

public class PolymorphismExa {

	public static void main(String[] args) {
		
		Connection connection = new UDP(); 
		connection.connect(); 
		} 
	} 
	
		/** * Base class to represent a Connection. */ 

	 abstract class Connection{ 
		protected String data; 
		public void connect(){ 
			
			System.out.println("Connecting ....");
			
			} 
		
		public void con() {
			// TODO Auto-generated method stub
			
		}

		public void inputDate(String data)
		{ 
			this.data = data; 
			
		} 
	}
	
	 class TCP extends Connection { 
		@Override public void con() { 
			System.out.println("Connection reliably but slow .."); 
			} 
		} 
	
	 class UDP extends Connection { 
		
		@Override public void connect(){ 
			System.out.println("Connecting fast but no guarantee of data delivery"); 
			} 
		}

