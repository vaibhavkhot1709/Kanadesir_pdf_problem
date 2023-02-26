package com.string_kanadesir;

import java.util.Arrays;

//81. Display Reverse String.
public class ReverseString{
	public static void main(String[] args) {
		
		String sc="vaibhav";
		int count=0;
		char[]ch=sc.toCharArray();
		StringBuffer sb=new StringBuffer(sc);
		sb.reverse();
		System.out.println(sb);
		
	}
}
