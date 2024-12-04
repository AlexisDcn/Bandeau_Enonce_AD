import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scenario scenario = new Scenario(monBandeau);

        scenario.ajouterEffet(new Teletype(monBandeau, "Hello, World!", 200));
        scenario.ajouterEffet(new Clignotant(monBandeau, 5, 500));
        scenario.ajouterEffet(new Rotation(monBandeau, 2, 100));

        scenario.jouer();
        monBandeau.close();
    }
}
