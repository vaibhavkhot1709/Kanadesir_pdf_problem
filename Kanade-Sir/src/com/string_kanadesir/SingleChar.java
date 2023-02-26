package com.string_kanadesir;
//84. Find a Position of character ‘r’.
public class SingleChar {
	public static void main(String[] args) {
		String s="Savarde";
		char ch[]=s.toCharArray();
		char r = 'r';
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==r) {
				count= i;
				break;
			}
		}System.out.println("index of 'r' is "+count);
	}

}
