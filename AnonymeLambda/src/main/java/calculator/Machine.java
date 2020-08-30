package calculator;

@FunctionalInterface
public interface Machine {

    // UNE SEULE METHODE POSSIBLE
    public void demarrer();

    public default void defaultMethode1() {
        System.out.println( "c'est une méthode par défaut" );
    }

    public default String defaultMethode2() {
        return "C'est une méthode par défaut 2";
    }

}
