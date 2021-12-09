package src;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String personId = "jaggu";
		Map<String,Map<String,Integer>> ssrMap = new HashMap<>();
		Map<String,Integer> input1 = new HashMap<>();
		input1.put("ServiceMan", 1);
		Map<String,Integer> input2 = new HashMap<>();
		input2.put("specially_challenged", 2);
		Map<String,Integer> input3 = new HashMap<>();
		input3.put("Senior citizen", 3);
		ssrMap.put(personId, input1);
		ssrMap.put(personId, input2);
		ssrMap.put(personId, input3);
		Map<String,Map<String,Integer>> tierMap = new HashMap<>();
		Map<String,Integer> input4 = new HashMap<>();
		input4.put("tier3", 4);
		Map<String,Integer> input5 = new HashMap<>();
		input5.put("tier2", 5);
		Map<String,Integer> input6 = new HashMap<>();
		input6.put("tier1", 6);
		tierMap.put(personId, input4);
		tierMap.put(personId, input5);
		tierMap.put(personId, input6);

		
		Map<String, Integer> ssrMaxMap = findLargestValueMap(ssrMap.get(personId));
		System.out.println("ssrMaxMap :: "+ ssrMaxMap);
		Map<String, Integer> tierMaxMap = findLargestValueMap(tierMap.get(personId));
		System.out.println("tierMaxMap :: "+ tierMaxMap);
		
		Map<String, Integer> collatedMap = new HashMap<>();
		collatedMap.putAll(ssrMaxMap);
		collatedMap.putAll(tierMaxMap);
		System.out.println("collatedMap Size :: "+ collatedMap.size());
		
		Map<String, Integer> collatedMaxMap = findLargestValueMap(collatedMap);
		System.out.println("collatedMaxMap :: "+ collatedMaxMap);

	}

	private static Map<String, Integer> findLargestValueMap( Map<String, Integer> map) {

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		
		Map<String, Integer> maxMap = new HashMap<>();
		maxMap.put(maxEntry.getKey(), maxEntry.getValue());
		
		return maxMap;
	}

}
