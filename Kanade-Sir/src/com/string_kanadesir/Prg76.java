package com.string_kanadesir;

//76. Accept Single Character from user then Display on to the
//		80. Count Total characters of String.
public class Prg76 {
	public static void main(String[] args) {
		
		String sc="vaibhav";
		int count=0;
		char[]ch=sc.toCharArray();
		for(int i=0;i<ch.length;i++) 
			if(ch[i]>0) 
				count++;
		System.out.println(count);
	}
}
