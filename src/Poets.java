import java.time.LocalDate;

/**
 * Poets is een class die gebruikt wordt om een specifieke soort persooneelslid voor te stellen
 * @author Ilias Ben-Fodda
 *
 */
public class Poets extends Persooneelslid {
    public Poets(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }
}
