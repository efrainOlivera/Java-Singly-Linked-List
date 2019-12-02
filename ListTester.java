public class ListTester{
	public static void main(String[] arg){
		/* new keyword, creates an object and allocates memory for it on thr heap.
		Note, we use new when creating arrays, because they are objects.
		Here, we create a variable of type class(SinglyLinkedList) public access */ 
		SinglyLinkedList sll = new SinglyLinkedList(); 
		sll.add(3);
		sll.add(6);
		sll.add(5);
		sll.add(4);
		sll.add(4);
		sll.add(6);
		sll.removeLast(); // remove last node
		sll.find(4);		// find Node value matching argument
		sll.removeAt(4);	// remove the node after n nodes
		sll.printValues();
	}

}