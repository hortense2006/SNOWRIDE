package model;

public class SegmentRemontee extends Arc {

    //ATTRIBUTS
    private String typeRemontee;
    private String idRemontee;
    private int capacite;
    //CONSTRUCTEUR
    public SegmentRemontee(String idArc, Sommet depart, Sommet arrivee, double distance,boolean etat) {
        super(idArc, depart, arrivee, distance, etat);
    }
}
