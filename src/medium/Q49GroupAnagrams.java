package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> groupAnagrams = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();

		for (String current : strs) {
			char[] characters = current.toCharArray();
			Arrays.sort(characters);
			String sorted = new String(characters);
			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(current);
		}
		groupAnagrams.addAll(map.values());
		return groupAnagrams;
	}

}