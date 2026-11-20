package model;

public class SegmentPiste extends Arc {

    //ATTRIBUTS

    private String difficulte;
    private String idPiste;
    private String typeGlisse; // Skis, luge, snowboard, ski + snowboard...

    //CONSTRUCTEUR
    public SegmentPiste(String idArc, Sommet depart, Sommet arrivee, double distance,boolean etat) {
        super(idArc, depart, arrivee, distance,etat);
    }
    // GETTER n°1
    public String getDifficulte() {
        return difficulte;
    }
    // GETTER n°2
    public void getTypeGlisse(String typeGlisse) {
        this.typeGlisse = typeGlisse;
    }
}
