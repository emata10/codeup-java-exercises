import java.util.Random;
public class ServerNameGenerator {
    private static String[] adjectives = {
            "Amazing", "Brilliant", "Crazy", "Dazzling", "Energetic",
            "Fantastic", "Gorgeous", "Happy", "Incredible", "Jovial"
    };
    private static String[] nouns = {
            "Server", "Machine", "Device", "Node", "System",
            "Engine", "Unit", "Platform", "Gateway", "Host"
    };

    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String serverName = adjective + "-" + noun;
        System.out.println("Your server name is: " + serverName);
    }

    public static String getRandomElement(String[] array) {
        int randomNumber = (int) (Math.random() * array.length);
        return array[randomNumber];
    }
}

