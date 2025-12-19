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
    private List<Leeftijdscategorie> leeftijdscategorien;
    private String naam;

    public Zone(int maximumCapaciteit, Set<Activiteit> activiteiten, List<Leeftijdscategorie> leeftijdscategorien, String naam) {
        this.maximumCapaciteit = maximumCapaciteit;
        this.activiteiten = activiteiten;
        this.leeftijdscategorien = leeftijdscategorien;
        this.naam = naam;
    }

    public int getMaximumCapaciteit() {
        return maximumCapaciteit;
    }

    public Set<Activiteit> getActiviteiten() {
        return activiteiten;
    }

    public List<Leeftijdscategorie> getLeeftijdscategorien() {
        return leeftijdscategorien;
    }

    /**
     * Een methode om een activiteit toe te voegen aan een zone
     * @param activiteit De activiteit die je wil toevoegen
     */
    public void voegActiviteitToe(Activiteit activiteit) {
        activiteiten.add(activiteit);
    }


}
