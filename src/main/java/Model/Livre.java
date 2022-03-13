package Model;

public class Livre {
    private int cmpt=0;
    private String nom;
    private double prix;
    private int qte;
    private int id=++cmpt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Livre(String n,double p ,int qte)
    {

        prix = p;
        nom=n;
        this.qte=qte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
