package day53_Build_in_FunctionalInterface_Stream;

public class LambdaExpression {
    public static void main(String[] args) {

        myThirdFunctionalInterface<String> stringReverse;
        stringReverse = (s) -> {
            String reverse = new StringBuilder(s).reverse().toString();
            return reverse;
        };

        String result = stringReverse.method("Silver Spoon");

        System.out.println(result);

        //create a function that can return the cube of an integer;

    }
}
