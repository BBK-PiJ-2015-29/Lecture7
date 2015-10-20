public class Ex9 {
	 
	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		ex9.launch();
	}
	
	public void launch() {
		
		//int[] test = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] test = {3,4,1,2,5,6,8,7,9,11,13,12,10,15,16,14,17,20,19,18};
		ListInteger output = ListUtilities.arrayToList(test);
		
		System.out.println(output.getList(output));
		
		
	}
}