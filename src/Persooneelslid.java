import java.time.LocalDate;

public abstract class Persooneelslid extends Persoon{

    public Persooneelslid(String naam, LocalDate geboorteDatum, String adres) {
        super(naam, geboorteDatum, adres);
    }

}
