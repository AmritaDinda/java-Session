package javasession;

public class Student {
	        //WAF
			//create a method -- getStudentMarks
		    //pass a parameter:studentName(String)
			//return the student marks --> int
	
	public int getStudentMarks(String studentName) {
		
		
		int marks = -1;
		
		if(studentName.equalsIgnoreCase("abhijit")) {
			marks = 90;
		}

		else if(studentName.equalsIgnoreCase("nitu")) {
			marks = 80;
		}

		else if(studentName.equalsIgnoreCase("ishu")) {
			marks = 60;
		}

		else if(studentName.equalsIgnoreCase("mukul")) {
			marks = 50;
		}

		else {
			System.out.println("plz pass the right name......");	
		}
		
		System.out.println("getting the marks for:" + studentName);
		return marks;
	}
	
	
	public static void main(String[] args) {

	Student ob = new Student();
	
	int m1 = ob.getStudentMarks("nitu");
	System.out.println(m1);
	
	
	int m2 = ob.getStudentMarks("ishu");
	System.out.println(m2+60);
	if(m2 >=0) {
		System.out.println("print the marks sheet");
	}
	
	
	int m3 = ob.getStudentMarks("peter");
	System.out.println(m3);
	if(m3 >=0) {
		System.out.println("print the marks sheet");
	}

	
	int m4 = ob.getStudentMarks("ankush");
	System.out.println(m4);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
