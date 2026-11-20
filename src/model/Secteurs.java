package model;
/* La classe Secteurs définit un secteur.
 * Elle contient des attributs, un constructeur et 4 getters,*/
public class Secteurs
{
    // ATTRIBUTS
    private String nomSecteur; // Identifiant du secteur
    private String couleur; // Couleur attribuée par l'algorithme de Welsh-Powell
    private String sommets; // Sommets appartenant au secteur
    private String arcAssocie; // Arc associé au secteur

    // CONSTRUCTEUR
    public Secteurs(String nomSecteur, String couleur, String sommets, String arcAssocie)
    {
        this.nomSecteur = nomSecteur;
        this.couleur = couleur;
        this.sommets = sommets;
        this.arcAssocie = arcAssocie;
    }
    // GETTER n°1
    public String getNom()
    {
        return nomSecteur;
    }
    //GETTER n°2
    public String getCouleur()
    {
        return couleur;
    }
    // GETTER n°3
    public String getSommets()
    {
        return sommets;
    }
    // GETTER n°4
    public String getArcAssocie()
    {
        return arcAssocie;
    }
    // SETTER n°1
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
