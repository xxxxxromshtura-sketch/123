import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Auto auto = new Auto("Mercedes", "crna", 5, "20", 5);
       Motor motor = new Motor("Aprilia", "Crveno-Bijela", "RXS 50", "200");

       ArrayList<Vozila> v = new ArrayList<>();

        v.add(motor);
        v.add(auto);


        for (Vozila vozila : v) {
            System.out.println(vozila.ispisiPodatke());
        }
    }
}
