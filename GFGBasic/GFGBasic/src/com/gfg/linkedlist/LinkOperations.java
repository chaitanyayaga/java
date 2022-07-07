package com.gfg.linkedlist;

public class LinkOperations {

	public static void main(String[] args) {
		LinkOperations linkOperations = new LinkOperations();
		Node head = null;
		
		Node temp = linkOperations.insertAttheEnd(10, head);
		Node temp1 = linkOperations.insertAttheEnd(20, temp);
		Node temp2 = linkOperations.insertAttheEnd(30, temp1);
		Node temp3 = linkOperations.insertAttheEnd(40, temp2);
		Node temp4 = linkOperations.insertAttheEnd(50, temp3);
		
		Node temp5 = linkOperations.insertAtPostion(15, temp4, 1);
		
		//Node temp6 = linkOperations.deleteFirstLinkedList(temp5);
		Node temp6 = linkOperations.deleteLastInLinkedList(temp5);
		linkOperations.printLinkedList(temp6);
		System.out.println();
		System.out.println(linkOperations.positionInLinkedList(20, temp6));
		System.out.println(linkOperations.positionInLinkedList(60, head));
	}
	
	public void printLinkedList(Node head) {
		if(head != null) {
			Node current = head;
			while(current != null) {
				System.out.print(  current.value+ " " );
				current = current.next;
			}
		}
	}
	
	public Node insertAtBegining(int value, Node head) {
		Node node = new Node(value);
		if(head == null) {
			return node;
		}else {
			node.next = head;
		}
		return node;
	}
	
	public Node insertAttheEnd(int value, Node head) {
		Node node = new Node(value);
		if(head == null)
			return node;
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = node;
		}
		return head;
	}
	
	public Node insertAtPostion(int value, Node head, int position) {
		Node node = new Node(value);
		Node current = head;
		int count = 0;
		
		if(head == null ) return node;
		if(position == 1) {
			return insertAtBegining(value,head);
		}
		if(head != null) { // insert in the middle
			for(int i=0;i< position- 2 && current!= null; i++) {
				current = current.next;
			}
			if(current == null) {
				return head;
			}
			node.next = current.next;
			current.next = node;
			return head;
		}
		return head;
	}
	
	public Node sortedInserted(Node head,int x) {
		Node temp = new Node(x);
		if(head == null)
			return temp;
		if(head.value > x) {
			temp.next = head;
			return temp;
		}
		Node current = head;
		while(current.next != null && current.value < x) {
			current = current.next;
		}
		temp.next = current.next;
		current.next = temp;
		return head;
	}
	
	public Node deleteFirstLinkedList(Node head) {
		Node temp = null;
		if(head != null) {
			temp = head;
			head = head.next;
			temp = null;
		}
		return head;
	}
	
	public Node deleteLastInLinkedList(Node head) {
		Node current= head;
		if(current == null) {
			return head;
		}else {
			while(current.next.next != null) {
				current = current.next;
			}
			 current.next = null;
		}
		return head;
	}
	
	public int positionInLinkedList(int value, Node head) {
		int position =1;
		Node current = head;
		while(current != null) {
			if(current.value == value) {
				return position;
			}else {
				position++;
				current = current.next;
			}
		}
		return -1;
		
	}
	
	public int positionInLinkedListRecursive(int value, Node head) {
		if(head == null) return -1;
		if(head.value == value)
			return 1;
		else {
			int result = positionInLinkedListRecursive(value ,head.next);
			if(result == -1 ) 
				return -1;
			else 
				return result+1;
		}
	}

}
