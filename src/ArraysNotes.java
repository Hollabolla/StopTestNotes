import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Jacob on 26-03-2017.
 */
public class ArraysNotes {

    /**
     * Show an array with Strings
     *
     * @param array the array
     */
    public static void showStringArray(String[] array) {
        for (String col : array) {
            System.out.print(col + ", ");
        }
        System.out.println();
    }

    /**
     * Show an array with ints
     *
     * @param array the array
     */
    public static void showIntArray(int[] array) {
        for (int col : array) {
            System.out.print(col + ", ");
        }
        System.out.println();
    }

    /**
     * Sort an array of ints
     *
     * @param array the array to be sorted
     */
    public static void sortIntArray(int[] array) {
        Arrays.sort(array);
    }

    /**
     * Sort an array of Strings
     *
     * @param array the array to be sorted
     */
    public static void sortStringArray(String[] array) {
        Arrays.sort(array);
    }
}
