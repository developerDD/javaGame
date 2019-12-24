package com.chapt04;

import java.util.ArrayList;

public class Archiv {

    private ArrayList<Course> course;

    Archiv() {
        course = new ArrayList<>();
    }

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(Course save) {
        course.add(save);
    }

    public void showArchiv() {
        for (Course c :
                course) {
            System.out.println(c);
            c.show_students();
        }
    }
}
