package com.chapt04;

public class Teacher extends Human {

    private static int COUNT_TEACHER;
    public Teacher(String name,int age){
        super(name,age);
        COUNT_TEACHER++;
    }
    public static int getCountTeacher() {
        return COUNT_TEACHER;
    }
    //не переопределял, так как не добавлял поля в учителя
}
