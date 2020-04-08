package com.ITVDN.AnonymousClassAndEnums.Notepad;

import java.util.ArrayList;

public class Notepad {

    private ArrayList <Page> notepad;
    //внутрений класс
    private class Page{
        private double dataDay;
        private ArrayList<String> tasks;

        public Page(double toDay ){
            this.dataDay=toDay;
            tasks=new ArrayList<>();
        }

        public double getDataDay() {
            return dataDay;
        }

        public void setTasks(String newTask){
            tasks.add(newTask);
        }

        public void showTask(){
            int countTask=1;
            for (String task : tasks) {
                System.out.println(countTask+") "+task);
                countTask++;
            }
        }
    }
    Notepad(){
        notepad = new ArrayList<>();
    }

    public void saveTaskToNotepad(double dataDay, String task){
        if (notepad.size()==0){
            notepad.add(new Page(dataDay));
            notepad.get(0).setTasks(task);
            return;
        }

        for (Page page : notepad) {
            if (dataDay==page.getDataDay()){
                page.setTasks(task);
                return;
            }
        }
        notepad.add(new Page(dataDay));
        notepad.get(notepad.size()-1).setTasks(task);
    }

    public void readNotepad(){
        if (notepad.size()==0){
            System.out.println("Notepad is empty!!!");
            return;
        }
        for (Page page : notepad) {
            System.out.println("toDay -> "+page.getDataDay());
            System.out.println("-----Tasks today-----");
            page.showTask();
        }
    }

    public void findRecordsByDate(double date){
        for (Page page : notepad) {
            if (date==page.getDataDay()){
                page.showTask();
                return;
            }
        }
        System.out.println("No tasks this date!");
    }
}
