package Exo6;

public class Produit implements Comparable<Produit> {
    // Attributs privés
    private String nom;
    private String description;
    private double prix;

    // Constructeur
    public Produit(String nom, String description, double prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    // Méthodes accesseurs (getters)
    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    // Méthode compareTo pour définir l'ordre naturel
    @Override
    public int compareTo(Produit autre) {
        // Comparer d'abord les prix
        int resultat = Double.compare(this.prix, autre.prix);
        if (resultat != 0) {
            return resultat; // Si les prix sont différents, retourner leur comparaison
        }
        // Si les prix sont égaux, comparer les descriptions par ordre alphabétique
        return this.description.compareTo(autre.description);
    }

    // Méthode toString pour afficher les produits
    @Override
    public String toString() {
        return "Produit [Nom=" + nom + ", Description=" + description + ", Prix=" + prix + "]";
    }
}
