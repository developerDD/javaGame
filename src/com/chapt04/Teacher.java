package com.chapt04;

import java.util.ArrayList;

public class Teacher extends Human {

    private static int COUNT_TEACHER;

    private static Archiv ARCHIV;

    static {
        ARCHIV = new Archiv();
    }

    private ArrayList<Course> list_cours;

    public Teacher(String name, int age) {
        super(name, age);
        COUNT_TEACHER++;
        list_cours = new ArrayList<>();
    }

    public static int getCountTeacher() {
        return COUNT_TEACHER;
    }

    //не переопределял toString,hashCode,equals так как не добавлял поля в учителя
    public void start_cours(String name_course) {
        list_cours.add(new Course(name_course, this));
    }

    //оцентить всех студентов кураса сразу
    public void setRaitingStudents() {

        for (Course cours :
                list_cours) {
            cours.setRaitingAll(5);
        }
    }

    //поиск нужного курса
    public Course findCours(String name_cours) {
        for (Course cours :
                list_cours) {
            if (cours.getName_cours() == name_cours) {
                return cours;
            }
        }
        System.out.println("No cours!");
        return null;
    }

    //оценить одного студента
    public void steRaitingStudetOfCours(String name_cours, String name_student, int raiting) {
        Course course = findCours(name_cours);
        course.setRaitingStud(name_student, raiting);
    }

    //записать курс в архив
    public void write_To_Archive(String name_cours) {
        for (Course c :
                list_cours) {
            if (name_cours == c.getName_cours()) {
                ARCHIV.setCourse(c);
                break;
            }
        }
    }

    //посмотреть архив
    public void showArchiv() {
        ARCHIV.showArchiv();
    }
}
