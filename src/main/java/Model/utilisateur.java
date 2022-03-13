package Model;

public class utilisateur {
    private String nom;
    private String prenom;
    private int id;
    private cart c;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public cart getC() {
        return c;
    }

    public void setC(cart c) {
        this.c = c;
    }

    public utilisateur(String n, String p)
    {
        this.nom =n;
        this.prenom=p;
    }
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
    public boolean auth_info(utilisateur u)
    {
        if(u.getNom().equals("mehdi") && u.getPrenom().equals("lharoui")) return true;

        return false;
    }
}
