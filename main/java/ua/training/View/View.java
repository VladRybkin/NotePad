package ua.training.View;

import java.util.Locale;
import java.util.ResourceBundle;



/**
 * Created by student on 26.09.2017.
 */
public class View {
    public static final String PROPERTY_PATH = "messages";




    public void printMessage(String message){
        System.out.println(message);
    }

    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }





}
