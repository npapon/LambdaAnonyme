package javautilfunction;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main( String[] args ) {

        Supplier<String> supplier = new Supplier<String>() {

            @Override
            public String get() {
                // TODO Auto-generated method stub
                return "hello";
            }
        };

        System.out.println( supplier.get() );

        Supplier<Integer> supplierEnModeLambda = () -> 2;

        System.out.println( supplierEnModeLambda.get() );
    }

}
