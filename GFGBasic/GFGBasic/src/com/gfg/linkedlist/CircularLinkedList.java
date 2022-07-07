package com.gfg.linkedlist;

public class CircularLinkedList {

	public static void main(String[] args) {
		

	}

	void printList(Node head) {
		if(head == null)return;
		System.out.print(head.value + " ");
		for(Node r = head.next; r!= head;r = r.next) {
			System.out.print(r.value +" ");
		}
	}
	
	public Node insertAtBegin(Node head, int value) {
		Node temp = new Node(value);
		if(head == null) {
			temp.next = temp;
		}else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
		}
		return temp;
	}
	
	// insert at begin efficient solution 
	// step 1: insert after 1 st node initially 
	// step 2 : swap data of first and second node
	// step 3: return first as head
	
	public Node insertAtBeginEfficient(Node head, int value) {
		Node temp = new Node(value);
		if(head == null) {
			temp.next = temp;
			return temp;
		}
		else {
			temp.next = head.next;
			head.next = temp;
			int x = temp.value;
			temp.value = head.value;
			head.value = x;
			return head;
		}
	}
	
	public Node insertAtEnd(Node head, int value) {
		Node temp = new Node(value);
		if(head == null) {
			temp.next = temp;
			return temp;
		}else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = temp;
			temp.next = head;
			return head;
		}
	}
	
	// insert at end efficient solution 
		// step 1: insert after 1 st node initially 
		// step 2 : swap data of first and second node
		// step 3: return second as head
	
	public Node insertAtEndEfficient(Node head, int value) {
		Node temp = new Node(value);
		if(head == null) {
			temp.next = temp;
		}else {
			temp.next = head.next;
			head.next = temp;
			int x = head.value;
			head.value = temp.value;
			temp.value = x;
		}
		return temp;
	}
	
	
	public Node deleteHead(Node head) {
		if(head == null || head.next == head) return null;
		else {
			Node curr = head;
			while(curr.next != head) {
				curr = curr.next;
			}
			curr.next = head.next;
			return curr.next;
		}
	}
	
	public Node deleteHeadOfLinkedListEfficient(Node head) {
		if(head == null || head.next == head) return null;
		else {
			//int x = head.value;
			head.value = head.next.value;
			//head.next.value =x;
			head.next = head.next.next;
			return head;
		}
	}
	
	public Node deletekthNode(Node head,int k) {
		if(head == null) return head;
		if(k ==1) {
			return deleteHeadOfLinkedListEfficient(head);
		}
		Node curr = head;
		for(int i=0;i<k-2;i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		return head;
	}
	
}
