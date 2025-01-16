package Oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		
		
		FortisHospital fh = new FortisHospital();
		fh.cardioService();
		fh.pediaService();
		fh.emergencyService();
		fh.neuroService();
		fh.oncologyService();
		fh.orthologyService();
		fh.medicalClaim();
		fh.medicalTraining();
		
		fh.medicalRD();
		
		System.out.print(USMedical.min_fee);
		System.out.print(fh.min_fee);
		System.out.print(USMedical.isApproved);

		

		
		System.out.print("--------------");

		//top casting : child class object have referred by parent interface reference variable.
		USMedical us = new FortisHospital();
		us.cardioService();
		us.detalService();
		us.emergencyService();
		us.physioService();
		
		WHO wh = new FortisHospital();
		wh.healthNews();
		
		//down casting : NA [ not applicable ]
		
		USMedical.billing();
		FortisHospital.billing();
		
		
		
		
	}

}
