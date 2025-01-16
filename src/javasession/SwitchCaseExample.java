package javasession;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// valid = byte, short, int, char, String
	    // not-valid = float, long, double, boolean

		
	    short sh = 12;
		switch (sh) {
		case 12:
			System.out.println("yes valid");
			break;

		default:
			System.out.println("yes not-valid");
			break;
		}
		
		
		//0-100 marks 
		String stName = "Mahesh";
		int marks = 0;
		
				switch (stName) {
				case "ritu":
					System.out.println("ritu passed");
					marks= 100-20;
					break;
				case "shristi":
					System.out.println("shristi passed");
					marks =100;
					break;
				case "dipali":
					System.out.println("dipali passed");
					marks =100;
					break;
				case "swati":
					System.out.println("swati passed");
					marks =100;
					break;

				default:
					System.out.println("student is not found:" + stName);
                    marks = -1;
					break;
				}
				
				
				System.out.println(marks);
				if (marks >= 0) {
					System.out.println("Print the marks");
				}
				else {
					System.out.println("no need to print");
				}
					
				

				
				
				
	}

}
