public class ListUtilities {
	
	
	public static ListInteger arrayToList(int[] input) {
		ListInteger start = null;
		ListInteger end = null;
		ListInteger temp = new ListInteger(input[0]);
		start = temp;
		
		for(int i = 1; i < input.length; i++) {
			ListInteger loopInt = new ListInteger(input[i]);
			start.addListInteger(loopInt);
			if (start.getValue() > input[i]) {
				start = loopInt;
			}
		}
		return start;
		//System.out.println(start.getList(start));
	}
	
	//method which adds an element to an existing sorted list
	public static ListInteger addElement(ListInteger element, ListInteger start) {
		start.addListInteger(element);
		return start;
	}
	

}