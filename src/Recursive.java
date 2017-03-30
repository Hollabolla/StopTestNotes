/**
 * Created by Jacob on 30-03-2017.
 */
public class Recursive {
    public static void main(String[] args) {
        countUp(0, 10);
    }

    /**
     * Recursive method that count down
     *
     * @param end   the end number
     * @param start the start number
     */
    static void countDown(int end, int start) {
        if (end == start)
            System.out.print(start);
        else {
            System.out.print(end + " ");
            countDown(end - 1, start);
        }
    }

    /**
     * Recursive method that count up.
     *
     * @param start the start number
     * @param end   the end number
     */
    static void countUp(int start, int end) {
        if (end == start)
            System.out.print(end);
        else {
            System.out.print(start + " ");
            countUp(start + 1, end);
        }
    }
}
