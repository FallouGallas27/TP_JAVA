package Projet;

	import java.util.Date;

	public class Transaction {
	    public String description;
	    public double montant;
	    public String categorie; // Catégorie de la dépense (par exemple "loyer", "alimentaire")
	    public boolean estRevenu; // true si c'est un revenu, false si c'est une dépense
	    public Date date;

	    public Transaction(String description, double montant, String categorie, boolean estRevenu, Date date) {
	        this.description = description;
	        this.montant = montant;
	        this.categorie = categorie;
	        this.estRevenu = estRevenu;
	        this.date = date;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public double getMontant() {
	        return montant;
	    }

	    public String getCategorie() {
	        return categorie;
	    }

	    public boolean estRevenu() {
	        return estRevenu;
	    }

	    public Date getDate() {
	        return date;
	    }

	    @Override
	    public String toString() {
	        return (estRevenu ? "Revenu" : "Dépense") + ": " + description + ", Montant: " + montant + ", Catégorie: " + categorie + ", Date: " + date;
	    }
	
}
	
