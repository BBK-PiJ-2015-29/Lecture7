public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;			
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
	public String getPatients(Patient p){
		//String.Format("this %d",myint)
		String str = "";
		if (p != null) {
			str = p.getName() + ", " + p.getAge() + ", " + p.getIllness() + "\n";
			return str + getPatients(p.nextPatient);		
		}
		return str;	
	}
	
	public boolean deletePatient(Patient p) {
		if (this.nextPatient == null) {
			return false; 			
		}
		else if (this.nextPatient.name.equals(p.name)) {
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
	
	
}