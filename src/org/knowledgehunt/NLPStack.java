package org.knowledgehunt;

import java.util.Stack;

import org.knowledgehunt.model.Intent;

public class NLPStack {
	
	private Stack<Intent> stack;

	public NLPStack() {
		super();
		// TODO Auto-generated constructor stub
		this.stack=new Stack<Intent>();
	}
	
	public boolean isEmpty()
	{
		return this.stack.empty();
	}
   public void pushToStack(Intent intent)
   {
	   this.stack.push(intent);
   }
	public Intent popFromStack()
	{
		return this.stack.pop();
	}
   
	public Stack<Intent> getStack() {
		return stack;
	}
	
	

	
}
