package com.ITVDN.AnonymousClassAndEnums.Notepad;

public class APINotepad {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.saveTaskToNotepad(08.04,"My firs task!");
        notepad.saveTaskToNotepad(08.04,"My second task!");
        notepad.saveTaskToNotepad(08.04,"My third task!");
        notepad.saveTaskToNotepad(09.04,"My third task!");
        notepad.saveTaskToNotepad(09.04,"My third task!");
        notepad.saveTaskToNotepad(10.04,"My third task!");

        notepad.findRecordsByDate(10.04);
    }
}
