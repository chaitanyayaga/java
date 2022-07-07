package com.gfg.linkedlist;

public class DLinkOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DNode head=new DNode(10);
    	DNode temp1=new DNode(20);
    	DNode temp2=new DNode(30);
    	head.next = temp1;
    	temp1.prev = head;
    	temp1.next = temp2;
    	temp2.prev = temp1;
    	DLinkOperations dLinkOperations = new DLinkOperations();
    	dLinkOperations.printList(head);

	}
	
	public void printList(DNode head) {
		DNode curr = head;
		while(curr != null) {
			System.out.println(" "+ curr.value);
			curr = curr.next;
		}
	}
	
	public DNode insertBegin(DNode head, int value) {
		DNode node = new DNode(value);
		node.next = head;
		if(head != null) {
		 head.prev = node;
		}
		return node;
	}
	
	public DNode insertAtEnd(DNode head, int value) {
		DNode temp = new DNode(value);
		if(head == null) {
			return temp;
		}
		DNode curr = head;
		
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.prev = curr;
		return head;
	}

}
