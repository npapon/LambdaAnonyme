package UnAutreExempleLambda;

public class Main {

    public static void main( String[] args ) {

        // VOID AVEC FONCTION ANONYME
        Combattant ken = new Combattant() {
            @Override
            public void provoquer() {
                System.out.println( "Ryu t'es nul" );
            }

        };

        ken.provoquer();

        // Ryu t'es nul

        // VOID AVEC LAMBDA

        Combattant ryu = () -> System.out.println( "Ken tu pues" );

        ryu.provoquer();

        // Ken tu pues

        // RETURN AVEC FONCTION ANONYME
        Stage japan = new Stage() {

            @Override
            public String nomDuStage() {
                System.out.println( "JAPPAN !!!!!" );
                return "japan";
            }
        };

        System.out.println( japan.nomDuStage() );

        /*
         * JAPPAN !!!!! japan
         */

        //// RETURN AVEC LAMBDA

        Stage usa = () -> {
            String nomDuStage = "usa";
            return nomDuStage;
        };

        System.out.println( usa.nomDuStage() );

        // usa

        // on n'est pas obligé de mettre return quand on a une seule ligne dans
        // la méthode et donc pas d'accolade

        Stage china = () -> "China";
        System.out.println( china.nomDuStage() );
        // China

        // RETURN AVEC ARGUMENTS FONCTION ANONYME

        Fight kenVSRyu = new Fight() {
            @Override
            public String versus( String combattant1, String combattant2 ) {

                return combattant1 + " VS " + combattant2;
            }

        };

        System.out.println( kenVSRyu.versus( "ken", "ryu" ) );

        // ken VS ryu

        // RETURN AVEC ARGUMENTS FONCTION ANONYME

        Fight chunliVblanka = ( combattant1, combattant2 ) -> {
            combattant1 = combattant1.toUpperCase();
            combattant2 = combattant2.toUpperCase();
            System.out.println( "le combat démarre" );
            return combattant1 + " VS " + combattant2;
        };

        System.out.println( chunliVblanka.versus( "chunli", "blanka" ) );

        /*
         * le combat démarre CHUNLI VS BLANKA
         */
    }
}
