package OOP_Interface;

public class ApolloHospital implements UKMedical,USMedical,IndianmedicalServices{

	@Override
	public void physioServices() {
		System.out.println("Apollo ---phusioSerices");
		
		
	}

	@Override
	public void gynecServices() {
		System.out.println("Apollo ---gynecSerices");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("Apollo ---emergencySerices");
		
	}

	@Override
	public void covidTest() {
		System.out.println("Apollo ---covidTest");	
		
	}

	@Override
	public void orthoServices() {
		System.out.println("Apollo ---orthoSerices");
	}

	@Override
	public void neuroServices() {
		System.out.println("Apollo ---neuroSerices");
		
	}

	@Override
	public void radioServices() {
		System.out.println("Apollo ---radioSerices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("Apollo ---cardioSerices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("Apollo ---oncologySerices");
		
	}
	
	public void HomeopathyServices() {
		System.out.println("Apollo -- Homeopathy");
	}

}
