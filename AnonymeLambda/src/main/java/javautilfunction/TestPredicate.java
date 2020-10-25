package javautilfunction;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main( String[] args ) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test( Integer integer ) {
                return integer == 2;
            }

        };
        System.out.println( predicate.test( 2 ) );

        Predicate<String> predicateEnModeLambda = ( String string ) -> string.equals( "oui" );

        System.out.println( predicateEnModeLambda.test( "oui" ) );

    }

}
