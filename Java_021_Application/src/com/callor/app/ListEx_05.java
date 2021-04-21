package com.callor.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx_05 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		List<Integer> linkArr = new LinkedList<Integer>();
		
		linkArr .add(0,100);
		linkArr .add(1,200);
		linkArr .add(2,300);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		view(arr);

	
	}
	
	public static ArrayList<Integer> view(ArrayList<Integer> intList) {
		return intList;
	}
}
