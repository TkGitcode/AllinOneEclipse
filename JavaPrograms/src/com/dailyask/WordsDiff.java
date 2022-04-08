package com.dailyask;

import java.util.LinkedList;

public class WordsDiff {

	public static void main(String[] args) {
		LinkedList<Character> inp1 = new LinkedList<>();
		LinkedList<Character> inp2 = new LinkedList<>();
		String value1 = "Something";
		String value2 = "else";
		String result="";
		value1 = value1.toLowerCase();
		value2 = value2.toLowerCase();
		for (char c : value1.toCharArray()) {
			inp1.add(c);
		}
		for (char c : value2.toCharArray()) {
			inp2.add(c);
		}
		for (int i = 0; i < inp1.size(); i++) {
			for (int j = 0; j < inp2.size(); j++) {
				if (inp1.get(i) == inp2.get(j))
					inp1.remove(i);
			}
		}
		for(char c:inp1)
		{
			result+=c;
		}
		System.out.println(result);

	}

}
