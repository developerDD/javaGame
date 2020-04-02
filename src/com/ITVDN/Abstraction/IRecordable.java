package com.ITVDN.Abstraction;

public interface IRecordable {
    void record();
    void pause();
    void stop();
    default void del() {
        System.out.println("Dell");
    }
}
