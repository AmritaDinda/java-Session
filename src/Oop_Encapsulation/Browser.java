package Oop_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser....");
		checkBrowser();
		checkOSCompatibility();
		checkRam();
		launchcheckCPU();
	}

	private void checkBrowser() {
		System.out.println("checkBrowser browser.....");
	}

	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility browser....");
	}

	private void checkRam() {
		System.out.println("checkRam browser......");
	}

	private void launchcheckCPU() {
		System.out.println("launchcheckCPU browser......................");
	}

}
