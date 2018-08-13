package com.chu.demo.test4;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		
		String path = "/home/deledir";
		String[] cmd = new String[] { "/bin/sh", "-c", "rm -rf "+path }; 
		try{
			Process process = Runtime.getRuntime().exec(cmd);
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
