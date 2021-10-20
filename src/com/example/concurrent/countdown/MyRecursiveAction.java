package com.example.concurrent.countdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction{

	long workLoad;
	public MyRecursiveAction(long workLoad) {
		// TODO Auto-generated constructor stub
		this.workLoad = workLoad;
	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		
		if(this.workLoad > 16) {
			System.out.println("Splitting work load : "+ this.workLoad);
			List<MyRecursiveAction> subtasks = new ArrayList<MyRecursiveAction>();
			
			subtasks.addAll(createSubtasks());
			
			for(RecursiveAction subtask : subtasks) {
				subtask.fork();
			}
			
			
		}else {
			System.out.println("Doing workload myself"+ this.workLoad);
		}
	}

	private Collection<? extends MyRecursiveAction> createSubtasks() {
		// TODO Auto-generated method stub
		
		List<MyRecursiveAction> subtasks = new ArrayList<MyRecursiveAction>();
		MyRecursiveAction myRecursiveAction1 = new MyRecursiveAction(workLoad/2);
		MyRecursiveAction myRecursiveAction2= new MyRecursiveAction(workLoad/2);
		
		subtasks.add(myRecursiveAction1);
		subtasks.add(myRecursiveAction2);
		
		return subtasks;
	}
}
