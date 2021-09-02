package Construtor;

public class BasicConstrutor {
	//using construtor
	// main idology of construtor is to init the value the time of declearation ..
	String subject, topic;
	int courseID;
	
	//Declaring Constructor
	BasicConstrutor(String s,String t, int c){
		subject = s;
		topic = t;
		courseID = c;
		
	}
	
	//Default Contractor
	BasicConstrutor(){
		System.out.println("NO value");
	}
	//Parameterized
	
	BasicConstrutor(String n , int bun){
		subject = n;
		courseID = bun;
		topic = "Nothing";
		
	}
	
	// Overloading Contractor
	
	/* different parameter list but more contractor is called 
	Overloading contractor 
	you will find it up
	*/
	
	
	
	
	void displayInfo() {
		System.out.println(subject);
		System.out.println(topic);
		System.out.println(courseID);
		
	}
	
}
