package com.chapt04;

import java.util.ArrayList;

public class Student extends Human {
    private static int count_students;
    private int id;
    private ArrayList<Course> my_course;
    private ArrayList<Integer> my_ratings;

        public Student(String name, int age){
        super(name,age);
        count_students++;
        id=count_students;
        my_course=new ArrayList<>();
    }

    public static int getCount_students() {
        return count_students;
    }
    public int getId() {
        return id;
    }
    public void go_to_cours(Course course){
            my_course.add(course);
        course.add_studens_cours(this);
    }
    public void showMyCours(){
        for (Course i :
                my_course) {
            System.out.println("Название курса - "+i.getName_cours()+", препод - "+i.teacher.getName());
        }
    }
    @Override
    public int hashCode() {
        return 31*(getName().hashCode()+getAge()+ count_students);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)return false;
        if (this==obj)return true;
        if (getClass()==obj.getClass()){
            Student temp = (Student)obj;
            return id==temp.id&&getName().equals(temp.getName())&&getAge()==temp.getAge();
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID - "+ id +" Имя - "+getName()+", Возраст - "+getAge()+"\n";
    }
}
