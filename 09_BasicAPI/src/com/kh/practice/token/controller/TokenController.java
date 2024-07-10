package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {

	}

	public String afterToken(String input) {
		StringTokenizer st = new StringTokenizer(input, " ");

		String output = "";
		while (st.hasMoreTokens()) {
			output += st.nextToken();
		}

		return output;
	}

	public String firstCap(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1, input.length());
	}

	public int findChar(String input, char one) {
		int returnValue = 0;
		/*
		 * for(char c : input.toCharArray()) { 
		 * 		if(c == one) { 
		 * 			returnValue++; 
		 * 		} 
		 * }
		 */
		String copy = input;
		int index = 0;

		while (true) {
			index = copy.indexOf(one);
			if(!(index >= 0)) break;
			
			copy = copy.substring(index + 1);
			returnValue++;
		}

		return returnValue;
	}
}
