package aftl;

import java.util.ArrayList;
import java.util.Collections;

public class Zahlen implements IZahlen{
	private ArrayList<Double> liste;
	public Zahlen(){
		
		liste = new ArrayList<Double>();
	}
		
	@Override
	public double getSumme() {
		// TODO Auto-generated method stub
		int value=0;
		for (int k = 0; k < liste.size(); k++){
          value += liste.get(k);
        }
		return value;
	}

	@Override
	public double getMinimum() {
		// TODO Auto-generated method stub
		 
		return Collections.min(liste);
	}

	@Override
	public double getMaximum() {
		// TODO Auto-generated method stub
		
		return Collections.max(liste);
	}

	@Override
	public void add(double value) {
		// TODO Auto-generated method stub
		liste.add(value);
	}

}
