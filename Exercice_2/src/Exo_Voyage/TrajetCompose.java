package Exo_Voyage;
import java.util.*;
public class TrajetCompose extends Voyage  {
	  Vector<Voyage>   voyage ;
		

	public TrajetCompose(String intitule) {
		super(intitule);
		voyage = new Vector<>();
	}
	public void ajouteVoyage(Voyage v) {
		voyage.add(v);	}
	
	public double dureeCumulee() {
		double somme =0;
		for(Voyage v : voyage) {
			somme += v.dureeCumulee();
		}
		return somme;
	}
	public Vector<String> ListeLieu(){
		Vector<String> lieux = new Vector<>();
		for(Voyage v : voyage) {
			lieux.addAll(v.ListeLieu());
		}
		return lieux;
	}
}
