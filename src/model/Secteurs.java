package model;

public class Secteurs
{
    // ATTRIBUTS
    private String nomSecteur;
    private String couleur;
    private String sommets;
    private String arcAssocie;
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
}
