import java.util.Random;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat decfor = new DecimalFormat("0.00");
        double literPrice = 1.10;
        double rangeMin = 12.56;
        double rangeMax = 30.43;
        double random = new Random().nextDouble();
        double pinigaiPinigineje = rangeMin + (random * (rangeMax - rangeMin));
        pinigaiPinigineje = Math.round(pinigaiPinigineje * 100.0) / 100.0;
        System.out.println("Have in my wallet " + pinigaiPinigineje + " euros.");

        if (pinigaiPinigineje < (literPrice * 20)) {
            System.out.println("Lack of money to buy 20 liters: " + decfor.format((literPrice * 20) - pinigaiPinigineje));
        } else if (pinigaiPinigineje > (literPrice * 20)) {
            System.out.println("Money left after buying 20 liters: " + decfor.format(pinigaiPinigineje - (literPrice * 20)));
        } else {
            System.out.println("You have exactly enough money to buy 20 liters.");
        }
    }
}