package model;

public class SegmentPiste extends Arc {

    //ATTRIBUTS

    private String difficulte;
    private String idPiste;
    private String typeGlisse; // Skis, luge, snowboard, ski + snowboard...

    //CONSTRUCTEUR
    public SegmentPiste(String idArc, Sommet depart, Sommet arrivee, double distance,boolean etat, String difficulte, String idPiste, String typeGlisse) {
        super(idArc, depart, arrivee, distance,etat);
        this.difficulte = difficulte;
        this.idPiste = idPiste;
        this.typeGlisse = typeGlisse;
    }
    // GETTER n°1
    public String getDifficulte() {
        return difficulte;
    }
    // GETTER n°2
    public String getTypeGlisse() {
        return typeGlisse;
    }
    // GETTER n°3
    public String getIdPiste() {
        return idPiste;
    }
}
