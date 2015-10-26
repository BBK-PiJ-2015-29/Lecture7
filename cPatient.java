public class cPatient {
	private String name;
	private int age;
	private String illness;
	private cPatient next;
	
	public cPatient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.next = this;
	}
	
	// add patient method
	
	public void addCPatient(cPatient start, cPatient newPatient) {
		if (this.next == start) {
			this.next = newPatient;
			newPatient.next = start;
		}
		else {
			this.next.addCPatient(start, newPatient);
		}
	}
	
	//delete patient method
	public void deletePatient( cPatient toBeDeleted) {
		if (this.next == toBeDeleted) {
			this.next = this.next.next;
		}
		else {
			this.next.deletePatient(toBeDeleted);
		}
	}
	
	//getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
	public void setName(String illness) {
		this.illness = illness;
	}

}