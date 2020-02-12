
public class Driver {

	public static void main(String[] args) {
		LinkedList people = new LinkedList();
		people.createList();
		people.insertAtFront(people.getHead(), "Laurell");
		people.insertAtFront(people.getHead(), "Sammy");
		
		
		//System.out.println(people.head.getData());
		
		people.insertAtBack(people.getHead(), "Johnny");
		
		Node curr = new Node();
		curr = people.head;
		
		for(int j=0;j<3;j++) {
			System.out.println(curr.getData());
			curr=curr.getNext();	
		}
		//people.DestroyList(people.getHead());
		boolean found = people.SearchForNode(people.getHead(), "Laurell");
		System.out.println(found);
		System.out.println("The list has: " +  Integer.toString(people.CountNodes(people.getHead())) + " Node(s)");
		
		
		
	}

}
