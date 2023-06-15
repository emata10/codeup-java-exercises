import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("User: " );
            String  input = sc.nextLine().trim();

            if (input.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Bob Whoa, chill out!");
            } else if (input.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever");
            }
        }

    }
}
