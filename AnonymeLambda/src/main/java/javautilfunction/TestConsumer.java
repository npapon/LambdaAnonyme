package javautilfunction;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main( String[] args ) {

        Consumer<String> consumer = new Consumer<String>() {

            @Override
            public void accept( String string ) {
                System.out.println( string );

            }
        };

        consumer.accept( "neveeer" );

        Consumer<Integer> consumerEnModeLambda = ( Integer integer ) -> System.out.println( integer );

        consumerEnModeLambda.accept( 10 );

        consumer.andThen( consumer ).accept( "lol" );

    }

}
