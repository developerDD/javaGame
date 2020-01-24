import com.chapt04.*;
import com.chapt05.AbstractFactory.BMWFactory;
import com.chapt05.AbstractFactory.CarsFactory;
import com.chapt05.factory.Base;
import com.chapt05.factory.ClassFacroty;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){

       // Base ob = ClassFacroty.getCalssFromFactory("first");
        //ob.perform();
        CarsFactory factory = new BMWFactory();
        factory.createCoupe();




    }
}
