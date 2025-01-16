package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "opera";
		if(browser.equals("chrome")) {
			System.out.println("lunch chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("lunch firefox");
		}
		else if(browser.equals("safari")) {
			System.out.println("lunch safari");
		}
		else {
			System.out.println("plz pass the right browser");
			throw new MyException("BrowserNotFoundException");

		}
	}

}
