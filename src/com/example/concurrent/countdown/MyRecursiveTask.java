package com.example.concurrent.countdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Long>{

	long workLoad = 0;
	public MyRecursiveTask(long workLoad) {
		// TODO Auto-generated constructor stub
		this.workLoad = workLoad;
	}

	@Override
	protected Long compute() {
		// TODO Auto-generated method stub
		
		if(this.workLoad > 16) {
			System.out.println("Splitting work load : "+ this.workLoad);
			List<MyRecursiveTask> subtasks = new ArrayList<MyRecursiveTask>();
			
			subtasks.addAll(createSubtasks());
			
			long result = 0;
			for(RecursiveTask subtask : subtasks) {
				//subtask.fork();
				result += subtask.join();
			}
			
			return result;
			
		}else {
			System.out.println("Doing workload myself"+ this.workLoad);
			return workLoad*3;
		}
	}

	private Collection<? extends MyRecursiveTask> createSubtasks() {
		// TODO Auto-generated method stub
		
		List<MyRecursiveTask> subtasks = new ArrayList<MyRecursiveTask>();
		MyRecursiveTask myRecursiveAction1 = new MyRecursiveTask(workLoad/2);
		MyRecursiveTask myRecursiveAction2= new MyRecursiveTask(workLoad/2);
		
		subtasks.add(myRecursiveAction1);
		subtasks.add(myRecursiveAction2);
		
		return subtasks;
	}
}
