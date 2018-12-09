package com.techinnoveta.thread;

public class ControllerMain {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();
	}
}
