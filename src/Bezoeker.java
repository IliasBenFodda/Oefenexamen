import java.time.LocalDate;

public class Bezoeker extends Persoon{

    public Bezoeker(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }
    public Leeftijdscategorie getLeeftijdscategorie() {
        return Leeftijdscategorie.berekenLeeftijdscategorie(this.getGeboorteDatum());
    }
}
