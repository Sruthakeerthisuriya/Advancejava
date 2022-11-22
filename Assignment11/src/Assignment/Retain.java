package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Retain {
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Student 1");
		list.add("Student 2");
		list.add("Student 3");
		list.add("Student 4");
		
		
		//System.out.println("Student is "+list );
		
		ArrayList<String> S1=new ArrayList<>();
		S1.add("Chaitanya");
		S1.add("Sruthi");
		S1.add("keerthi");
		S1.add("Roshini");
		
		System.out.println("S1 :"+S1);
		System.out.println("Retain :"+S1.retainAll(list));
		System.out.println(list);
		//System.out.println("S1 :"+S2.removeAll(list));
		
		
		ArrayList<String> S3=new ArrayList<>();
		S3.add("waste");
		S3.add("good");
		S3.add("Super");
		S3.add("Worst");
		//System.out.println(S3);
		//System.out.println("S1 :"+S3.removeAll(S1));
		
		System.out.println(S3.addAll(S1));
		S3.removeAll(S3);
		System.out.println(S3);
		
		
		//S3.retainAll(S3);
		System.out.println(S3.retainAll(S3));
		System.out.println(S3);
		
//		System.out.println(list);
//		list.addAll(S3);
//		System.out.println(list);
//		
		//System.out.println(S1);
		
		
	}

	
	}


