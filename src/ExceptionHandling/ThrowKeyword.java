package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try {
			throw new Exception("User is not found exception");
		} catch (Exception e) {
			System.out.println("noo not found");
			e.printStackTrace();
		}

		System.out.println("---------");

		String data = null;
		if (data == null) {
			try {
				throw new Exception("DONOTFOUNDEXCEPTION");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		try {
    	System.out.println(data.length());
		}catch(NullPointerException e) {
        	System.out.println("can not calculate length");

		}
    	System.out.println("Bye");


	}

}
