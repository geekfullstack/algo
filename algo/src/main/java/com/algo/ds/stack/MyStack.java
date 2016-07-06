package com.algo.ds.stack;



public class MyStack {
	
	public static void main(String args[]){
		
	/* Java inBuilt Stack Code */
		
	/*	Stack<String> s = new Stack<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		
		System.out.println(s.peek());
		System.out.println("Before Pop" + s);
		s.pop();
		System.out.println(s);
		s.add("d");
		System.out.println(s); */
		
		MyStack stack = new MyStack();
		
		stack.push(10);
		stack.push(12);
		stack.push(14);
		System.out.println(stack.seek());
		stack.pop();
		System.out.println(stack.seek());
	}
	
	int array[] = new int[10];
	
	int current=-1;
	
	
	public void push(int elementToPush){
		current++;
 		array[current] = elementToPush;
	}
	
	
	public int seek(){
		return array[current];
	}
	
	
	public void pop(){
		
		array[current] =-1;
		current--;
		
	}
	

}
