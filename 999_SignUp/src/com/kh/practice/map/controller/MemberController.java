package com.kh.practice.map.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		boolean returnValue = false;
		
		if(!map.keySet().contains(id)) {
			map.put(id, m);
			returnValue = true;
		} 
		
		return returnValue;
	}
	
	public String logIn(String id, String password) {
		String returnValue = null;
		
		if(map.keySet().contains(id)) {
			Member m = map.get(id);
			if(m.getPassword().equals(password)) {
				returnValue = m.getName();
			}
		} 
		
		return returnValue;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		boolean returnValue = false;
		
		if(map.keySet().contains(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			returnValue = true;
		} 

		return returnValue;
	}
	
	public void changeName(String id, String newName) {
		if(map.keySet().contains(id)) {
			map.get(id).setName(newName);
		} 
	}
	
	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> returnValue = new TreeMap<String, String>(new Comparator<String>() {
			 public int compare(String o1, String o2) {
				 return o1.compareTo(o2);
			 }
		});
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			if(map.get(key).getName().equals(name)) {		
				returnValue.put(key, name);
			}
		}
		
		return returnValue;
	}
}
