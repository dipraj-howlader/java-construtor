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
	BasicConstrutor(String n , int bun){
		subject = n;
		courseID = bun;
	}
	
	
	void displayInfo() {
		System.out.println(subject);
		System.out.println(topic);
		System.out.println(courseID);
		
	}
	
}
