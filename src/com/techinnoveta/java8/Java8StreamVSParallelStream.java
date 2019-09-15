package com.techinnoveta.java8;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

public class Java8StreamVSParallelStream {
	public static void main(String[] args) {
		String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" ,"11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

		System.out.println("-------\nRunning sequential\n-------");
		run(Arrays.stream(strings).sequential());
		System.out.println("-------\nRunning parallel\n-------");
		run(Arrays.stream(strings).parallel());
	}

	public static void run(Stream<String> stream) {

		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}
}