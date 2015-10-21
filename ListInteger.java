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
		//unsorted list
		/*if(this.next == null) {
			this.next = input;
			input.prev = this;
		}
		else {
			this.next.addListInteger(input);
		}*/
		
		//sorted list
		if (this.value <= input.value) {
			if (this.next == null) {
				this.next = input;
				input.prev = this;	
			}
			else if (this.next.value > input.value) {
				this.next.prev = input;
				input.next = this.next;
				this.next = input;
				input.prev = this;
			}
			else {
				this.next.addListInteger(input);
			}
		}
		else {
			if ((this.prev == null)) {
				this.prev = input;
				input.next = this;
			}
			else if(this.prev.value <= input.value) {
				this.prev.next = input;
				input.prev = this.prev;
				input.next = this;
				this.prev = input;
			}
			else {
				this.prev.addListInteger(input);
			}
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