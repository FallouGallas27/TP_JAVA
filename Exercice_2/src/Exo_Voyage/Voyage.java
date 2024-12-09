package Exo_Voyage;

import java.util.Vector;

abstract public class Voyage {
	String intitule;
	
	public Voyage(String intitule) {
		super();
		this.intitule = intitule;
	}
	abstract public double dureeCumulee();
	abstract public Vector<String> ListeLieu();
	@Override
	public String toString() {
		return "Voyage [intitule=" + intitule + "]";
	}
}
