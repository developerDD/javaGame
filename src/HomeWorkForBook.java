import com.chapt05.Builder.Car;
import com.chapt05.Builder.CreateCars;
import com.chapt05.Builder.SedanCar;
import com.chapt05.Builder.SportCar;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){

        Car sport = CreateCars.buildCar(new SportCar());
        System.out.println(sport);
        Car sedan = CreateCars.buildCar((new SedanCar()));
        System.out.println(sedan);


    }
}
