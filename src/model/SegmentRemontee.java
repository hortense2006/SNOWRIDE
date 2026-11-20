package model;

public class SegmentRemontee extends Arc {

    //ATTRIBUTS
    private String typeRemontee;
    private int capacite;
    //CONSTRUCTEUR
    public SegmentRemontee(String idArc, Sommet depart, Sommet arrivee, double distance) {
        super(idArc, depart, arrivee, distance);
    }
}
