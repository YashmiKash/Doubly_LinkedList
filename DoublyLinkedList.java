package src;

public class DoublyLinkedList {
	    // Node class to represent each element in the linked list
	    class Node {
	        int data;
	        Node prev;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.prev = null;
	            this.next = null;
	        }
	    }

	    // Head of the linked list
	    private Node head;

	    public DoublyLinkedList() {
	        this.head = null;
	    }

	    // Method to insert a new node at the end of the linked list
	    public void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	            newNode.prev = current;
	        }
	    }

	    // Method to display the linked list in forward direction
	    public void displayForward() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    // Method to display the linked list in reverse direction
	    public void displayBackward() {
	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        
	        System.out.println("Forward:");
	        list.displayForward();
	        
	        System.out.println("Backward:");
	        list.displayBackward();
	    }
	}


