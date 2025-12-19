import java.util.HashSet;
import java.util.Set;

/**
 * Activiteit is een class die gebruikt wordt om activiteiten in het dierenpark voor te stellen
 * @author Ilias Ben-Fodda
 *
 */
public class Activiteit {
    private String naam;
    private Set<Persooneelslid> personeelsleden;
    private Set<Bezoeker> bezoekers;
    private String categorie;
    private String omschrijving;

    public Activiteit(String naam,String categorie, String omschrijving) {
        this.naam = naam;
        this.personeelsleden = new HashSet<>();
        this.bezoekers = new  HashSet<>();
        this.categorie = categorie;
        this.omschrijving = omschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public Set<Persooneelslid> getPersoneelsleden() {
        return personeelsleden;
    }

    public Set<Bezoeker> getBezoekers() {
        return bezoekers;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    /**
     * Een methode om een bezoeker in te schrijven aan een activiteit
     * @param bezoeker De bezoeker die je wil toevoegen
     */
    public void schrijfBezoekerIn(Bezoeker bezoeker) {
        this.bezoekers.add(bezoeker);
    }

    /**
     * Een methode om een persooneelslid toe te voegen aan een activiteit
     * @param persooneelslid Het persooneelslid die je wil toevoegen
     */
    public void voegPersoneelToe(Persooneelslid persooneelslid) {
        this.personeelsleden.add(persooneelslid);
    }
}
