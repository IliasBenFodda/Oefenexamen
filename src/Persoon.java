import java.time.LocalDate;
import java.time.LocalDateTime;

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
