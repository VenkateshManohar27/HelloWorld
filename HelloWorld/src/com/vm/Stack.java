package com.vm;

import java.util.Arrays;

public class Stack {
	private String stack[];
	private int top = -1;

	public Stack(int size) {
		stack = new String[size];
		Arrays.fill(stack, "");
	}

	public boolean push(String num) {
		boolean result = false;
		if(top +1 < stack.length){
			result =true;
			stack[++top]= num;
			System.out.println("Number inserted to stack is :"+num);
		}else{
			System.out.println("Stack is full");
		}
		return result;
	}
	
	public String pop(){
		String popped = null;
		if(top >= 0){
			popped = stack[top];
			stack[top]="";
			top --;
			System.out.println("Element popped is : "+ popped);
		}else{
			System.out.println("Stack is empty");
		}
		return popped;
	}
	
	public void displayStack(){
		System.out.println("Stack contents");
		for(int index =0; index< stack.length; index++){
			System.out.print(stack[index]+" | ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(10);
		s.displayStack();
		s.push("1");
		s.push("2");
		s.displayStack();
		s.push("3");
		s.pop();
		s.displayStack();
		s.pop();
		s.pop();
		s.displayStack();
	}
}
