package b09.a07;

import java.util.ArrayList;
import java.util.List;

public class GermanOrthography {
	public static void main(String[] args) {
		System.out.println(newGermanOrthography("Scheibenkleister scheint falsch."));
	}
	
	public static String newGermanOrthography(String s) {
		List<Integer> idxToRemove = new ArrayList<Integer>();
		
		int idx = s.indexOf("Sch");
		
		if(idx != -1) {
			idxToRemove.add(idx+1);
		}
		
		idx = s.indexOf("sch");
		while(idx != -1) {
			idxToRemove.add(idx+1);
			
			idx = s.indexOf("sch",idx+1);
		}
		
		String ret = "";
		int i = 0;
		for(char c : s.toCharArray()) {
			if(!idxToRemove.contains(i)) {
				ret += c;
			}
			i++;
		}
		
		return ret;
	}
}
