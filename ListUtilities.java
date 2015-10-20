public class ListUtilities {
	
	
	public static void arrayToList(int[] input) {
		ListInteger start = null;
		ListInteger end = null;
		ListInteger temp = new ListInteger(input[0]);
		start = temp;
		
		for(int i = 1; i < input.length; i++) {
			start.addListInteger(new ListInteger(input[i])); 
		}
		System.out.println(start.getList(start));
	}
	

}