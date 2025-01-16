package Oop_interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	int min_fee  = 50;

	
	// US
	@Override
	public void physioService() {
		System.out.println("FH - physioService");
	}

	@Override
	public void cardioService() {
		System.out.println("FH - cardioService");

	}

	@Override
	public void detalService() {
		System.out.println("FH - detalService");

	}

	// UK
	@Override
	public void neuroService() {
		System.out.println("FH - neuroService");

	}

	@Override
	public void pediaService() {
		System.out.println("FH - pediaService");

	}

	// India
	@Override
	public void oncologyService() {
		System.out.println("FH - oncologyService");

	}

	@Override
	public void orthologyService() {
		System.out.println("FH - orthologyService");

	}

	// common :
	@Override
	public void emergencyService() {
		System.out.println("FH - emergencyService");

	}

	// individual:
	public void medicalTraining() {
		System.out.println("FH - medicalTraining");

	}

	public void medicalClaim() {
		System.out.println("FH - medicalClaim");

	}

	@Override
	public void healthNews() {
		System.out.println("Fh - healthNews");
		
	}
	
	//method hiding :
	public static void billing() {
		System.out.println("Fh - billing");
	}
	
	@Override
	public void medicalTest() { //default method can be override
		System.out.println("FH - medical test");
	}



}
