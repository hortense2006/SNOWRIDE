package model;
import exceptions.ExceptionPersonnalisable;

import java.io.*;
import java.util.*;
/* La classe FichiersSecteurs sert à charger et sauvegarder des données. Elle permet de passer d'un fichier texte à des objets Java.
* Elle contient des attributs, un constructeur, 2 getters, et les méthodes de chargements et sauvegarde des secteurs du domaine skiable*/
public class FichiersSecteurs
{
    // ATTRIBUTS
    public String nomFichier;
    private HashMap<String,Secteurs> secteurs;

    // CONSTRUCTEUR n°1
    public FichiersSecteurs(String nomFichier)
    {
        this.nomFichier = nomFichier;
        this.secteurs = new HashMap<>();
    }

    // GETTER n°1
    public HashMap<String, Secteurs> getSecteurs() {return secteurs;}

    // GETTER n°2
    public String getNomFichier(){return nomFichier;}
    //METHODE n°1

    public void chargerDepuisFichier() throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier)))
        {
            String ligne;
            while ((ligne = br.readLine()) != null)
            {
                ligne = ligne.trim();
                if (ligne.trim().isEmpty() || ligne.startsWith("#")) {
                    continue;
                }
                String[] parts = ligne.split(";");
                if (parts.length != 4) {
                    System.out.println("Ligne ignorée : format invalide");
                    continue;
                }
                String nomSecteur = parts[0].trim();
                String couleur = parts[1].trim();;
                String sommets = parts[2].trim();
                String arcs = parts[3].trim();

                Secteurs secteur = new Secteurs(nomSecteur,couleur,sommets,arcs);
                secteurs.put(nomSecteur,secteur); // couleur comme clé, secteur comme valeur
            }
        }
        catch (IOException e) {
            throw new ExceptionPersonnalisable("Erreur de lecture du fichier");
        }
        System.out.println("Secteurs chargés avec succès depuis " + nomFichier);
    }

    // METHODE n°3 : Sauvegarde dans le fichier texte
    public void sauvegarderSecteurs()
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichier, false)))
        {
            for(Secteurs s : secteurs.values()) {
                String ligne = s.getNom() + ";" +
                        s.getCouleur() + ";" +
                        s.getSommets() + ";" +
                        s.getArcAssocie();
                bw.write(ligne);
                bw.newLine();
            }
        }
        catch (IOException e)
        {
            throw new ExceptionPersonnalisable("Erreur d'écriture dans le fichier : " + e.getMessage());
        }
    }

}
