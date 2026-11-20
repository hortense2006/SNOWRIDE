package model;
import java.util.ArrayList;
import java.util.List;

public class Sommet {
    private String nom;
    private String id;
    private ArrayList<Arc> arcsSortants;
    private double altitude;

    // CONSTRUCTEUR n°1
    public Sommet(String nom, String id,double altitude) {
        this.nom = nom;
        this.altitude = altitude;
        this.id = id;
        this.arcsSortants = new ArrayList<>();
    }

    // GETTER n°1
    public String getId() {
        return id;
    }

    // GETTER n°2
    public String getNom(){
        return nom;
    }

    // GETTER n°3
    public double getAltitude() {
        return altitude;
    }
    // GETTER n°4
    public List<Arc> getArcsSortants() {
        return this.arcsSortants;
    }

    // METHODE n°1
    public void ajouterArcSortant(Arc arc) {
        this.arcsSortants.add(arc);
    }
    // METHODE n°2
    public void retirerArcSortant(Arc arc) {
        this.arcsSortants.remove(arc);
    }

    public String toString() { //afficher détail
        return "Sommet: " + nom + "(altitude : " + altitude + ")";
    }
}