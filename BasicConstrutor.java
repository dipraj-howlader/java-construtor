package Construtor;

public class BasicConstrutor {
	//using construtor
	// main idology of construtor is to init the value the time of declearation ..
	String subject, topic;
	int courseID;
	
	BasicConstrutor(String s,String t, int c){
		subject = s;
		topic = t;
		courseID = c;
		
	}
	
	void displayInfo() {
		System.out.println(subject);
		System.out.println(topic);
		System.out.println(courseID);
		
	}
	
}
