package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		System.out.println("hi");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
		}

		catch (NullPointerException n) {
			System.out.println("NPE is coming");
		}

		finally {
			System.out.println("Byee --finally block");
		}

	}

}
