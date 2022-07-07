package com.gfg.linkedlist;

public class CircularDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public DNode insertAtBegin(DNode head, int x) {
		DNode temp = new DNode(x);
		if(head == null) {
			temp.next = temp;
			temp.prev = temp;
		}
		else {
			//DNode sample = head.prev;
			//sample.next = temp;
			//temp.prev = sample;
			//temp.next = head;
			//head.prev = temp;
			
			temp.prev = head.prev;
			temp.next = head;
			
			head.prev.next = temp;
			head.prev = temp;
			
		}
		return temp;
	}

}
