package movies;
import movies.MoviesArray;
import util.Input;


public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie[] allMovies = MoviesArray.findAll();
        boolean appRunning = true;
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies by category");

            int userChoice = input.getInt(0, 2, "Enter your choice: ");
            System.out.println();
            switch (userChoice) {
                case 0:
                    System.out.println("Bye!");
                    appRunning = false;
                    break;
                case 1:
                    for (Movie movie : allMovies) {
                        System.out.println(movie);
                    }
                    break;
                case 2:
                    String category = input.getString();
                    for (Movie movie : allMovies) {
                        if (movie.getCategory().equalsIgnoreCase(category)) {
                            System.out.println(movie);
                        }
                    }
                    break;
            }

            System.out.println();
        } while (appRunning);
    }
}

