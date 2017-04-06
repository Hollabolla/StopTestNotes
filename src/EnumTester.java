/**
 * Created by Jacob on 06-04-2017.
 */
public class EnumTester {

    /**
     * Example usage of using a enum.
     */
    enum Cars {
        fiat(200), skoda(10), audi(10000), tesla(100);

        int price;

        Cars(int price) {
            this.price = price;
        }
    }

    public static void main(String[] args) {
        System.out.println("All prices");
        for (Cars car : Cars.values()) {
            System.out.println(car + " - " + car.price);
        }
    }
}
