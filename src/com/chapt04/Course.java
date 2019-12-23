package com.chapt04;

import java.util.ArrayList;

public class Course {
    private String name_cours;
    private int count_student_cours;
    Teacher teacher;
    ArrayList<Student> juornal;

    public Course(String name_cours, Teacher teacher) {
        this.name_cours = name_cours;
        this.teacher = teacher;
        juornal=new ArrayList<>();
    }

    public String getName_cours() {
        return name_cours;
    }

    public int getCount_student_cours() {
        return count_student_cours;
    }

    public void add_studens_cours(Student student){
        for (Student i :
                juornal) {
            if (i.getId() == student.getId()){
                System.out.println("Вы записаны уже на курс!");
                return;
            }
        }
        juornal.add(student);
        count_student_cours++;
    }
    public void show_students(){
        for (Student i:
             juornal) {
            System.out.println(i);
        }
    }
    @Override
    public String toString(){
        return "Название курса - "+name_cours+"\n"+"Преподаватель - "+teacher.getName()+"\n"+
                "Количество студентов на курсе - "+count_student_cours;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null)return false;
        if (this==obj)return true;
        if (this.getClass()==obj.getClass()){
            Course temp = (Course) obj;
            return name_cours.equals(temp.name_cours); //имет смысл сравнивать только по названию курса
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 31*(name_cours.hashCode()+count_student_cours+teacher.hashCode()+juornal.hashCode());
    }
}
