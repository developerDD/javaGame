import com.CodeWars.*;
import com.chapt05.Builder.Car;
import com.chapt05.Builder.CreateCars;
import com.chapt05.Builder.SedanCar;
import com.chapt05.Builder.SportCar;

import java.util.Stack;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){
        int[]ar={-5,6,-10};
        System.out.println(MinInArray.findSmallestInt(ar));
        String[] str = new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"};
        String[] st1r = new String[] {"bad", "bad", "bad", "bad"};
        String[] st2r = new String[] {"good", "bad", "bad", "bad", "bad", "bad", "bad", "good"};
        System.out.println(MinInArray.well(str));
        System.out.println(MinInArray.well(st1r));
        System.out.println(MinInArray.well(st2r));




    }
}
