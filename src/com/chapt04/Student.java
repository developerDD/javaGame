package com.chapt04;

import java.util.ArrayList;

public class Student extends Human {
    private static int count_students;
    private int id;
    private ArrayList<Course> my_course;
    private int[] my_ratings;

        public Student(String name, int age){
        super(name,age);
        count_students++;
        id=count_students;
        my_course=new ArrayList<>();
        my_ratings= new int[20];
    }
    //количество студентов всего
    public static int getCount_students() {
        return count_students;
    }
    public int getId() {
        return id;
    }
    //записаться на курс
    public void go_to_cours(Course course){
        for (Course cours :
                my_course) {
            if (cours.equals(course)){
                System.out.println("Уже записан!");
                return;
            }
        }
            my_course.add(course);
        course.add_studens_cours(this);
    }
    //показать все курсы студента на которые он записан
    public void showMyCours(){
        for (Course i :
                my_course) {
            System.out.println("Название курса - "+i.getName_cours()+", препод - "+i.teacher.getName());
        }
    }
    //оценить студента по курсу
    public void setMy_ratings(Course course,Integer number){
        int index = -1;
            for (Course i :
                my_course) {
            if (i.getName_cours()==course.getName_cours()){
                index=my_course.indexOf(course);
                break;
            }
        }
            if (index!=-1){
                my_ratings[index]=number;
            }else {
                System.out.println("Студент не записан на курс");
            }
    }
    // вывод оценок по курсам
    public void showMyRaitings(){
      int index = 0;
       for (Course c :
                my_course) {
            System.out.println(c.getName_cours()+" оценка по курсу - "+my_ratings[index]);
            index++;
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
