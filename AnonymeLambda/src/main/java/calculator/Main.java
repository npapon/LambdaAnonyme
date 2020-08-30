package calculator;

public class Main {

    public static void main( String[] args ) {

        // avec classe anonyme

        Dialogue insulteAnonyme = new Dialogue() {
            @Override
            public void dialoguer( String grosMot ) {
                String phraseAccroche = "Tu n'es qu'un sale ";
                String grosMotMajuscule = grosMot.toUpperCase();
                System.out.println( phraseAccroche + grosMotMajuscule );
            }

        };
        insulteAnonyme.dialoguer( "batard" );

        // avec lambda

        Dialogue insulteLambda = ( grosMot ) -> {
            String phraseAccroche = "Tu n'es qu'un sale ";
            String grosMotMajuscule = grosMot.toUpperCase();
            System.out.println( phraseAccroche + grosMotMajuscule );
        };

        insulteAnonyme.dialoguer( "cochon" );

    }
}
