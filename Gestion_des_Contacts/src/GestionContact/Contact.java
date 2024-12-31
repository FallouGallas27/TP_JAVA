package GestionContact;

public class Contact {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    public Contact(String nom, String prenom, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nom + "," + prenom + "," + telephone + "," + email;
    }
}