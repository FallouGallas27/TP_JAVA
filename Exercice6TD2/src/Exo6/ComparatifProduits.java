package Exo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatifProduits {
    public static void main(String[] args) {
        // Création d'une liste de produits
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit("Téléphone", "Samsung Galaxy", 500.0));
        produits.add(new Produit("Ordinateur", "MacBook Pro", 1500.0));
        produits.add(new Produit("Téléphone", "iPhone", 1000.0));
        produits.add(new Produit("Télévision", "LG OLED", 1500.0));
        produits.add(new Produit("Ordinateur", "Dell Inspiron", 1000.0));

        // Affichage avant tri
        System.out.println("Produits avant tri :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }

        // Tri des produits
        Collections.sort(produits);

        // Affichage après tri
        System.out.println("\nProduits après tri :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }
}
