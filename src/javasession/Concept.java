package javasession;

import java.util.ArrayList;

public class Concept {
	

	//WAF:
	//supply a browser name : String: chrome/ff/safari/IE
	//buss logic : lunch the browser
	//return true
	
	public boolean lunchBrowser(String browserName) {
		System.out.println("browser name: "+ browserName);
		boolean f = true;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome": 
			System.out.println("lunch chrome in window interface");
	        break;
	        
		case "firefox": 
			System.out.println("lunch firefox in window interface");
		    break;

		case "safari": 
			System.out.println("lunch safari in window interface");
		    break;

		case "IE": 
			System.out.println("lunch IE in window interface");
		    break;

		default:
			System.out.println("no defult browser");
			f = false;
		    break;
		}

		return f;
	}
	
	
	
	
	
	
	public void testing() {
		System.out.println("testing method");
		return;

	}
	
	
	
	//WAF:
	//supply input param:company Name(string):IBM, MS , Goggle
	//return: the list of employee of the comp: ArrayList<String>
	
	public ArrayList<String> getEmpList(String compName) {
		System.out.println("company name is : "+compName);

		ArrayList<String> empList = new ArrayList<String>();
		
		if(compName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("Nitu");
			empList.add("Akash");			
		}
		else if(compName.equalsIgnoreCase("MS")) {  //use else if otherwise it will go and check the next one also
			empList.add("Arunita");                      //if else condition- else if and switch- break 
			empList.add("Ankuah");
			empList.add("Anurag");
			empList.add("himangshi");			

		}
		else if(compName.equalsIgnoreCase("Goggle")) {
			empList.add("Mohit");
			empList.add("Binu");
		}
		else {
			System.out.println("company name is not found ......");

		}
		
		return empList;
	}
	
	
	

	public static void main(String[] args) {
		
		Concept obj = new Concept();
		
		boolean a = obj.lunchBrowser("opera");
		if(a) {
			System.out.println("Enter the url.....");
		}
		else {
				System.out.println("don't Enter the url....");

			}

		
		ArrayList<String> boo = obj.getEmpList("IBM");
		System.out.println(boo);

		ArrayList<String> voo = obj.getEmpList("MS");
		System.out.println(voo);
		System.out.println(voo.size());

		ArrayList<String> noo = obj.getEmpList("Capgimini");
		System.out.println(noo);
		System.out.println(noo.size());


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
