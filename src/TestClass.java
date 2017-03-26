import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jacob on 26-03-2017.
 */
public class TestClass {

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i, "" + randomNumber(1, 10));
        }

        System.out.println("Not sorted:");
        ArrayListNotes.showStringArrayList(numbers);

        ArrayListNotes.sortStringArrayList(numbers);

        System.out.println("Sorted:");
        ArrayListNotes.showStringArrayList(numbers);
    }

    /**
     * Generate a random number
     * @param min the lowest number possible
     * @param max the highest number possible
     * @return the generated number
     */
    private static int randomNumber(int min, int max) {
        Random random = new Random();

        return random.nextInt(max - min + 1);
    }
}
