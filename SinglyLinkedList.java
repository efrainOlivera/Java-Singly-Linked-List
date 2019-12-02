public class SinglyLinkedList {
	public Node head;

	// constructor method that sets the head to null 
	public SinglyLinkedList(){
		this.head = null;
	}

	public void add(int value){ 
		Node newNode = new Node(value);
		if(this.head == null){  
			this.head = newNode;
		} else{
			Node runner = this.head;
			while(runner.next != null){
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}

	// remove the last node fromt the singlyLinked list
	public void removeLast(){
		if(this.head.next == null){
			this.head = null;
			return;
		}
		Node runner = this.head;
		while(runner.next != null){
			if(runner.next.next == null){
				runner.next = null;
				return;
			}
			runner = runner.next;
		}
	}

	// Implement a method that will return the fist Node with the value in the parameter.
	public void find(int similar){
		if(this.head == null){
			System.out.println("No nodes are present");
			return;
		}else if(this.head.next == null && this.head.value == similar){
			System.out.println("One Node present, value is " + this.head.value);
		}
		Node runner = this.head;
		while(runner.next != null){
			if(runner.value == similar){
				System.out.println("Node with the same head value found " + runner.value);
				return;
			}
			runner = runner.next;
			if(runner.value == similar){
				System.out.println("Node with the same value foud " + runner.value);
				return;
			}
		}
		System.out.println("No Node Value matches the parameter given");
		return;
	}
	// Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
	public void removeAt(int index){
		int nodeIndex = 0;
		Node runner = this.head;
		if(nodeIndex == index){
			this.head = this.head.next;
			return;
		}
		while(runner.next != null){
			if(runner.next.next != null){
				nodeIndex = nodeIndex + 1;
				if(nodeIndex == index){
					runner.next = runner.next.next;
					return;
				}
			}else{
				nodeIndex = nodeIndex + 1;
				if(nodeIndex == index){
					runner.next = null;
					return;
				}
			}
			runner = runner.next;
		}
		System.out.println("No index equate Node location");
	}

	// display node values 
	public void printValues(){
		if(this.head == null){
			System.out.println("One Node was present, Node was removed");
			return;
		}
		Node runner = this.head;
		while(runner.next != null || runner.next == null){
			System.out.println(runner.value);
			if(runner.next == null){
				break;
			}
			runner = runner.next;
		}
	}
}