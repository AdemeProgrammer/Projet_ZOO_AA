package Zoo.Personne;

import Zoo.animaux.Animal;

public class Client {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    private String nom;
    private int age;
    private double montantPaye;

    public Client(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.montantPaye = 0.0;
    }

    public Client() {

    }

    public void acheterBillet() {
        double prix = calculerTarif();
        this.montantPaye = prix;
        System.out.println(nom + " a payé " + prix + "€ pour son billet");
    }

    private double calculerTarif() {
        return (age < 16) ? 10.0 : 20.0;
    }

    public void interagirAvecAnimal(Animal animal) {
        System.out.println(nom + " dit : 'Oh ! Regarde le "
                + animal.getClass().getSimpleName()
                + " " + animal.getNomAnimal() + "' 🥰");
    }

    public void assisterSpectacle(String nomSpectacle) {
        System.out.println(nom + " applaudit pendant le spectacle '"
                + nomSpectacle + "' 👏");
    }

}