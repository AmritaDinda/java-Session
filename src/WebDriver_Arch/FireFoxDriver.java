package WebDriver_Arch;

public class FireFoxDriver implements webDriver {

	public FireFoxDriver() {
		System.out.println("launch the FireFox browser.....");

	}

	@Override
	public void get(String url) {
		System.out.println("entering URL :" + url);
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public void click(String elements) {
		System.out.println("Click on :" + elements);

	}

	@Override
	public void sendKey(String elements, String value) {
		System.out.println("entering" +" "+ value +" " + "into" +" "+  elements);

	}

	@Override
	public void close() {
		System.out.println("close Browser");

	}

	@Override
	public void findElements(String elements) {
		System.out.println("finding the elements by using :" + elements);

	}

}
