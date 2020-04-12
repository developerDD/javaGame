package com.ITVDN.Exceptions;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.TreeSet;

public class Worker implements Comparable<Worker> {
    private String fullName;
    private String post;
    private int startedToJob;
    private static TreeSet<Worker> listWokers;

    static {
        listWokers = new TreeSet<>();
    }

    /**
     * @param FIO          full name
     * @param post         position held
     * @param startedToJob year of employment.
     */
    public Worker(String FIO, String post, int startedToJob) {
        this.fullName = FIO;
        this.post = post;
        this.startedToJob = startedToJob;
    }

    public static void addWorker(Worker worker) {
        listWokers.add(worker);
    }

    public static TreeSet<Worker> getListWokers() {
        return listWokers;
    }

    public static Worker inputWorker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = sc.next();
        System.out.print("Enter your post: ");
        String post = sc.next();
        try {
            System.out.print("Enter when you started working: ");
            int year = sc.nextInt();
            return new Worker(name, post, year);
        } catch (Exception e) {
            try {
                throw new Exception("No number");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    /**
     * @param startedToJob displaying the name of the employee whose work experience exceeds the entered value.
     */
    public static void workExperience(int startedToJob) {
        int currentYear = 2020;
        for (Worker w : listWokers) {
            if (currentYear - w.startedToJob >= startedToJob) {
                System.out.println(w.fullName);
            }
        }
    }

    @Override
    public String toString() {
        return "Full name: " + fullName + ";\n" +
                "Position held: " + post + ";\n" +
                "Year of employment: " + startedToJob + ".\n";
    }

    public int compareTo(@NotNull Worker o) {
        return this.fullName.compareTo(o.fullName);
    }

    //test main
    public static void main(String[] args) {
        Worker.addWorker(Worker.inputWorker());
        Worker.addWorker(Worker.inputWorker());
        Worker.addWorker(Worker.inputWorker());
        Worker.workExperience(3);
    }
}

