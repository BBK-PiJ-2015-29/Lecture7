public class ListInteger {
	private int value;
	private ListInteger next;
	private ListInteger prev;
	
	public ListInteger(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	
	public void addListInteger(ListInteger input) {
		if(this.next == null) {
			this.next = input;
			input.prev = this;
		}
		else {
			this.next.addListInteger(input);
		}
	}
	
	public String getList(ListInteger start) {
		String str = "";
		if(start != null) {
			str = start.toString() + "\n";
			return str + start.getList(start.next);
		}
		return str;
	}
	
	//getters and setters
	public int getValue() {
		return this.value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public ListInteger getNext() {
		return this.next;
	}
	public void setNext(ListInteger next) {
		this.next = next;
	}
	
	public ListInteger getPrev() {
		return this.prev;
	}
	public void setPrev(ListInteger prev) {
		this.prev = prev;
	}
	
	//value to string method
	public String toString() {
		return this.value + " ";
	}
}