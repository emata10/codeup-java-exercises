import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] persons = {"Destiny", "Nialani", "Joanna"};
        System.out.println(persons.length);

        System.out.println(persons[0]);
        System.out.println(persons[1]);
        System.out.println(persons[2]);


        Person newPerson = new Person("Alex");
        String[] updatedPersons = addPerson(persons,
                newPerson);

        // Print the updated array of persons
        for (String person : updatedPersons) {
            System.out.println(person.length());
        }
    }

    private static String[] addPerson(String[] persons, Person newPerson) {
        String[] updatedPersons = new String[0];
        for (int i = 0; i < persons.length; i++) {
            updatedPersons = new String[0];
            updatedPersons[i] = persons[i];
        }
        updatedPersons[persons.length] = String.valueOf(newPerson);
        return updatedPersons;
    }
}





    


