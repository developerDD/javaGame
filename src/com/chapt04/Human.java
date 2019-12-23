package com.chapt04;

public class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

     public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return 31*(name.hashCode()+age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)return false;
        if (this==obj)return true;
        if (getClass()==obj.getClass()){
            Human temp = (Human)obj;
            return name.equals(temp.name)&&age==temp.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Имя - "+name+"\nВозраст - "+age+"\n";
    }
}
