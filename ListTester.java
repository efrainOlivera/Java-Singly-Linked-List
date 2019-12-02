public class ListTester{
	public static void main(String[] arg){
		/* new keyword, creates an object and allocates memory for it on thr heap.
		Note, we use new when creating arrays, because they are objects.
		Here, we create a variable of type class(SinglyLinkedList) public access */ 
		SinglyLinkedList sll = new SinglyLinkedList(); 
		// sll.add(3);
		sll.add(6);
		sll.add(5);
		sll.add(4);
		sll.add(4);
		// sll.add(6);
		// sll.removeLast();
		// sll.find(4);
		sll.removeAt(4);
		sll.printValues();
	}

}