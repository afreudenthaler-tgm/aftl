package aftl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Zahlen implements IZahlen{
	private ArrayList<Double> liste;
	public Zahlen(){
		
		liste = new ArrayList<Double>();
	}
		
	@Override
	public double getSumme() throws NoSuchElementException{
		// TODO Auto-generated method stub
		double value=0;
		for (int k = 0; k < liste.size(); k++){
          value += liste.get(k);
        }
		if(liste.size() == 0){
			System.out.println("Keine Werte hinzugefügt - Keine Berechnung möglich ");
			throw new NoSuchElementException();
		}else{		
			return value;
		}
	}

	@Override
	public double getMinimum() throws NoSuchElementException{
		// TODO Auto-generated method stub
		
		if(liste.size() == 0){
			throw new NoSuchElementException();			
		}else{		
			return Collections.min(liste);
		}		
	}

	@Override
	public double getMaximum() throws NoSuchElementException{
		// TODO Auto-generated method stub
		
		if(liste.size() == 0){
			throw new NoSuchElementException();			
		}else{		
			return Collections.max(liste);
		}		
	}

	@Override
	public void add(double value) {
		// TODO Auto-generated method stub
		liste.add(value);
	}

}
