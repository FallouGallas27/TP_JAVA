package Exo_Voyage;

import java.util.Collection;
import java.util.Vector;

public class TrajetSimple extends Voyage {
    String lieuDepart;
	String lieuArrivee;
	double duree;
	public TrajetSimple(String intitule, String lieuDepart ,String lieuArrivee,double duree) {
		super(intitule);
		this.duree=duree;
		this.lieuArrivee=lieuArrivee;
		this.lieuDepart = lieuDepart;
	}
	
	public double dureeCumulee() {
		return duree;
	}
	public Vector<String> ListeLieu() {
		Vector<String> lieu =new Vector<>();
	    lieu.add(lieuDepart);
	    lieu.add(lieuArrivee);
		return lieu;
	}

	public String getLieuDepart() {
		return lieuDepart;
	}

	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}

	public String getLieuArrivee() {
		return lieuArrivee;
	}

	public void setLieuArrivee(String lieuArrivee) {
		this.lieuArrivee = lieuArrivee;
	}

	@Override
	public String toString() {
		return "TrajetSimple [duree=" + duree + ", intitule=" + intitule + "]";
	}
}
