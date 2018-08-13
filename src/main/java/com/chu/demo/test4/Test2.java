package com.chu.demo.test4;

public class Test2 {

	public static void main(String[] args) {
		
		String str1 = "@userName=[],@password=[],@sex=[]";
		String str2 = "@password=[123456],@sex=[M],@userName=[admin]";
		String str3 = "";
		
		String[] s1 = str1.split(",");
		String[] s2 = str2.split(",");
		
		for (String string1 : s1) {
			for (String string2 : s2) {
				if (string1.split("=")[0].equals(string2.split("=")[0])) {
					str3 = str3 + ",'" + string2.split("\\[")[1].split("]")[0] + "'";
				}
			}
		}
		
		System.err.println(str3.substring(1));
	}
	
}
