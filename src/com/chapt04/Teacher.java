package com.chapt04;

public class Teacher extends Human {

    private static int COUNT_TEACHER;

    public Teacher(String name, int age) {
        super(name, age);
        COUNT_TEACHER++;
    }

    public static int getCountTeacher() {
        return COUNT_TEACHER;
    }

    //не переопределял toString,hashCode,equals так как не добавлял поля в учителя
    public Course start_cours(String name_course) {
        Course course = new Course(name_course, this);
        return course;
    }
}
