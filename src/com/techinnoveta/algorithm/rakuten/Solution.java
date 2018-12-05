package com.techinnoveta.algorithm.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

	private static final String REGEX = "\\s*(\\s|=>|,)\\s*";
	static int startTime = 9;
	static int endTime = 18;
	static int[] count = {0,0};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int line = Integer.parseInt(in.nextLine());
		Pattern p = Pattern.compile(REGEX);
		List<Player> list = new ArrayList<Player>();
		while (line > 0) {
			String input = in.nextLine();
			String[] times = p.split(input);
			Player player = new Player(line, Integer.parseInt(times[0]), Integer.parseInt(times[1]));	
			list.add(player);
			line --;
		}
		count = countTime(list, startTime, startTime + 1, count);
		System.out.println(count[0] + " " + count[1]);
		
		in.close();
	}
	
	public static int[] countTime(List<Player> list, int start, int end, int[] c){
		int playerCount = 0;
		if(start < endTime){
			for (Player player : list) {
				if(player.getStartTime() == start && player.getEndTime() >= start + 1){
					player.setStartTime(start + 1);
					playerCount ++;
				}
			}
			if(playerCount > 1 && playerCount <= 3){
				c[0]++;
			} else if(playerCount > 3) {
				c[1]++;
			}
			start ++;
			end ++;
			countTime(list, start, end, c);
		}
		return count;
	}
}

class Player {
	private int no;
	private int startTime;
	private int EndTime;

	public Player(int no, int startTime, int endTime) {
		super();
		this.no = no;
		this.startTime = startTime;
		EndTime = endTime;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return EndTime;
	}

	public void setEndTime(int endTime) {
		EndTime = endTime;
	}
}