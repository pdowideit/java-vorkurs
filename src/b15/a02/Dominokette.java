package b15.a02;

import java.util.ArrayList;
import java.util.List;

import b12.a06.Dominostein;
import b12.a06.NoDominoNumberException;

public class Dominokette {
	private List<Dominostein> kette = new ArrayList<Dominostein>();
	
	public static void main(String[] args) {
		try {
			Dominokette dk = new Dominokette(new Dominostein(0, 0));
			dk.fuegeRechtsAn(new Dominostein(0, 1));
			System.out.println(dk.toString());
		} catch (NoDominoNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Dominokette(Dominostein d) {
		kette.add(d);
	}
	
	@Override
	public String toString(){
		String ret = "";
		for(Dominostein d : kette) {
			ret += d.toString();
		}
		return ret.replaceAll(" ", "");
	}
	
	public void fuegeRechtsAn(Dominostein d) {
		Dominostein last = kette.get(kette.size()-1);
		
		if(last.getRechts() == d.getLinks()) {
			kette.add(d);
		}
		else if(last.getRechts() == d.getRechts()){
			d.dreheUm();
			kette.add(d);
		}
		else {
			throw new NumberFormatException();
		}
	}
	
}
