import model.*;

import java.io.IOException;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        /* TEST DU PACKAGE MODEL*/
        // 1. Création du plan
        Plan plan = new Plan();

        // 2. Chargement des sommets
        plan.chargerPlan("sommets");

        // 3. Chargement des arcs
        plan.chargerPlan("arcs");
        // TEST 1 : Sommets
        System.out.println("=== TEST DES SOMMETS ===");

        for (Sommet s : plan.getPlanAussois().values()) {
            System.out.println(
                    s.getId() + " - " + s.getNom() + " - Altitude : " + s.getAltitude() + " m"
            );
        }

        // TEST 2 : Arcs
        System.out.println("\n=== TEST DES ARCS ===");

        for (Arc arc : plan.getArcs().values()) {

            System.out.println(arc.getIdArc() + " : " + arc.getDepart().getNom() + " -> " + arc.getArrivee().getNom() + " (" + arc.getDistance() + " m)");
        }

        // TEST 3 : Arcs sortants
        System.out.println("\n=== TEST DES ARCS SORTANTS ===");

        for (Sommet s : plan.getPlanAussois().values()) {

            System.out.println("Sommet : " + s.getNom());

            for (Arc arc : s.getArcsSortants()) {
                System.out.println("  -> " + arc.getArrivee().getNom());
            }
        }

        // TEST 4 : Types des arcs
        System.out.println("\n=== TEST DES TYPES D'ARCS ===");

        for (Arc arc : plan.getArcs().values()) {

            if (arc instanceof SegmentPiste piste) {
                System.out.println("Piste " + piste.getIdPiste() + " - Difficulté : " + piste.getDifficulte() + " - Glisse : " + piste.getTypeGlisse());
            }
            else if (arc instanceof SegmentRemontee r) {
                System.out.println("Remontée " + r.getIdRemontee() + " - Type : " + r.getTypeRemontee() + " - Capacité : " + r.getCapacite());
            }
        }

        // TEST 5 : État des infrastructures
        System.out.println("\n=== TEST DES ÉTATS ===");

        System.out.println("Piste ouverte : " + plan.getArc("A1").isEtat());

        plan.getArc("A1").setEtat(false);

        System.out.println("Après fermeture du segment : " + plan.getArc("A1").isEtat());

        // TEST 6 : Recherche par identifiant
        System.out.println("\n=== TEST DES RECHERCHES ===");

        System.out.println("Sommet S2 : " + plan.getSommet("S2").getNom());

        System.out.println("Arc A3 : " + plan.getArc("A3").getIdArc());

        System.out.println("\n=== FIN DES TESTS ===");
    }
}