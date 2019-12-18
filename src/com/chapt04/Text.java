package com.chapt04;

public class Text {
    String text;
    Title title;

    public Text() {
        this.text = null;
        this.title = null;
    }

    public Text(String text) {
        this.text = text;
        this.title = null;
    }

    public Text(String title, String text) {
        this.text = text;
        this.title = new Title(title);
    }
    public void setText(String text){
        if (this.text==null){
            this.text=text;
        }else {
            addText(text);
        }
    }

    public void addText(String text) {
        this.text += text;
    }

    public void setTitle(String text) {
        if (this.title == null) {
            this.title = new Title(text);
        } else {
            this.title.setTitle(text);
        }
    }

    @Override
    public String toString() {
        if (title==null){
            return "Titale NAN"+"\n"+text;
        }
        return title.toString()+text;
    }
}
