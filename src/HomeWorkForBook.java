import com.chapt04.*;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){

        Student s = new Student("Dima",28);
        Student sw = new Student("Dima1",28);
        Teacher teacher = new Teacher("Vas",34);
        Teacher teacher1 = new Teacher("Sim",34);
        Course mashin = teacher.start_cours("mashin");
       s.go_to_cours(mashin);
        s.showMyCours();


    }
}
