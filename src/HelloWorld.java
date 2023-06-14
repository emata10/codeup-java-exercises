public class HelloWorld {
    public static void main(String[] args) {

        int myFavoriteNumber;
        myFavoriteNumber = 26;
        System.out.println(myFavoriteNumber);

        String myString = "Hello, World";
        System.out.println("Hello, World!");

        myString = "A";
        System.out.println(myString);


        myString = "3.14159";
        System.out.println("3.14159");


        int x = 5;
        System.out.println(x++);
        System.out.println(x);


        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

//When the above code is run, an error of type ClassCastException will occur. This is because we are trying to cast an object of type String to an incompatible type int, and Java doesn't allow this type of conversion.


       // int three = (int) "three";
 // In the code block above, an error of type TypeMismatchException will occur. This is because we are trying to cast a String value to an incompatible type int directly, without having it as an Object first.

       // Rewrite the following expressions using the relevant shorthand assignment operators:
//
//        int X = 4;
//        X = X + 5;
//
//        X += 5;
//
//        int X = 4;
//        int y =
//
//        int y = 4;
//        y = y * x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;//


    }

}
