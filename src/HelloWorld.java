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

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

      //  String class =  "some value";

       // String theNumberThree = "three";
       // Object o = theNumberThree;
        //int three = (int) o;

//When the above code is run, an error of type ClassCastException will occur. This is because we are trying to cast an object of type String to an incompatible type int, and Java doesn't allow this type of conversion.


       // int three = (int) "three";
 // In the code block above, an error of type TypeMismatchException will occur. This is because we are trying to cast a String value to an incompatible type int directly, without having it as an Object first.

       // Rewrite the following expressions using the relevant shorthand assignment operators:

        int x = 4;
        x += 5;


        int x = 3;
        int y = 4;
        y = y * x;

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;

        //If you assign a value to a numerical variable that is larger than the type can hold, the value will be truncated or rounded to fit within the range of the type. For example, assigning a value of 231 or larger to an int variable will result in an overflow, with the value rolling over to Integer.MIN_VALUE and continuing from there.
        //
        //If you increment a numeric variable past the type's capacity, the value will also roll over to the type's minimum value and continue from there. For example, incrementing the value of an int variable equal to Integer.MAX_VALUE by 1 will result in a value of Integer.MIN_VALUE.
        int maxValue = Integer.MAX_VALUE;
        System.out.println("The maximum value of an int is: " + maxValue);
        maxValue++; // rolling over to Integer.MIN_VALUE
        System.out.println("Incrementing past the maximum value results in: " + maxValue);

        int largeValue = 2147483650; // larger than the maximum value of an int
        System.out.println("Assigning a large value to an int results in: " + largeValue);



    }

}
