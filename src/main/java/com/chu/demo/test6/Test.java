package com.chu.demo.test6;

import java.lang.reflect.Method;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Test {

	private static final String[] method = {"test1", "test2"};
	
	public static void main(String[] args) {
		
		for (String m : method) {
			clsGetMethod("com.great.test6.User", m);
		}
	}
	
	public static void clsGetMethod(String clsName, String methodName) {
		try {
			Class cls = Class.forName(clsName);
			Object obj = cls.newInstance();
			Method method = cls.getMethod(methodName, String.class, Integer.class);
			method.invoke(obj, "测试", 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 