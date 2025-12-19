import java.time.LocalDate;
import java.time.Period;

/**
 * Leeftijdscategorie is een class die gebruikt wordt om de leeftijdscategorie voor te stellen
 * @author Ilias Ben-Fodda
 *
 */
public enum Leeftijdscategorie {
    ONDER_TWAALF,
    KINDEREN,
    VOLWASENEN,
    BOVEN_65;
    /**
     * Een methode om een leeftijdscategorie van de bezoeker te berekenen
     * @param geboorteDatum De geboortedatum van de bezoeker
     */
    public static Leeftijdscategorie berekenLeeftijdscategorie(LocalDate geboorteDatum) {
        int leeftijd = Period.between(geboorteDatum, LocalDate.now()).getYears();
        if (leeftijd < 12) {
            return ONDER_TWAALF;
        } else if (leeftijd < 18) {
            return KINDEREN;
        } else if (leeftijd <= 65) {
            return VOLWASENEN;
        } else {
            return BOVEN_65;
        }
    }
}
