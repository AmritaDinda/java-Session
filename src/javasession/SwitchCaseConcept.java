package javasession;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser = "opera";
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break; //break is used for switch only it's not apllicable for plan if else condition 
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the right browser......");
			break;
		}
		
		
		
		// WAP to check given alphabet character is Vowel or Consonant using switch -
		
		char ch ='i';
		switch (ch) {
		case 'a':
		  System.out.println(ch + ":is a vowel");
		  break;
		case 'e':
		  System.out.println(ch + ":is a vowel");
		  break;
		case 'i':
		  System.out.println(ch + ":is a vowel");
		  break;
		case 'o':
		  System.out.println(ch + ":is a vowel");
		  break;
		case 'u':
		  System.out.println(ch + ":is a vowel");
		  break;
		  
		  default:
			  System.out.println(ch + ":is a Consonent"); 
			  break;
		}
		
		
		
		//WAP for QA,Stage,UAT,DEV,PROD
		
		String envName = "   QA ";
		switch (envName.toLowerCase().trim()) {
		case "qa":
			System.out.println("Run test on QA");
			break;
        case "stage":
        	System.out.println("Run test on stage");
			break;
        case "uat":
        	System.out.println("Run test on UAT");
			break;
        case "dev":
        	System.out.println("Run test on DEV");
			break;	
        case "prod":
        	System.out.println("Run test on PROD");
			break;

		default:
			System.out.println("Please pass the write environment");
			break;
		}
	}

}



