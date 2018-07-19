package ua.training.model.entity;

import java.util.ArrayList;

public class NotePad {
    private ArrayList<Note>notes=new ArrayList<Note>();

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNote(Note note){
        notes.add(note);
    }

    @Override
    public String toString() {
        return "NotePad{" +
                "notes=" + notes +
                '}';
    }
}
