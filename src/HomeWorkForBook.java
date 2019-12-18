import com.chapt04.AirPlane;

import java.io.IOException;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args) throws IOException {
        AirPlane mig = new AirPlane("Миг","Реаткивный","Для истребителя","Белый",
                "Крилья - 50","Потрулирование");

        System.out.println(mig);

        mig.setRoute("на базу!");
        System.out.println(mig.getRoute());


    }
}
