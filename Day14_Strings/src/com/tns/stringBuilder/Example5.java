package com.tns.stringBuilder;

public class Example5 {
	public static void main(String args[]){
			StringBuilder sb = new StringBuilder();
			System.out.println(sb.capacity());
			sb.append("Hive");
			System.out.println(sb.capacity());
			sb.append("Java is my favourite language");
			System.out.println(sb.capacity());
		}

}
