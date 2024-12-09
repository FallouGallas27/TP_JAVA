package Projet;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BudgetManager budgetManager = new BudgetManager();

        // Charger les données depuis un fichier (si existant)
        System.out.print("Entrez le nom du fichier de données : ");
        String fichier = scanner.nextLine();
        budgetManager.chargerDepuisFichier(fichier);

        boolean continuer = true;

        while (continuer) {
            // Menu de l'utilisateur
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ajouter un revenu");
            System.out.println("2. Ajouter une dépense");
            System.out.println("3. Afficher le solde actuel");
            System.out.println("4. Afficher les transactions par catégorie");
            System.out.println("5. Sauvegarder les données");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consomme la ligne de fin

            switch (option) {
                case 1:
                    // Ajouter un revenu
                    System.out.print("Description du revenu : ");
                    String descriptionRevenu = scanner.nextLine();
                    System.out.print("Montant du revenu : ");
                    double montantRevenu = scanner.nextDouble();
                    scanner.nextLine();  // Consomme la ligne de fin
                    System.out.print("Catégorie du revenu : ");
                    String categorieRevenu = scanner.nextLine();
                    Date dateRevenu = new Date();
                    Transaction revenu = new Transaction(descriptionRevenu, montantRevenu, categorieRevenu, true, dateRevenu);
                    budgetManager.ajouterTransaction(revenu);
                    break;

                case 2:
                    // Ajouter une dépense
                    System.out.print("Description de la dépense : ");
                    String descriptionDepense = scanner.nextLine();
                    System.out.print("Montant de la dépense : ");
                    double montantDepense = scanner.nextDouble();
                    scanner.nextLine();  // Consomme la ligne de fin
                    System.out.print("Catégorie de la dépense : ");
                    String categorieDepense = scanner.nextLine();
                    Date dateDepense = new Date();
                    Transaction depense = new Transaction(descriptionDepense, montantDepense, categorieDepense, false, dateDepense);
                    budgetManager.ajouterTransaction(depense);
                    break;

                case 3:
                    // Afficher le solde
                    System.out.println("Solde actuel : " + budgetManager.calculerSolde());
                    break;

                case 4:
                    // Afficher les transactions par catégorie
                    System.out.print("Entrez la catégorie : ");
                    String categorie = scanner.nextLine();
                    budgetManager.afficherTransactionsParCategorie(categorie);
                    break;

                case 5:
                    // Sauvegarder les données
                    System.out.print("Entrez le nom du fichier pour sauvegarder : ");
                    String nomFichier = scanner.nextLine();
                    budgetManager.sauvegarderDansFichier(nomFichier);
                    break;

                case 6:
                    // Quitter
                    continuer = false;
                    break;

                default:
                    System.out.println("Option invalide, essayez encore.");
                    break;
            }
        }

        scanner.close();
        System.out.println("Au revoir !");
    }
}