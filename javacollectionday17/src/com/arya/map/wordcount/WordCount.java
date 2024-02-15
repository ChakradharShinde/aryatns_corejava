package com.arya.map.wordcount;

import java.util.Arrays;
import java.util.NavigableMap;
import java.util.TreeMap;

public class WordCount {

	public static void main(String[] args) {
		String message = "hello Hello, how are you: Hello i am; fine i";
		String result = message.replaceAll("[,:;]", "");
		System.out.println(result);
		String[] words = result.split(" ");
		System.out.println(Arrays.toString(words));
		
		NavigableMap<String, Integer> wordCount = new TreeMap<>();
		
		for(String word:words)
			if(wordCount.putIfAbsent(word.toLowerCase(), 1)!=null)
				wordCount.compute(word.toLowerCase(), (key,value)->value+1);
		
		System.out.println(wordCount);
	}
}
