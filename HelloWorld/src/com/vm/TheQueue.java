package com.vm;

import java.util.Arrays;

public class TheQueue {
	private String q[];
	int front = -1;
	int rear = -1;
	int qSize = 0;

	public TheQueue(int size) {
		q = new String[size];
		qSize = size;
		Arrays.fill(q, " ");
	}

	public void displayQ() {
		System.out.println("contents of q");
		System.out.println("-----------------------------------------------------------");
		for (int index = 0; index < q.length; index++) {
			System.out.print(q[index] + " |");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------");
	}

	public void insert(String num) {
		if (rear + 1 < q.length) {
			q[++rear] = num;
			if (front == -1){
				front = 0;
			}
			System.out.println("Element inserted to q is :" + num);
		} else {
			System.out.println("Q is full");
		}
	}

	public void remove(){
		
		if(front!=-1){
			System.out.println("Element removed from q is :"+q[front]);
			q[front] =" ";
			front++;
			if(front > rear){
				front =-1;
				rear =-1;
				System.out.println("Q is reset");
			}
		}else{
			System.out.println("Q is empty");
		}
	}

	public static void main(String[] args) {
		TheQueue q = new TheQueue(10);
		q.displayQ();
		q.remove();
		for (int i = 1; i < 12; i++) {
			q.insert("" + i);
		}

		q.displayQ();
		
		for (int i = 1; i < 12; i++) {
			q.remove();
		}
		q.displayQ();
		
		for (int i = 11; i < 22; i++) {
			q.insert("" + i);
		}

		q.displayQ();
		
		for (int i = 1; i < 12; i++) {
			q.remove();
		}
		q.displayQ();
	}
}
