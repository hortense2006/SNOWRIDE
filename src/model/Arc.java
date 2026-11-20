package model;

import java.io.IOException;
import java.util.HashMap;

/*Le fichier Arc représente les liaisons, une succession d'arcs peut représenter une piste, ou une remontée*/
public abstract class Arc {

    //ATTRIBUTS
    private String idArc;
    private final Sommet depart;
    private final Sommet arrivee;
    private double distance;
    private boolean etat; //ouvert ou fermé

    // CONSTRUCTEUR
    public Arc(String idArc, Sommet depart, Sommet arrivee, double distance,boolean etat) {
        this.idArc = idArc;
        this.depart = depart;
        this.arrivee = arrivee;
        this.distance = distance;
        this.etat = etat;
    }

    //GETTER n°1
    public String getIdArc() {
        return idArc;
    }
    //GETTER n°2
    public Sommet getDepart() {
        return depart;
    }
    // GETTER n°3
    public Sommet getArrivee() {
        return arrivee;
    }
    // GETTER n°4
    public double getDistance() {
        return distance;
    }
    // GETTER n°5
    public boolean isEtat() {
        return etat;
    }
    // GETTER n°6
    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    // METHODE n°1
    public static HashMap<String,Arc> chargerArcs(String nomFichier) throws IOException{
        return null;
    }
}
