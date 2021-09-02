package Construtor;


public class useCOns {
	public static void main(String[] args) {
		
		BasicConstrutor topic1 = new BasicConstrutor("Math","Inte",112);
		
		topic1.displayInfo();
		
		BasicConstrutor topic2 = new BasicConstrutor("Bangla","Poem",212);
		
		topic2.displayInfo();
		//parameterize
		BasicConstrutor topic3 = new BasicConstrutor("English",2566);
		
		topic3.displayInfo();
		 // default
		BasicConstrutor topic4 = new BasicConstrutor();
		
		// Overloadding
		
		
		
		
	}
}
