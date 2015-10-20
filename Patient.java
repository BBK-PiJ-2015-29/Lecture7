public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;
	
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
		
	}
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			newPatient.previousPatient = this;
		}
		else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public int countPatients() {
		int count = 0;
		if (this.nextPatient == null) {
			count++;
			return count;
		}
		else {
			count++;
			count += this.nextPatient.countPatients();
			return count;
		}
	}
	public String getPatientsDescend(Patient listStart){
		//String.Format("this %d",myint)
		String str = "";
		if (listStart != null) {
			str = listStart.getName() + ", " + listStart.getAge() + ", " + listStart.getIllness() + "\n";
			return str + getPatientsDescend(listStart.nextPatient);		
		}
		return str;	
	}
	
	public String getPatientsAscend(Patient listEnd) {
		String str = "";
		if (listEnd != null) {
			str = listEnd.getName() + ", " + listEnd.getAge() + ", " + listEnd.getIllness() + "\n";
			return str + getPatientsAscend(listEnd.previousPatient);
		}
		return str;
	}
	public boolean deletePatient(Patient p) {
		if (this.nextPatient == null) {
			return false; 			
		}
		else if (this.nextPatient.name.equals(p.name)) {
			
			this.nextPatient.nextPatient.previousPatient = this;
			this.nextPatient = this.nextPatient.nextPatient;
			return true;
		}
		else {
			return this.nextPatient.deletePatient(p);
		}
	}
	
	//getters and setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setIllness(String illness) {
		this.illness = illness;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
	public void setNextPatient(Patient nextPatient) {
		this.nextPatient = nextPatient;
	}
	
	public Patient getNextPatient() {
		return this.nextPatient;
	}
	
	public void setPrevPatient(Patient previousPatient) {
		this.previousPatient = previousPatient;
	}
	public Patient getPrevPatient() {
		return this.previousPatient;
	}
}