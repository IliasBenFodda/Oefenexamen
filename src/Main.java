import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Set<Bezoeker> bezoekers = new HashSet<>();
    private static final Set<Persooneelslid> personeelsleden = new HashSet<>();
    private static final Set<Zone> zones = new HashSet<>();
    private static final Set<Activiteit> activiteiten = new HashSet<>();


    public static void main(String[] args) {
        boolean status = true;
        while (status) {
            getWelkomMenu();
            int keuze = scanner.nextInt();
            switch (keuze) {
                case 1 -> maakPersoneelslid();
                case 2 -> maakActiviteit();
                case 3 -> maakZone();
                case 4 -> registreerBezoeker();
                case 5 -> voegPersoneelToeAanActiviteit();
                case 6 -> voegBezoekerToeAanActiviteit();
                case 7 -> voegBezoekerToeAanZone();
                case 8 -> voegActiviteitToeAanZone();
                case 9 -> printInformatie();
                case 10 -> status = false;
            }
        }
    }

    private static void voegActiviteitToeAanZone() {
        System.out.println("Voeg activiteit toe aan zone:");
        System.out.println("Naam activiteit:");
        String naamActiviteit = scanner.next();
        System.out.println("Naam zone:");
        String naamZone = scanner.next();
        Activiteit activiteit = null;
        Zone zone = null;
        for (Activiteit activiteit1 : activiteiten) {
            if (activiteit1.getNaam().equals(naamActiviteit)) {
                activiteit = activiteit1;
            }
        }
        for (Zone zone1 : zones ) {
            if (zone1.getNaam().equals(naamZone)) {
                zone = zone1;
            }
        }
        if (activiteit == null){
            System.out.println("Activiteit bestaat niet");
            return;
        }
        if (zone == null) {
            System.out.println("Zone bestaat niet");
            return;
        }
        zone.voegActiviteitToe(activiteit);
    }

    private static void printInformatie() {
        System.out.println("Naam zone:");
        String naamZone = scanner.next();
        Zone zone = null;
        for (Zone zone1 : zones ) {
            if (zone1.getNaam().equals(naamZone)) {
                zone = zone1;
            }
        }
        if (zone == null) {
            System.out.println("Zone bestaat niet");
            return;
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(naamZone+"informatie.txt"))) {
            bw.write(zone.getNaam());
            bw.newLine();
            bw.newLine();
            bw.write("Bezoekers:");
            bw.newLine();
            for (Bezoeker bezoeker : zone.getBezoekers()) {
                bw.write(bezoeker.getNaam());
                bw.newLine();
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }


    private static void voegBezoekerToeAanZone() {
        System.out.println("Voeg bezoeker toe aan zone:");
        System.out.println("Naam bezoeker:");
        String naamBezoeker = scanner.next();
        System.out.println("Naam zone:");
        String naamZone = scanner.next();
        Bezoeker bezoeker = null;
        Zone zone = null;
        for (Bezoeker bezoeker1 : bezoekers) {
            if (bezoeker1.getNaam().equals(naamBezoeker)) {
                bezoeker = bezoeker1;
            }
        }
        for (Zone zone1 : zones ) {
            if (zone1.getNaam().equals(naamZone)) {
                zone = zone1;
            }
        }
        if (bezoeker == null){
            System.out.println("Bezoeker bestaat niet");
            return;
        }
        if (zone == null) {
            System.out.println("Zone bestaat niet");
            return;
        }
        zone.voegBezoekerToe(bezoeker);
    }

    private static void voegBezoekerToeAanActiviteit() {
        System.out.println("Voeg bezoeker toe aan activiteit:");
        System.out.println("Naam bezoeker:");
        String naamBezoeker = scanner.next();
        System.out.println("Naam activiteit:");
        String naamActiviteit = scanner.next();
        Bezoeker bezoeker = null;
        Activiteit activiteit = null;
        for (Bezoeker bezoeker1 : bezoekers) {
            if (bezoeker1.getNaam().equals(naamBezoeker)) {
                bezoeker = bezoeker1;
            }
        }
        for (Activiteit activiteit1 : activiteiten ) {
            if (activiteit1.getNaam().equals(naamActiviteit)) {
                activiteit = activiteit1;
            }
        }
        if (bezoeker == null){
            System.out.println("Bezoeker bestaat niet");
            return;
        }
        if (activiteit == null) {
            System.out.println("Activiteit bestaat niet");
            return;
        }
        activiteit.schrijfBezoekerIn(bezoeker);
    }

    private static void voegPersoneelToeAanActiviteit() {
        System.out.println("Voeg personeel toe aan activiteit:");
        System.out.println("Naam personeelslid:");
        String naamPersoneelslid = scanner.next();
        System.out.println("Naam activiteit:");
        String naamActiviteit = scanner.next();
        Persooneelslid personeelslid = null;
        Activiteit activiteit = null;
        for (Persooneelslid persooneelslid : personeelsleden) {
            if (persooneelslid.getNaam().equals(naamPersoneelslid)) {
                personeelslid = persooneelslid;
            }
        }
        for (Activiteit activiteit1 : activiteiten ) {
            if (activiteit1.getNaam().equals(naamActiviteit)) {
                activiteit = activiteit1;
            }
        }
        if (personeelslid == null){
            System.out.println("Personeelslid bestaat niet");
            return;
        }
        if (activiteit == null) {
            System.out.println("Activiteit bestaat niet");
            return;
        }
        activiteit.voegPersoneelToe(personeelslid);
    }

    private static void registreerBezoeker() {
        System.out.println("Maak bezoeker:");
        System.out.println("Naam:");
        String naam = scanner.nextLine();
        System.out.println("Adres:");
        String adres = scanner.nextLine();
        System.out.println("GeboorteDatum:");
        String geboorteDatumInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate geboorteDatum = LocalDate.parse(geboorteDatumInput, formatter);
        Bezoeker bezoeker = new Bezoeker(naam,geboorteDatum,adres);
        bezoekers.add(bezoeker);
    }

    private static void maakZone() {
        System.out.println("Maak zone:");
        System.out.println("Naam");
        String naam = scanner.next();
        System.out.println("Maximum Capaciteit:");
        int maximumCapaciteit = scanner.nextInt();
        System.out.println("Leeftijdscategorien (ONDER_TWAALF, KINDEREN, VOLWASENEN, BOVEN_65):");
        String leeftijdscategorien = scanner.next();
        Set<Leeftijdscategorie> leeftijdscategorienSet = new HashSet<>();
        String[] categorienInput = leeftijdscategorien.split(",");
        for (String categorien : categorienInput) {
            switch (categorien) {
                case "ONDER_TWAALF" -> leeftijdscategorienSet.add(Leeftijdscategorie.ONDER_TWAALF);
                case "KINDEREN" -> leeftijdscategorienSet.add(Leeftijdscategorie.KINDEREN);
                case "VOLWASENEN" -> leeftijdscategorienSet.add(Leeftijdscategorie.VOLWASENEN);
                case "BOVEN_65" -> leeftijdscategorienSet.add(Leeftijdscategorie.BOVEN_65);
            }
        }
        Zone zone = new Zone(maximumCapaciteit,leeftijdscategorienSet,naam);
        zones.add(zone);
    }

    private static void maakActiviteit() {
        System.out.println("Maak activiteit:");
        System.out.println("Naam:");
        String naam = scanner.nextLine();
        System.out.println("Categorie:");
        String categorie = scanner.nextLine();
        System.out.println("Beschrijving:");
        String bescrijving = scanner.nextLine();
        Activiteit activiteit = new Activiteit(naam, categorie, bescrijving);
        activiteiten.add(activiteit);
    }

    private static void maakPersoneelslid() {
        System.out.println("Maak personeelslid:");
        System.out.println("Naam:");
        String naam = scanner.nextLine();
        System.out.println("Adres:");
        String adres = scanner.nextLine();
        System.out.println("GeboorteDatum:");
        String geboorteDatumInput = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate geboorteDatum = LocalDate.parse(geboorteDatumInput, formatter);
        System.out.println("Type (gids/poets/verzorger):");
        String type = scanner.nextLine();
        Persooneelslid persooneelslid = switch (type) {
            case "gids" -> new Gids(naam, geboorteDatum, adres);
            case "poets" -> new Poets(naam, geboorteDatum, adres);
            case "verzorger" -> new Verzorger(naam, geboorteDatum, adres);
            default -> null;
        };
        if (persooneelslid != null) {
            personeelsleden.add(persooneelslid);
        } else {
            System.out.println("Type was onjuist");
        }
    }

    public static void getWelkomMenu() {
        System.out.println("Welkom bij mijn dierenpark");
        System.out.println("Maak een keuze");
        System.out.println("1: Maak personeelslid aan");
        System.out.println("2: Maak activiteit aan");
        System.out.println("3: Maak zone aan");
        System.out.println("4: Registreer bezoeker");
        System.out.println("5: Voeg personeel toe aan activiteit");
        System.out.println("6: Voeg bezoeker toe aan activiteit");
        System.out.println("7: Voeg bezoeker toe aan zone");
        System.out.println("8: Voeg activiteit toe aan zone");
        System.out.println("9: Print informatie");
        System.out.println("10: Sluit programma af");
    }

}