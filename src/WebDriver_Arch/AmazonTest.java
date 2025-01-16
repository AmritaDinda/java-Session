package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

//		ChromeDriver driver = new ChromeDriver();
//		FireFoxDriver driver = new FireFoxDriver();
//		SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		webDriver driver = null;
		
		//cross browser logic :
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();//top casting
		}
		else if(browser.equals("FireFox")) {
			driver = new FireFoxDriver();
		}
		else if(browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("plz enter right browser");
		}
		
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElements("emailId");
		driver.sendKey("emailId","amritadinda8122gmail.com");
		driver.findElements("password");
		driver.sendKey("password","amrita@#123");
		driver.findElements("loginButton");
		driver.click("loginButton");
		driver.close();

		
	}

}
