package com.string_kanadesir;

import java.util.Arrays;

public class IndexOfChar {
	public static void main(String[] args) {
		String s="Savarde";
		char ch[]=s.toCharArray();
		char r[] =new char[ch.length];
		int count=0;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					r[count]=ch[i];
					count++;
				}
			}
		}
		char dou[]=new char[count];
		for(int i=0;i<dou.length;i++) {
			dou[i]=r[i];
		}
		System.out.println(Arrays.toString(dou));
	}

}
