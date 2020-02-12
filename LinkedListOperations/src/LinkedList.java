
public class LinkedList {
	Node head;
	int count=0, limit=5;
	
	public LinkedList() {
	}

	public Node getHead() {
		return head;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean isFull() {
		if(count>limit) {
			return true;
		}
		return false;
	}
	
	public Node createList() {
		head = new Node();
		return head;
	}
	
	
	
	public void DestroyList(Node h) {
		Node Temp = new Node();
		
		while(head != null) {
			Temp=head;
			head=head.getNext();
			Temp=null;
		}
		System.out.println("List has been destroyed");
	}
	
	
	
	public void insertAtFront(Node h, String data) {
		Node temp = new Node();
		
		if(isFull()) {
			System.out.println("List is full");
		}
		else {
			temp.setData(data);
			if(head==null) {
				head=temp;
			}
			else {
				temp.setNext(head);
				head=temp;
			}
		}
	}
	
	
	public void insertAtBack(Node h, String data) {
		Node temp1 = new Node();
		Node temp2 = new Node();
		
		if(isFull()) {
			System.out.println("List is full");
		}
		else {
			temp1.setData(data);
			
			if(head==null) {
				head=temp1;
			}
			else {
				temp2 = head;
				while(temp2.getNext()!=null) {
					temp2 = temp2.getNext();
				}
				temp2.setNext(temp1);
			}
		}
	}
	
	
	
	
}
