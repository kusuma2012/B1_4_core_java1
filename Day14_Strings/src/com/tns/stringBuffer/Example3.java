package com.tns.stringBuffer;

public class Example3 {
	public static void main(String []args) {
			String s = "Today";
			StringBuffer sb = new StringBuffer(s.length());
			System.out.println(sb.capacity());
		}

}
