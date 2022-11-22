package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Datatypeinhashmap {
	public static void main(String[] args) {
		Map<String,String> mapcontain=new HashMap<>();
		mapcontain.put("sruthi", "News");
		mapcontain.put("keerthi", "channel");
		mapcontain.put("chai", "TV");
		mapcontain.put("roshi", "Movie");
		System.out.println(mapcontain.get("roshi"));
		
		Map<String,Integer> mapscontain=new HashMap<>();
		mapscontain.put("sruthi", 90);
		mapscontain.put("keerthi", 45);
		mapscontain.put("chai", 66);
		mapscontain.put("roshi", 70);
		System.out.println(mapscontain.get(70));
		
		Map<Integer,Integer> mapcontains=new HashMap<>();
		mapcontains.put(2,2);
		mapcontains.put(1,1);
		mapcontains.put(3,1);
		mapcontains.put(5,1);
		System.out.println(mapcontains.get(2));
		
		Map<Float,Double> map1contain=new HashMap<>();
		map1contain.put(7.8f,7.9d);
		map1contain.put(9.2f, 8.6d);
		map1contain.put(4.21284782164498124846422f, 7.72194871204921093826487247213083);
		map1contain.put(3.454656f,3274934.1328824d);
		System.out.println(map1contain.get(7.8f));
		
	}

}
