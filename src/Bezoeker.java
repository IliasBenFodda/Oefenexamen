import java.time.LocalDate;

/**
 * Bezoeker is een class die gebruikt wordt om bezoekers in het dierenpark voor te stellen
 * @author Ilias Ben-Fodda
 *
 */
public class Bezoeker extends Persoon{

    public Bezoeker(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }
    /**
     * Een methode om de leeftijdscategorie van een bezoeker op te vragen
     */
    public Leeftijdscategorie getLeeftijdscategorie() {
        return Leeftijdscategorie.berekenLeeftijdscategorie(this.getGeboorteDatum());
    }
}
