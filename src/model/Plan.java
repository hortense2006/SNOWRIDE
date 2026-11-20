package model;

import exceptions.ExceptionPersonnalisable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Plan {

    // ATTRIBUTS
    private Map<String, Sommet> planAussois; //plan du domaine skiable
    private HashMap<String, Arc> arcs; // Arcs (segments de piste ou de remontées)

    //CONSTRUCTEUR
    public Plan() {
        this.planAussois = new HashMap<>();
        this.arcs = new HashMap<>();
    }

    // GETTER n°1
    public Map<String, Sommet> getPlanAussois() {
        return planAussois;
    }
    // GETTER n°2
    public HashMap<String, Arc> getArcs() {
        return arcs;
    }
    // GETTER n°3
    public Arc getArc(String idArc) {
        return arcs.get(idArc);
    }

    // GETTER n°4
    public Sommet getSommet(String idSommet) {
        return planAussois.get(idSommet);
    }
    // METHODE n°1 : Pour ouvrir/fermer une piste entière/une remontée, il faut fermer tout les segments avec le même id
    public void modifierEtatInfrastructure(String id, boolean etat){}

    // METHODE n°2 : Permet de lire un plan et de le charger dans les elements necessaires
    public void chargerPlan(String nomFichier) throws IOException {
        if(nomFichier.equals("sommets")){
            this.planAussois = Sommet.chargerSommets("sommets.txt");
        }
        else if(nomFichier.equals("arcs")){
            this.arcs = Arc.chargerArcs("arcs.txt");
        }
    }
}
