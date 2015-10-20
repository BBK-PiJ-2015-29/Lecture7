public class HospitalManager {
	private Patient patientListStart = null;
	private Patient patientListEnd = null;
	
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
		Patient tenthPatient = new Patient("Elena", 65, "Backwards facing foot");
		patientListStart.addPatient(tenthPatient);
		patientListEnd = tenthPatient;
		//use recursive method to count patients
		System.out.println("There are " + patientListStart.countPatients() + " patients");
		
		//iterative counter
		int count = 1;
		Patient temp = patientListStart;
		do {
			count++;
			temp = temp.getNextPatient();
		} while(temp.getNextPatient() != null);
		System.out.println("Iteratively calculated patient number: " + count);
		
		//print patient list forwards and backwards using recursive methods
		System.out.println("Patient list starting at first patient and descending");
		System.out.println(patientListStart.getPatientsDescend(patientListStart));
		System.out.println("Patient list starting at last patient and ascending");
		System.out.println(patientListEnd.getPatientsAscend(patientListEnd));
		
		// delete patients
		patientListStart.deletePatient(sixthPatient);
		patientListStart.deletePatient(secondPatient);
		
		//recursive counter
		System.out.println("There are now " + patientListStart.countPatients() + " patients");
		
		//new recursive print
		System.out.println(patientListStart.getPatientsDescend(patientListStart));
				
		// delete first patient, set start of list to 3rd as 2nd has already been deleted
		patientListStart = thirdPatient;
		
		// new patient count and print
		System.out.println("There are now " + patientListStart.countPatients() + " patients");
		System.out.println(patientListStart.getPatientsDescend(patientListStart));
		
		
	}
}