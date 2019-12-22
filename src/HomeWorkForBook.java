import com.chapt04.AirPlane;
import com.chapt04.Car;
import com.chapt04.Wheel;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args) {
//        AirPlane mig = new AirPlane("Миг","Реаткивный","Для истребителя","Белый",
//                "Крилья - 50","Потрулирование");
//        AirPlane mig2 = new AirPlane("Миг","Реаткивный","Для истребителя","ЫБелый",
//                "Крилья - 50","Потрулирование");

        Car audi = new Car("2.0 DT","Sport","Blakc","My AUDI","Sport Car","1547855");
        Car audi1 = new Car("2.0 DT","Sport","Blakc","My AUDI","Sport Car","1547855");
        System.out.println(audi);
        System.out.println(audi1);
        System.out.println(audi.equals(audi1));
//
//        Wheel w1=new Wheel();
//        Wheel w2=new Wheel();
//        System.out.println(w1+"-"+w1.hashCode());
//
//        System.out.println(w2+"-"+w2.hashCode());




    }
}
