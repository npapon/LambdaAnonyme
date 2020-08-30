package calculator;

public class ConsoleDeJeu {

    public void demarrerConsole() {
        Machine consoleDeJeu = new Machine() {
            public void demarrer() {
                System.out.println( "Je démarre la console de jeu." );
            }

        };

        consoleDeJeu.demarrer();
    }

}
