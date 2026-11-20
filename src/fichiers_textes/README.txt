SNOWRIDE - AUSSOIS : DECOUPAGE ARBITRAIRE POUR TESTS

Base : jeu precedent inspire du plan officiel, avec connexions NON certifiees.
Chaque arc de PISTE du jeu precedent est divise en deux segments via un sommet fictif Mxxx.
Les REMONTEES restent en un seul arc. Les secteurs sont pedagogiques et non officiels.
AUCUNE jonction nouvelle entre pistes n a ete ajoutee : les points Mxxx sont des subdivisions, PAS des intersections reelles.
AUCUNE longueur de segment de piste n est connue : champs distance_m vides.
Pour Dijkstra : attribuer des poids de TEST explicitement fictifs ou utiliser BFS, puis remplacer par des longueurs mesurees.
Etat true est une valeur de test, pas un bulletin d ouverture en temps reel.

Format sommets : id;nom;altitude_m;statut
Format arcs : id;infrastructure;type;depart;arrivee;distance_m;etat;difficulte;statut
Format secteurs : nomSecteur;couleur;sommets;arcsAssocies

IMPORTANT JAVA : FichiersSecteurs sait lire secteurs.txt (4 champs) ; il faut un chargeur specifique pour sommets/arcs.
Arc.isEtat() et setEtat() gerent les fermetures par segment. Grouper les segments par infrastructure pour fermer une piste entiere.
Le graphe initial est une INTERPRETATION du plan, pas une topologie certifiee.
