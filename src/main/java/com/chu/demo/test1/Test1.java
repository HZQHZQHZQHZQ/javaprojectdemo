package com.chu.demo.test1;

public class Test1 {

	public static void main(String[] args) {
		
		String name = "闽江学院";
		String code = "MJXY110202";
		String codeHead = code.substring(0,name.length());
		
		Long l = Long.valueOf(code.substring(name.length())) + 1;

		if(l.toString().length() % 2 == 0){
			System.out.println(codeHead + l);
		} else {
			System.out.println(codeHead + "0" + l);
		}
		
	}
	
}
