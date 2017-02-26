package net.me.dev;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public List<String> names = null;
	public List<Country> countries = null;
	
	public static void main(String[] args) {
		Main m = new Main();
		
		m.names = new ArrayList<String>();
		m.names.add("Mexico");
		m.names.add("USA");
		m.names.add("Mexico");
		m.names.add("Canada");
		m.names.add("Mexico");
		m.names.add("France");
		m.names.add("USA");
		
		m.countries = m.sortNames(m.names);
		
		m.displayList(m.countries);
	}
	
	public List<Country> sortNames(List<String> l) {
		List<Country> countries = new ArrayList<Country>();
		List<String> names = new ArrayList<String>();
		
		for(int i=0; i<l.size();i++) {
			if(!names.contains(l.get(i))){
				names.add(l.get(i));
			}
		}
		
		for(String name : names) {
			countries.add(new Country(name));
		}
		
		for(int i=0; i<l.size(); i++){
			for(int j=0;j<countries.size(); j++){
				if(countries.get(j).name.equals(l.get(i))){
					countries.get(j).ocurrences++;
				}
			}
		}
		
		return countries;
	}
	
	public void displayList(List<Country> l) {
		for(Country i : l) {
			System.out.print(i.name+":"+i.ocurrences);
			System.out.println();
		}
	}
}
