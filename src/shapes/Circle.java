package shapes;
import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * Math.PI * radius;
    }

    public String getCircumference() {
        return null;
    }
}

class CircleApp {
    private static int totalCircles = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean createAnotherCircle = true;

        while (createAnotherCircle) {
            System.out.print("Enter the radius of the circle");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Circumference: " + circle.getCircumference());
            System.out.println("Area " + circle.getArea());
            totalCircles++;
            createAnotherCircle = askForAnotherCircle(scanner);
        }
    }

    private static boolean askForAnotherCircle(Scanner scanner) {
        System.out.print("Do you want to create another circle? (yes/no): ");
        String input = scanner.next();
        return input.equalsIgnoreCase("yes");
    }
}
