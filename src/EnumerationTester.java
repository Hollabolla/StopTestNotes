import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Jacob on 06-04-2017.
 */
public class EnumerationTester {

    /**
     * Basic example of adding elements.
     * @param args
     */
    public static void main(String[] args) {
        Enumeration days;

        Vector dayNames = new Vector();
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        dayNames.add("Sunday");

        days = dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
