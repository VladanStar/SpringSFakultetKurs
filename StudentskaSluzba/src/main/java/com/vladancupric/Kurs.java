package com.vladancupric;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Kurs {
	private String fakultet;
	private Map<String, String> idKursa;
	public Kurs() {
		super();
	}
	public Kurs(String fakultet, Map<String, String> idKursa) {
		super();
		this.fakultet = fakultet;
		this.idKursa = idKursa;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Kursevi na fakultetu: "+ fakultet + "\n");
		Iterator<Entry<String,String>> iter =idKursa.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String,String>entry = iter.next();
		sb.append("Kurs: " + entry.getValue());
		sb.append(" Sifra kursa " + entry.getKey());
		sb.append("\n");
		
		}
		return sb.toString();
	}
	
	

}
