package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounts {

	public static void main(String[] args) {
		String line = "I am a student. a I hello, a am parent the good  student,  smart";
//		String strs[] = line.trim().split("[\\s+|,|.|!|?|:|;|“|”|’|-|]");
		String strs[] = line.trim().split("[^a-zA-Z]+");
		
		List<String> top10 = getTop10Words(strs);
		
		System.out.println(top10);
	}

	private static List<String> getTop10Words(String[] words) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String word : words) {
			int count = 1;
			if(map.containsKey(word)) {
				count = map.get(word) + 1;
			}
			map.put(word, count);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				if(o2.getValue() != 0 && o1.getValue() != 0 && o2.getValue().compareTo(o1.getValue()) > 0) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		
		ArrayList<String> top10 = new ArrayList<String>();
		int i = 0;
		for(Map.Entry<String, Integer> wordEntry : list) {
			if(i++ == 10)
				break;
			
			top10.add(wordEntry.getKey());
		}
		
		return top10;
	}
	
}
