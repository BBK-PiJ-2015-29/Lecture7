public class MarkCounter {
	private int distinctions;
	private int passes;
	private int fails;
	private int invalid;
	
	public void readMarks() {
		System.out.println("Please input marks between 0 and 100, input -1 to end");
		String input = "";
		int mark = 0;
		do {
			System.out.print("> ");
			input = System.console().readLine();
			mark = Integer.parseInt(input);
			if ((mark < 50) && (mark >=0)) {
				fails++;
			}
			else if (mark < 70) {
				passes++;
			}
			else if (mark < 100) {
				distinctions++;
			}
			else {
				invalid++;
			}
		} while (!input.equals("-1"));
		int total = distinctions + passes + fails;
		System.out.print("There are " + total + " students: ");
		System.out.print(distinctions + " distinctions, ");
		System.out.print(passes + " passes, ");
		System.out.print(fails + " fails ");
		System.out.print("(plus " + invalid + " invalid).");
	}
	
	public static void main(String[] args) {
		MarkCounter counter = new MarkCounter();
		counter.launch();			
	}
	
	public void launch() {
		MarkCounter mainCounter = new MarkCounter();
		mainCounter.readMarks();
	}
}