package ExceptionHandling;

public class MultipleTryCatchBlock2 {

		int age;

		public static void main(String[] args) {

			System.out.println("A");
			System.out.println("A");
			System.out.println("A");

			

			try {
				int i = 9 / 0;//AE
				TryCatchBlock obj = new TryCatchBlock();
				obj = null;
				obj.age = 20;//NPE
							} 
			catch (ArithmeticException e) {
				System.out.println("AE is coming....");
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				System.out.println("NPE is coming");
				e.printStackTrace();
			}

			System.out.println(" bye A");

	}

}
