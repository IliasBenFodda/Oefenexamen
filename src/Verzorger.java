import java.time.LocalDate;

/**
 * Verzorger is een class die gebruikt wordt om een specifieke soort persooneelslid voor te stellen
 * @author Ilias Ben-Fodda
 *
 */
public class Verzorger extends Persooneelslid {

    public Verzorger(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }
}
