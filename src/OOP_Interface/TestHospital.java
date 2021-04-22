package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();// we can access all the methods from fortisHospital class - 
												//is does not matter if it is coming from parent of fortisHospital class
		fh.cardioServices();
		fh.emergencyServices();
		fh.gynecServices();
		
		fh.medicalInsurance();
		fh.pathlogyServices();
		
		USMedical.billing();
		fh.texCollection();
		fh.RD();
		System.out.println(USMedical.min_fee);
		
		//top casting: child class object is referred by parent interface ref variable
		USMedical us = new FortisHospital();
		
		us.orthoServices();
		us.emergencyServices();
		us.neuroServices();
		us.radioServices();
		
		System.out.println("____________________");
		
		ApolloHospital Ah = new ApolloHospital();
		Ah.cardioServices();
		Ah.covidTest();
		Ah.emergencyServices();
		Ah.HomeopathyServices();
		//Ah.medicalInsurance -- not able to acces siblings method
		
		
		//Top casting
		USMedical US = new ApolloHospital();
		US.orthoServices();
		US.emergencyServices();
		US.neuroServices();
		US.radioServices();
			
		
		
	}

}
