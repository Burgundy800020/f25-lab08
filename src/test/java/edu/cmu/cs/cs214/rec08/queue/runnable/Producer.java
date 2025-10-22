package edu.cmu.cs.cs214.rec08.queue.runnable;

import edu.cmu.cs.cs214.rec08.queue.SimpleQueue;

//Routine that enqueues from 0 to n-1
// (Creates resource)
public class Producer implements Runnable {

	private SimpleQueue<Integer> q;
	private int n;

	public Producer(SimpleQueue<Integer> q, int n) {
		this.q = q;
		this.n = n;
	}

	@Override
	public void run() {
		for(int i = 0; i < n; i++) {
			q.enqueue(i);
		}
	}
}