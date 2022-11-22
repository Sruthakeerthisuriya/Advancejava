package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recyclebin {
	public static void main(String[] args) {
		//int[] number=new int[45];
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(13);
		System.out.println(list);
//		System.out.println(list.removeAll(list));
		//System.out.println(list);
		
		List<Integer> S1=new ArrayList<>();
		System.out.println(S1.removeAll(list));
		System.out.println(S1);
		S1.addAll(list);
		System.out.println(S1);
		
		//System.out.println(list);
/// hash map
		
		Map<String,Integer> diarymilk=new HashMap<>();
		diarymilk.put("choky",12);
		diarymilk.put("srutha",12);
		diarymilk.put("roshini",12);
		diarymilk.put("keerthi",12);
		System.out.println(diarymilk);
		
		//System.out.println(list.removeAll(list));
		
		System.out.println(diarymilk);

		



	}

}
