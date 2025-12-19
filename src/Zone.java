import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Zone is een class die gebruikt wordt om een Zone voor te stellen in het dierenpark
 * @author Ilias Ben-Fodda
 *
 */
public class Zone {
    private int maximumCapaciteit;
    private Set<Activiteit> activiteiten;
    private Set<Leeftijdscategorie> leeftijdscategorien;
    private Set<Bezoeker> bezoekers;
    private String naam;

    public Zone(int maximumCapaciteit, Set<Leeftijdscategorie> leeftijdscategorien, String naam) {
        this.maximumCapaciteit = maximumCapaciteit;
        this.activiteiten = new HashSet<>();
        this.leeftijdscategorien = leeftijdscategorien;
        this.naam = naam;
        this.bezoekers = new HashSet<>();
    }

    public int getMaximumCapaciteit() {
        return maximumCapaciteit;
    }

    public Set<Activiteit> getActiviteiten() {
        return activiteiten;
    }

    public Set<Leeftijdscategorie> getLeeftijdscategorien() {
        return leeftijdscategorien;
    }

    public String getNaam() {
        return naam;
    }

    public Set<Bezoeker> getBezoekers() {
        return bezoekers;
    }

    /**
     * Een methode om een activiteit toe te voegen aan een zone
     * @param activiteit De activiteit die je wil toevoegen
     */
    public void voegActiviteitToe(Activiteit activiteit) {
        activiteiten.add(activiteit);
    }

    /**
     * Een methode om een bezoeker toe te voegen aan een zone
     * @param bezoeker De bezoeker die je wil toevoegen
     */
    public void voegBezoekerToe(Bezoeker bezoeker) {
        if (bezoekers.size() < maximumCapaciteit) {
            bezoekers.add(bezoeker);
        }else  {
            System.out.println("Te veel bezoekers");
        }
    }
}
