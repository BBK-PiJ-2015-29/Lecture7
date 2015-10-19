public class HospitalManager {
	private Patient patientListStart = null;
	
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
	
	
	public void launch() {
		Patient firstPatient = new Patient("Dave", 22, "Third Nipple");
		patientListStart = firstPatient;
		Patient secondPatient = new Patient("Arnold", 55, "Sudden chest hair loss");
		firstPatient.addPatient(secondPatient);
		Patient thirdPatient = new Patient("Daniel", 34, "Vestigial tail");
		secondPatient.addPatient(thirdPatient);
		Patient forthPatient = new Patient("Daphne", 29, "Repeated slight scares and exposure to cannabis smoke");
		thirdPatient.addPatient(forthPatient);
		Patient fifthPatient = new Patient("William", 85, "Bloated Ego");
		forthPatient.addPatient(fifthPatient);
		Patient sixthPatient = new Patient("Elizabeth", 89, "Fear of own face");
		fifthPatient.addPatient(sixthPatient);
		Patient seventhPatient = new Patient("Katy", 39, "Reverse anorexia");
		sixthPatient.addPatient(seventhPatient);
		Patient eighthPatient = new Patient("Mark", 59, "Sudden savant-like pianist skill");
		seventhPatient.addPatient(eighthPatient);
		Patient ninthPatient = new Patient("Grant", 44, "Haunted");
		eighthPatient.addPatient(ninthPatient);
		
		//Create new patient object within the add patient method.
		
		ninthPatient.addPatient(new Patient("Elena", 65, "Backwards facing foot"));
		
		System.out.println(patientListStart.getPatients(patientListStart));
		
		patientListStart.deletePatient(sixthPatient);
		patientListStart.deletePatient(secondPatient);
		
		System.out.println(patientListStart.getPatients(patientListStart));
		
		patientListStart.deletePatient(firstPatient);
		patientListStart = secondPatient;
		
		System.out.println(patientListStart.getPatients(patientListStart));
		
	}
}