package model;

public class SegmentPiste extends Arc {

    //ATTRIBUTS

    private String difficulte;
    private String typeGlisse; // Skis, luge, snowboard, ski + snowboard...

    //CONSTRUCTEUR
    public SegmentPiste(String idArc, Sommet depart, Sommet arrivee, double distance) {
        super(idArc, depart, arrivee, distance);
    }
}
