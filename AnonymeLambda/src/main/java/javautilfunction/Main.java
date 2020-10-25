package javautilfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main( String[] args ) {

        List<Personne> listPersonnes = Arrays.asList( new Personne( 4, "Valentine" ), new Personne( 0, "Sasha" ),
                new Personne( 36, "Leslie" ) );
        // java.util.function.Function<T,R>  :
        // sa méthode fonctionnelle de la classe Function<T,R> est apply(T t) et
        // renvoi R
        // Elle permet donc de traiter un paramètre T
        // et de renvoyer un type R.

        // exemple (Personne personne et le paramètre de la méthode et return le
        // retour de la méthode

        Function<Personne, String> functionTestZero = new Function<Personne, String>() {

            @Override
            public String apply( Personne personne ) {
                // TODO Auto-generated method stub
                return personne.getNom();
            }

        };

        Function<Personne, String> functionTest = ( Personne personne ) ->

        {
            System.out.println( "un petit test pour démarrer" );
            return personne.getNom();
        };

        Personne nicolas = new Personne( 37, "Nicolas" );
        String nomNicolas = functionTestZero.apply( nicolas );
        System.out.println( nomNicolas );

        nomNicolas = functionTest.apply( nicolas );
        System.out.println( nomNicolas );

        /*
         * Console : Nicolas un petit test pour démarrer Nicolas
         */

        // On va utiliser Function pour parcourir les données String et Integer
        // de notre liste et les retourner dans des tableaux

        // on met pas return car 1 une ligne dans la redéfinition de la méthode
        // apply de l'interface (et pas d'accolade)

        Function<Personne, String> functionRetourneNomPersonne = ( Personne personne ) -> personne.getNom();
        Function<Personne, Integer> functionRetourneAgePersonneFois2 = ( Personne personne ) -> personne.getAge() * 2;

        List<String> listNomPersonnes = retourneListStringAPartirListPersonne( listPersonnes, functionRetourneNomPersonne );
        System.out.println( listNomPersonnes );
        // [Valentine, Sasha, Leslie]

        List<Integer> listAgePersonnesFois2 = retourneListIntegerAPartirListPersonne( listPersonnes,
                functionRetourneAgePersonneFois2 );
        System.out.println( listAgePersonnesFois2 );
        // [8, 0, 72]

        Function<Integer, Integer> functionRetourneIntegerFois10 = ( Integer unInteger ) -> unInteger * 10;
        Function<Integer, Integer> functionRetourneIntegerFois100 = ( Integer unInteger ) -> unInteger * 100;
        Integer unInteger = 3;

        System.out.println( functionRetourneIntegerFois10.andThen( functionRetourneIntegerFois100 ).apply( 3 ) );

        // 30

        Function<Personne, Integer> functionRetourneAgePersonne = ( Personne personne ) -> personne.getAge();

        List<Integer> listAgePersonneFois10 = retourneListIntegerAPartirListPersonne( listPersonnes,
                functionRetourneAgePersonne.andThen( functionRetourneIntegerFois10 ) );

        System.out.println( listAgePersonneFois10 );

    }

    // cette méthode prend en paramètre une liste de personnes et une
    // Function<Personne,String> et y applique à chacunne des personnes de la
    // liste sa méthode apply
    // qui retourne chaque fois appliquée pour chaque personne un String stockée
    // dans une liste de String. La méthode retourne cette liste de String
    public static List<String> retourneListStringAPartirListPersonne( List<Personne> listPersonnes,
            Function<Personne, String> function ) {
        List<String> listString = new ArrayList<String>();
        // on parcoure la liste passée en paramètre
        //
        for ( Personne personne : listPersonnes ) {
            String nomPersonne = function.apply( personne );
            listString.add( nomPersonne );
        }

        return listString;
    }

    // On fait pareil avec une liste d'integer
    public static List<Integer> retourneListIntegerAPartirListPersonne( List<Personne> listPersonnes,
            Function<Personne, Integer> function ) {
        List<Integer> listInteger = new ArrayList<Integer>();

        for ( Personne personne : listPersonnes ) {
            Integer agePersonne = function.apply( personne );
            listInteger.add( agePersonne );
        }

        return listInteger;
    }

}
