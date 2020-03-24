package com.ITVDN.InheritanceAndPolymorphism;

import java.util.ArrayList;

public class ClassRoom {
    ArrayList<Pupil> classRoom;

    public ClassRoom() {
        this.classRoom = new ArrayList<>();
        classRoom.add(new BadPupil("Kolya","A1"));
        classRoom.add(new ExcelentPupil("Vasy","A1"));
        classRoom.add(new GoodPupil("Olya","A1"));
        classRoom.add(new BadPupil("Lena","A1"));
    }

    public ClassRoom(Pupil pupil){
        this.classRoom = new ArrayList<>();
        classRoom.add(pupil);
    }

    public ClassRoom(Pupil pupil,Pupil pupil1){
        this(pupil);
        classRoom.add(pupil1);
    }

    public ClassRoom(Pupil pupil,Pupil pupil1, Pupil pupil2){
        this(pupil,pupil1);
        classRoom.add(pupil2);
    }
    public ClassRoom(Pupil pupil,Pupil pupil1, Pupil pupil2,Pupil pupil3){
        this(pupil,pupil1,pupil2);
        classRoom.add(pupil3);
    }

    public ArrayList<Pupil> getClassRoom() {
        return classRoom;
    }
    
    public void showClassRoom(){
        if (classRoom==null){
            System.out.println("Class is empty!");
            return;
        }else {
            for (Pupil pupil : classRoom) {
                pupil.relax();
                pupil.write();
                pupil.study();
                pupil.read();
            }
        }
    }
}
