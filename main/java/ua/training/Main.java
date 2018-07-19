package ua.training;

import ua.training.View.View;
import ua.training.controller.Controller;
import ua.training.model.Model;
import ua.training.model.entity.Note;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.createNewNote();

    }
}
