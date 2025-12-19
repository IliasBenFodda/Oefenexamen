import java.util.Set;

public class Activiteit {
    private String naam;
    private Set<Persooneelslid> personeelsleden;
    private Set<Bezoeker> bezoekers;
    private String categorie;
    private String omschrijving;

    public Activiteit(String naam, Set<Persooneelslid> personeelsleden, Set<Bezoeker> bezoekers, String categorie, String omschrijving) {
        this.naam = naam;
        this.personeelsleden = personeelsleden;
        this.bezoekers = bezoekers;
        this.categorie = categorie;
        this.omschrijving = omschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public Set<Persooneelslid> getPersoneelsleden() {
        return personeelsleden;
    }

    public Set<Bezoeker> getBezoekers() {
        return bezoekers;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void schrijfBezoekerIn(Bezoeker bezoeker) {
        this.bezoekers.add(bezoeker);
    }

    public void voegPersoneelToe(Persooneelslid persooneelslid) {
        this.personeelsleden.add(persooneelslid);
    }
}
