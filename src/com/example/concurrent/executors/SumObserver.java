package com.example.concurrent.executors;

public class SumObserver implements ResultListner<Integer>{

	private String taskId;
	
	public SumObserver(String taskId) {
		// TODO Auto-generated constructor stub
		this.taskId = taskId;
	}
	@Override
	public void notifyResult(Integer result) {
		// TODO Auto-generated method stub
		System.out.println("Result for "+ taskId +" - "+ result);
		
	}

}
