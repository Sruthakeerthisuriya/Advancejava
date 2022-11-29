package com.spring.beans.si.third;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
	List<String> myList;
	Set<String> mySet;
	Map<String, String> myMap;
	
	public CollectionExample() {
		super();
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	public void printList() {
		System.out.println("List items");
		myList.forEach(item -> {System.out.println(item + " ");});
	}
	public void printSet() {
		System.out.println("Set items");
		mySet.forEach(item -> {System.out.println(item + " ");});
	}
	public void printMap() {
		System.out.println("Map items");
		myMap.forEach((k, v) -> {System.out.println("Key : " + k + " Value : " + v);});
	}
	
}
