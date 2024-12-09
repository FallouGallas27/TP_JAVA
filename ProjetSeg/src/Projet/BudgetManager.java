package Projet;
import java.io.*; 
import java.util.*;

public class BudgetManager {
    private List<Transaction> transactions;

    public BudgetManager() {
        this.transactions = new ArrayList<>();
    }

    public void ajouterTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double calculerSolde() {
        double solde = 0.0;
        for (Transaction t : transactions) {
            if (t.estRevenu()) {
                solde += t.getMontant();
            } else {
                solde -= t.getMontant();
            }
        }
        return solde;
    }

    public void afficherTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }

    public void afficherTransactionsParCategorie(String categorie) {
        for (Transaction t : transactions) {
            if (t.getCategorie().equalsIgnoreCase(categorie)) {
                System.out.println(t);
            }
        }
    }

    public void sauvegarderDansFichier(String nomFichier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFichier))) {
            for (Transaction t : transactions) {
                writer.write(t.getDescription() + "," + t.getMontant() + "," + t.getCategorie() + "," + t.estRevenu() + "," + t.getDate().toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de l'enregistrement des données : " + e.getMessage());
        }
    }

    public void chargerDepuisFichier(String nomFichier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] details = ligne.split(",");
                String description = details[0];
                double montant = Double.parseDouble(details[1]);
                String categorie = details[2];
                boolean estRevenu = Boolean.parseBoolean(details[3]);
                Date date = new Date(details[4]);

                Transaction t = new Transaction(description, montant, categorie, estRevenu, date);
                transactions.add(t);
            }
        } catch (IOException e) {
            System.err.println("Erreur lors du chargement des données : " + e.getMessage());
        }
    }
}