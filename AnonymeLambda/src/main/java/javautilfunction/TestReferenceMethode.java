package javautilfunction;

import java.util.function.Consumer;
import java.util.function.ToDoubleFunction;

public class TestReferenceMethode {

    public static void main( String[] args ) {

        // Double.parseDouble ne marche qu'avec des strign
        ToDoubleFunction<String> toDoubleFunction = new ToDoubleFunction<String>() {

            @Override
            public double applyAsDouble( String value ) {
                // TODO Auto-generated method stub
                return Double.parseDouble( value );
            }
        };

        ToDoubleFunction<String> toDoubleFunctionLamda = ( String value ) -> Double.parseDouble( value );

        ToDoubleFunction<String> toDoubleFunctionReferenceMethode = Double::parseDouble;

        System.out.println( toDoubleFunctionReferenceMethode.applyAsDouble( "2.0" ) );
        // 2.0

        Consumer<String> consumer = new Consumer<String>() {

            @Override
            public void accept( String string ) {
                System.out.println( string );

            }
        };

        Consumer<String> consumerLambda = ( String string ) -> System.out.println( string );
        Consumer<String> consumerReferenceMetohde = System.out::println;

        consumerReferenceMetohde.accept( "c'est incomprehensible" );
        // c'est incomprehensible
    }

}
