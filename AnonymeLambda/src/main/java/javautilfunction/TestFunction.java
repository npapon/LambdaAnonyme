package javautilfunction;

import java.util.function.Function;

public class TestFunction {

    public static void main( String[] args ) {

        Function<String, Integer> function = new Function<String, Integer>() {

            @Override
            public Integer apply( String string ) {

                Integer integer = 8;
                System.out.println( string + integer );
                return integer;
            }

        };

        System.out.println( function.apply( "Le chiffre est " ) );

        Function<String, Integer> functionModeLambda = ( String string ) -> {
            System.out.println( string );
            return 8;
        };

        System.out.println( functionModeLambda.apply( "Le chiffre est " ) );
    }

}
