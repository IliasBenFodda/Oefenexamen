import java.time.LocalDate;

/**
 * Gids is een class die gebruikt wordt om een specifieke soort persooneelslid voor te stellen
 * @author Ilias Ben-Fodda
 *
 */
public class Gids extends Persooneelslid{
    public Gids(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }
}
