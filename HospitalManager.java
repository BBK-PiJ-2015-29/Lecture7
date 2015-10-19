public class HospitalManager {
	private Patient patientListStart = null;
	
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
	
	
	private void launch() {
		Patient firstPatient = new Patient("Dave", 22, "Third Nipple");
		patientListStart = firstPatient;
		Patient secondPatient = new Patient("Arnold", 55, "Sudden chest hair loss");
		patientListStart.addPatient(secondPatient);
		Patient thirdPatient = new Patient("Daniel", 34, "Vestigial tail");
		patientListStart.addPatient(thirdPatient);
		Patient forthPatient = new Patient("Daphne", 29, "Repeated slight scares and exposure to cannabis smoke");
		patientListStart.addPatient(forthPatient);
		Patient fifthPatient = new Patient("William", 85, "Bloated Ego");
		patientListStart.addPatient(fifthPatient);
		Patient sixthPatient = new Patient("Elizabeth", 89, "Fear of own face");
		patientListStart.addPatient(sixthPatient);
		Patient seventhPatient = new Patient("Katy", 39, "Reverse anorexia");
		patientListStart.addPatient(seventhPatient);
		Patient eighthPatient = new Patient("Mark", 59, "Sudden savant-like pianist skill");
		patientListStart.addPatient(eighthPatient);
		Patient ninthPatient = new Patient("Grant", 44, "Haunted");
		patientListStart.addPatient(ninthPatient);
		
		//Create new patient object within the add patient method.
		
		ninthPatient.addPatient(new Patient("Elena", 65, "Backwards facing foot"));
		
		System.out.println("There are " + patientListStart.countPatients() + " patients");
		
		System.out.println(patientListStart.getPatients(patientListStart));
		
		
		patientListStart.deletePatient(sixthPatient);
		patientListStart.deletePatient(secondPatient);
		
		System.out.println("There are now " + patientListStart.countPatients() + " patients");
		
		System.out.println(patientListStart.getPatients(patientListStart));
		
		
		patientListStart = thirdPatient;
		
		System.out.println("There are now " + patientListStart.countPatients() + " patients");
		System.out.println(patientListStart.getPatients(patientListStart));
		
		//iterative counter
		int count = 1;
		Patient temp = patientListStart;
		do {
			count++;
			temp = temp.getNextPatient();
		} while(temp.getNextPatient() != null);
		System.out.println("Iteratively calculated patient number: " + count);
	}
}