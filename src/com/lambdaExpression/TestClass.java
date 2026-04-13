package com.lambdaExpression;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestClass {
public static void main(String[] args) {
	
	Test t =(map)->{
		for(Entry <Integer,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
};
HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
map.put(11, 121);
map.put(22, 212);

t.takePair(map);
}
}