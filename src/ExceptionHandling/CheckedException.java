package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {

		System.out.println("A");
		try {
			Thread.sleep(5000);//input is on mili sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("B");
		
		try {
			FileInputStream ip = new FileInputStream("c:\\documents\\text.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
