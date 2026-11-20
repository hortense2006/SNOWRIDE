package model;

public class SegmentRemontee extends Arc {

    //ATTRIBUTS
    private String typeRemontee;
    private String idRemontee;
    private int capacite;
    //CONSTRUCTEUR
    public SegmentRemontee(String idArc, Sommet depart, Sommet arrivee, double distance,boolean etat, String  typeRemontee, String idRemontee, int capacite) {
        super(idArc, depart, arrivee, distance, etat);
        this.typeRemontee = typeRemontee;
        this.idRemontee = idRemontee;
        this.capacite = capacite;
    }
    // GETTER n°1
    public String getTypeRemontee() {
        return typeRemontee;
    }
    // GETTER n°2
    public String getIdRemontee() {
        return idRemontee;
    }
    // GETTER n°3
    public int getCapacite() {
        return capacite;
    }
}
