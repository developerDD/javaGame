import com.chapt04.*;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){

        Student s = new Student("Dima",28);
        Student sw = new Student("Dima1",28);
        Student sw2 = new Student("Dimaw",28);
        Teacher teacher = new Teacher("Vas",34);
           teacher.start_cours("Myyrrb");
           teacher.start_cours("GHHFHHHF");
        s.go_to_cours(teacher.findCours("Myyrrb"));
        s.go_to_cours(teacher.findCours("GHHFHHHF"));
        s.go_to_cours(teacher.findCours("Myyrrb"));
        sw2.go_to_cours(teacher.findCours("Myyrrb"));
        sw.go_to_cours(teacher.findCours("Myyrrb"));
        s.showMyCours();
        sw.showMyCours();
        sw2.showMyCours();




    }
}
