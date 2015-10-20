public class ListUtilities {
	
	
	public static ListInteger arrayToList(int[] input) {
		ListInteger start = null;
		ListInteger end = null;
		ListInteger temp = new ListInteger(input[0]);
		start = temp;
		
		for(int i = 1; i < input.length; i++) {
			start.addListInteger(new ListInteger(input[i])); 
		}
		return start;
		//System.out.println(start.getList(start));
	}
	

}