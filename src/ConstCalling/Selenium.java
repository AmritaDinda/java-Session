package ConstCalling;

public class Selenium implements Goggle{


	@Override
	public void search() {
		System.out.println("Selenium search");
		//super.count();
		System.out.println(Goggle.count);

	}

}
