package com.chapt04;

public class Student extends Human {
    private static int count_students;
    private int id;

        public Student(String name, int age){
        super(name,age);
        count_students++;
        id=count_students;
    }

    public static int getCount_students() {
        return count_students;
    }
    public int getId() {
        return id;
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
        return "Имя - "+getName()+"\n"+
                "Возраст - "+getAge()+"\n"+
                "ID - "+ id +"\n";
    }
}
