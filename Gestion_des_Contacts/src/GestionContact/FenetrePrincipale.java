package GestionContact;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FenetrePrincipale extends JFrame {
  
	private static final long serialVersionUID = 1L;
	private CarnetContacts carnet;
    private JTextArea affichageContacts;

    public FenetrePrincipale() {
        carnet = new CarnetContacts();
        setTitle("Gestion des Contacts");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        affichageContacts = new JTextArea();
        affichageContacts.setEditable(false);
        add(new JScrollPane(affichageContacts), BorderLayout.CENTER);

        JPanel panel = new JPanel();

        JButton ajouterBtn = new JButton("Ajouter Contact");
        ajouterBtn.addActionListener(e -> ajouterContact());
        panel.add(ajouterBtn);

        JButton importerBtn = new JButton("Importer CSV");
        importerBtn.addActionListener(e -> importerCSV());
        panel.add(importerBtn);

        JButton exporterBtn = new JButton("Exporter CSV");
        exporterBtn.addActionListener(e -> exporterCSV());
        panel.add(exporterBtn);

        JButton afficherBtn = new JButton("Afficher Contacts");
        afficherBtn.addActionListener(e -> afficherContacts());
        panel.add(afficherBtn);
        
        JButton supprimerBtn = new JButton("Supprimer Contact");
        supprimerBtn.addActionListener(e -> supprimerContact()); 
        panel.add(supprimerBtn);
        
        add(panel, BorderLayout.SOUTH);
        setVisible(true);
        
    }

    private void ajouterContact() {
        String nom = JOptionPane.showInputDialog("Nom :");
        String prenom = JOptionPane.showInputDialog("Prénom :");
        String telephone = JOptionPane.showInputDialog("Téléphone :");
        String email = JOptionPane.showInputDialog("Email :");
        Contact contact = new Contact(nom, prenom, telephone, email);
        carnet.ajouterContact(contact);
    }

    private void importerCSV() {
        System.out.println("Tentative d'importation de contacts...");
        try {
            carnet.importerCSV("contact.csv");
            JOptionPane.showMessageDialog(this, "Importation réussie");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erreur lors de l'import : " + e.getMessage());
            e.printStackTrace();
        }
    }


    private void exporterCSV() {
        try {
            carnet.exporterCSV("contact.csv");
            JOptionPane.showMessageDialog(this, "Exportation réussie");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erreur lors de l'export");
        }
    }

    private void afficherContacts() {
        StringBuilder sb = new StringBuilder();
        for (Contact contact : carnet.getContacts()) {
            sb.append(contact.toString()).append("\n");
        }
        affichageContacts.setText(sb.toString());
    }
    private void supprimerContact() { 
    	String nom = JOptionPane.showInputDialog("Nom du contact à supprimer :"); 
    	carnet.supprimerContact(nom); afficherContacts(); 
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FenetrePrincipale::new);
    }
}

