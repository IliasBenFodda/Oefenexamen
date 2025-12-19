import java.time.LocalDate;

/**
 * Persooneelslid is een class die gebruikt wordt om personeelsleden in het dierenpark voor te stellen
 * Een superclass voor verschillende personeelsleden
 * @author Ilias Ben-Fodda
 *
 */
public abstract class Persooneelslid extends Persoon{

    public Persooneelslid(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }

}
