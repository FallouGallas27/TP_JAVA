package GestionContact;

import java.io.*;
import java.util.ArrayList;

public class CarnetContacts {
    private ArrayList<Contact> contacts;

    public CarnetContacts() {
        this.contacts = new ArrayList<>();
    }

    public void ajouterContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact ajouté : " + contact);
    }

    public void supprimerContact(String nom) {
        contacts.removeIf(c -> c.getNom().equalsIgnoreCase(nom));
        System.out.println("Contact supprimé : " + nom);
    }

    public void exporterCSV(String fichier) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fichier));
        for (Contact contact : contacts) {
            writer.write(contact.toString());
            writer.newLine();
        }
        writer.close();
    }
    
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void importerCSV(String fichier) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fichier));
            String ligne;
            int lineNumber = 0;  // Numéro de ligne pour le suivi

            while ((ligne = reader.readLine()) != null) {
                lineNumber++;
                String[] data = ligne.split(",");

                // Vérifiez le nombre de colonnes pour éviter les IndexOutOfBoundsException
                if (data.length != 4) {
                    System.err.println("Erreur à la ligne " + lineNumber + ": nombre de colonnes incorrect (" + data.length + " colonnes trouvées).");
                    continue; // Passez à la ligne suivante
                }

                try {
                    Contact contact = new Contact(data[0], data[1], data[2], data[3]);
                    ajouterContact(contact);
                    System.out.println("Contact importé : " + contact);
                } catch (Exception e) {
                    System.err.println("Erreur à la ligne " + lineNumber + ": " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            throw e;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Erreur lors de la fermeture du fichier : " + e.getMessage());
                }
            }
        }
        }
    }
    
