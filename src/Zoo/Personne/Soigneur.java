package Zoo.Personne;

public class Soigneur {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public boolean isDiagnostique() {
        return diagnostique;
    }

    public void setDiagnostique(boolean diagnostique) {
        this.diagnostique = diagnostique;
    }

    private String nom;
    private String prenom;
    private String specialite;
    private boolean diagnostique;

    public Soigneur(String nom, String prenom, String specialite, boolean diagnostique) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.diagnostique = diagnostique;

    }
}

