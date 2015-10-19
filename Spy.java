public class Spy {
	private static int spyCount = 0;
	private int idNumber;
	
	public Spy(int idNumber) {
		this.idNumber = idNumber;
		spyCount++;
		System.out.println("New spy ID#: " + idNumber + " added.");
		System.out.println("Total number of spies: " + getNumberOfSpies());
	}
	
	public static int getNumberOfSpies() {
		return spyCount;
	}
	
	public void die() {
		System.out.println("Spy: " + this.idNumber + " has been detected and eliminated.");
		spyCount--;
		System.out.println("Total number of spies: " + getNumberOfSpies());
	}
	
	public static void main(String[] args) {
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		Spy spy4 = new Spy(4);
		Spy spy5 = new Spy(5);
		
		spy4.die();
		spy2.die();
	}
}