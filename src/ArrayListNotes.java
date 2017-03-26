import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jacob on 26-03-2017.
 */
public class ArrayListNotes {

    /**
     * Show every strings in an ArrayList
     * @param arrayList the ArrayList to be showed
     */
    public static void showStringArrayList(ArrayList<String> arrayList) {
        for (String col : arrayList) {
            System.out.print(col + ", ");
        }
        System.out.println();
    }

    /**
     * Show every ints in an ArrayList
     * @param arrayList the ArrayList to be showed
     */
    public static void showIntArrayList(ArrayList<Integer> arrayList) {
        for (int col : arrayList) {
            System.out.print(col + ", ");
        }
        System.out.println();
    }

    /**
     * Sort an ArrayList of String
     * @param arrayList the ArrayList to be sorted
     */
    public static void sortStringArrayList(ArrayList<String> arrayList) {
        Collections.sort(arrayList);
    }

    /**
     * Sort an ArrayList of ints
     * @param arrayList the ArrayList to be sorted
     */
    public static void sortIntArrayList(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }
}
