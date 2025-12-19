import java.time.LocalDate;

/**
 * Persoon is een class die gebruikt wordt om personen in het dierenpark voor te stellen
 * Een superclass voor verschillende soorten personen in het park
 * @author Ilias Ben-Fodda
 *
 */
public abstract class Persoon {
    private String naam;
    private LocalDate geboorteDatum;
    private String adres;

    public Persoon(String naam, LocalDate geboorteDatum, String adres) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public String getAdres() {
        return adres;
    }


}
