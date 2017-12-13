package com.moaddi;

import java.util.HashMap;
import java.util.Map;

public class colletionhashmap {
	
	public static void main(String args[]){
		
		Map m=new HashMap();
		m.put(0, "lokesh");
		m.put(1, "nari");
		m.put(2, "sesu");
		m.put(0, "vikram");
		
		System.out.println(m);
		
		Map m1=new HashMap();
		m1.put(0, "lokesh");
		m1.put(1, "nari");
		m1.put(2, "sesu");
		m1.put(0, "vikram");
		
		System.out.println(m1);
	}

}
