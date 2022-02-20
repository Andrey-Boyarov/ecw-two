package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) throws IOException {
	    long start1 = System.nanoTime();

	    ////NAIVE
//	    String str = "";
//		HashSet<String> strings = new HashSet<>();
//		BufferedReader reader = Utils.read();
//		while(str != null){
//	    	str = reader.readLine();
//	    	strings.add(str);
//		}
//			System.out.println(strings.size() - 1);

		////LITTLE BIT LESS NAIVE
		System.out.println(Utils.read().lines().distinct().count());

	    long end1 = System.nanoTime();
	    System.out.print("Time: ");
	    System.out.println(end1 - start1);
    }
}
