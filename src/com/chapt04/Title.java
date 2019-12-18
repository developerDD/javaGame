package com.chapt04;

public class Title {
    String title;

    public Title() {
        this.title = null;
    }

    public Title(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addTitle(String title) {
        this.title += title;
    }

    @Override
    public String toString() {
        return title + '\n';
    }
}
