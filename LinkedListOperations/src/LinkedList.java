
public class LinkedList {
	Node head;
	int count=0, limit=5;
	/*Default constructor for linked list initialization*/
	public LinkedList() {
	}
        /*Function used to return head node*/
	public Node getHead() {
		return head;
	}
	/*Function used to get limit/size*/
	public int getLimit() {
		return limit;
	}
	/*Function used to set the limit*/
	public void setLimit(int limit) {
		this.limit = limit;
	}
	/*Function used to set/change head node value*/
	public void setHead(Node head) {
		this.head = head;
	}
	/*Function to check whether node is full or not*/
	public boolean isFull() {
		if(count>limit) {
			return true;
		}
		return false;
	}
	/*Function used to create a list*/
	public Node createList() {
		head = new Node();
		return head;
	}
	
	
	/*Function used to delete/destory node */
	public void DestroyList(Node h) {
		Node Temp = new Node();
		
		while(head != null) {
			Temp=head;
			head=head.getNext();
			Temp=null;
		}
		System.out.println("List has been destroyed");
	}
	
	
	/*Function to insert node at front*/
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
	
	/*Function to insert node at the end/back*/
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
	
	
	/*Function to search for a node in linked list*/
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
	
	/*Function which returns the number of nodes in linked list*/
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
	
	/*Function to check whether list is empty or not*/
	public boolean listEmpty(Node h) {
		if(h==null) {
			return true;
		}
		return false;
	}
	
	
	
}
