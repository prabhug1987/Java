package com.example.concurrent.executors;

public interface ResultListner<T> {
	void notifyResult(T result);
}
