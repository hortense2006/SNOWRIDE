import model.*;
import java.util.Map;
public class Main {
    public static void main(String[] args)
    {
       /* TEST DU PACKAGE MODEL
       // 1. Création du plan
        Plan plan = new Plan();

        // 2. Création des sommets
        Sommet s1 = new Sommet("Station", "S1", 1500);
        Sommet s2 = new Sommet("Intermédiaire", "S2", 2000);
        Sommet s3 = new Sommet("Sommet du domaine", "S3", 2500);

        // 3. Ajout des sommets dans le plan
        plan.getPlanAussois().put(s1.getId(), s1);
        plan.getPlanAussois().put(s2.getId(), s2);
        plan.getPlanAussois().put(s3.getId(), s3);

        // 4. Création des segments de pistes
        SegmentPiste piste1 = new SegmentPiste(
                "A1", s3, s2, 1200, true,
                "Rouge", "P1", "Ski"
        );

        SegmentPiste piste2 = new SegmentPiste(
                "A2", s2, s1, 1500, true,
                "Rouge", "P1", "Ski"
        );

        // 5. Création d'une remontée mécanique
        SegmentRemontee remontee = new SegmentRemontee(
                "A3", s1, s3, 1800, true,
                "Télésiège", "R1", 2400
        );

        // 6. Ajout des arcs dans le plan
        plan.getArcs().put(piste1.getIdArc(), piste1);
        plan.getArcs().put(piste2.getIdArc(), piste2);
        plan.getArcs().put(remontee.getIdArc(), remontee);

        // 7. Mise à jour des arcs sortants
        s3.ajouterArcSortant(piste1);
        s2.ajouterArcSortant(piste2);
        s1.ajouterArcSortant(remontee);

        // TEST 1 : Sommets
        System.out.println("=== TEST DES SOMMETS ===");

        for (Sommet s : plan.getPlanAussois().values()) {
            System.out.println(
                    s.getId() + " - " + s.getNom()
                            + " - Altitude : " + s.getAltitude() + " m"
            );
        }

        // TEST 2 : Arcs
        System.out.println("\n=== TEST DES ARCS ===");

        for (Arc arc : plan.getArcs().values()) {

            System.out.println(
                    arc.getIdArc() + " : "
                            + arc.getDepart().getNom() + " -> "
                            + arc.getArrivee().getNom()
                            + " (" + arc.getDistance() + " m)"
            );
        }

        // TEST 3 : Arcs sortants
        System.out.println("\n=== TEST DES ARCS SORTANTS ===");

        for (Sommet s : plan.getPlanAussois().values()) {

            System.out.println("Sommet : " + s.getNom());

            for (Arc arc : s.getArcsSortants()) {
                System.out.println(
                        "  -> " + arc.getArrivee().getNom()
                );
            }
        }

        // TEST 4 : Types des arcs
        System.out.println("\n=== TEST DES TYPES D'ARCS ===");

        for (Arc arc : plan.getArcs().values()) {

            if (arc instanceof SegmentPiste piste) {
                System.out.println(
                        "Piste " + piste.getIdPiste()
                                + " - Difficulté : " + piste.getDifficulte()
                                + " - Glisse : " + piste.getTypeGlisse()
                );
            }
            else if (arc instanceof SegmentRemontee r) {
                System.out.println(
                        "Remontée " + r.getIdRemontee()
                                + " - Type : " + r.getTypeRemontee()
                                + " - Capacité : " + r.getCapacite()
                );
            }
        }

        // TEST 5 : État des infrastructures
        System.out.println("\n=== TEST DES ÉTATS ===");

        System.out.println("Piste ouverte : " + piste1.isEtat());

        piste1.setEtat(false);

        System.out.println(
                "Après fermeture du segment : " + piste1.isEtat()
        );

        // TEST 6 : Recherche par identifiant
        System.out.println("\n=== TEST DES RECHERCHES ===");

        System.out.println(
                "Sommet S2 : " + plan.getSommet("S2").getNom()
        );

        System.out.println(
                "Arc A3 : " + plan.getArc("A3").getIdArc()
        );

        System.out.println("\n=== FIN DES TESTS ===");*/
    }
}