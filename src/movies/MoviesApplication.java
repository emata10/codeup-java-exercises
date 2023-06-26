package movies;


public class MoviesApplication {

    private static Movie[] MoviesArray;

    public static void main(String[] args) {
        Input input = new Input();

        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Movie Application!");
            System.out.println("Select an option:");
            System.out.println("1. View all movies");
            System.out.println("2. View movies by category");
            System.out.println("3. Exit");

            int choice = input.getInt(1, 3);
            Movie[] movies = MoviesArray;

            switch (choice) {
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    String[] categories = {"animated", "drama", "horror", "scifi"};
                    System.out.println("Select a category:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.println(i + 1 + "." + categories[i]);
                    }
                    int categoryChoiceNum = input.getInt(1, categories.length);
                    String categoryChoiceStr = categories[categoryChoiceNum - 1];
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals(categoryChoiceStr)) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
            }
        }
    }

}



