
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
	
	
	public void insertAtBack(Node he, String data) {
		Node temp1 = new Node();
		Node temp2 = new Node();
		
		if(isFull()) {
			System.out.println("List is full");
		}
		else {
			temp1.setData(data);
			if(he==null) {
				he=temp1;
			}
			else {
				temp2 = he;
				while(temp2.getNext().getNext()!=null) {
					temp2 = temp2.getNext();
				}
				temp2.setNext(temp1);
			}
		}
	}
	
	
	
	public boolean SearchForNode(Node h, String d) {
		Node temp = new Node();
		temp = h;
		
		
		while(temp!=null) {
			if(temp.getData()==d) {
				return true;
			}
			temp=temp.getNext();
		}
		return false;
	}
	
	
	public int CountNodes(Node h) {
		Node temp = new Node();
		temp=h;
		int count=0;
		
		while(temp!=null) {
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	
	
	public boolean listEmpty(Node h) {
		if(h==null) {
			return true;
		}
		return false;
	}
	
	
	
}
