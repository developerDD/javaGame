package com.chapt04;

import java.util.ArrayList;

public class Teacher extends Human {

    private static int COUNT_TEACHER;

    private ArrayList<Course> list_cours;

    public Teacher(String name, int age) {
        super(name, age);
        COUNT_TEACHER++;
        list_cours=new ArrayList<>();
    }

    public static int getCountTeacher() {
        return COUNT_TEACHER;
    }

    //не переопределял toString,hashCode,equals так как не добавлял поля в учителя
    public void start_cours(String name_course) {
       list_cours.add(new Course(name_course, this));
    }
    public void setRaitingStudents(){

        for (Course cours :
                list_cours) {
            cours.setRaiting(5);
        }
    }

    public Course findCours(String name_cours){
        for (Course cours :
                list_cours) {
            if (cours.getName_cours() == name_cours){
                return cours;
            }
        }
        System.out.println("No cours!");
        return null;
    }
}
