package ua.training.controller;

import ua.training.View.TextConstant;
import ua.training.View.View;
import ua.training.enums.Group;
import ua.training.model.Model;
import ua.training.model.entity.Note;
import ua.training.model.entity.NotePad;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {
    private Model model;
    private View view;
    Note note;
    NotePad notePad = new NotePad();
    private Scanner scanner = new Scanner(System.in);
    public static ResourceBundle bundle;
    private Locale locale;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        this.locale = new Locale("en", "US");
    }

    private static void getUSBundleData() {
        String MESSAGES_BUNDLE_NAME = "messages";
        final ResourceBundle bundle =
                ResourceBundle.getBundle(
                        MESSAGES_BUNDLE_NAME,
                        new Locale("en", "US"));
    }


    public void createNewNote() {
        getUSBundleData();
        notePad.addNote(addEntry());
        view.printMessage(notePad.toString());
    }


    public Note addEntry() {
        note=new Note();
        addName(bundle.getString(TextConstant.NAME_MESSAGE));
        addSurname(bundle.getString(TextConstant.SURNAME_MESSAGE));
        addPatronymic(bundle.getString(TextConstant.PATRONYMIC_MESSAGE));
        addInitials();
        addAddress(bundle.getString(TextConstant.ADDRESS_MESSAGE));
        addNickname(bundle.getString(TextConstant.NICKNAME_MESSAGE));
        addComment(bundle.getString(TextConstant.COMMENT_MESSAGE));
        addGroup(bundle.getString(TextConstant.GROUP_MESSAGE));
        addEmail(bundle.getString(TextConstant.EMAIL_MESSAGE));
        addCellPhoneNumber(bundle.getString(TextConstant.MOBILE_PHONE_MESSAGE));
        addHomePhoneNumber(bundle.getString(TextConstant.HOME_PHONE_MESSAGE));
        addSkype(bundle.getString(TextConstant.SKYPE_MESSAGE));
        addWritingDate();
        return note;


    }

    public void addName(String capitalizedStringRegex) {
        note.setName(inputStringValueWithScanner(bundle.getString(capitalizedStringRegex), TextConstant.REGEX_NAME_EN));

    }

    public void addSurname(String capitalizedStringRegex) {

        note.setSurname(inputStringValueWithScanner(bundle.getString(capitalizedStringRegex), TextConstant.REGEX_NAME_EN));
    }

    public void addPatronymic(String capitalizedStringRegex) {

        note.setPatronymic(inputStringValueWithScanner(bundle.getString(capitalizedStringRegex), TextConstant.REGEX_NAME_EN));
    }

    public void addInitials() {
        note.setInitials(note.getSurname() + " " + note.getName());
    }

    public void addNickname(String exceptWhiteSpacesRegex) {

        note.setNickname(inputStringValueWithScanner(bundle.getString(exceptWhiteSpacesRegex), TextConstant.REGEX_LOGIN));
    }

    public void addComment(String exceptWhiteSpacesRegex) {

        note.setComment(inputStringValueWithScanner(bundle.getString(exceptWhiteSpacesRegex), TextConstant.REGEX_ANYTEXT));

    }

    public void addGroup(String enumWordsRegex) {
        String afterRegexCheck = inputStringValueWithScanner(enumWordsRegex, TextConstant.REGEX_GROUPS);
        checkEnum(afterRegexCheck, Group.valueOf(afterRegexCheck));

    }


    public void addHomePhoneNumber(String homePhoneRegex) {

        note.setHomeNumber(inputStringValueWithScanner(bundle.getString(homePhoneRegex), TextConstant.REGEX_PHONE));
    }

    public void addCellPhoneNumber(String mobilePhoneRegex) {

        note.setPhoneNumber(inputStringValueWithScanner(bundle.getString(mobilePhoneRegex), TextConstant.REGEX_PHONE));
    }

    public void addEmail(String emailRegex) {

        note.setEmail(inputStringValueWithScanner(bundle.getString(emailRegex), TextConstant.REGEX_EMAIL));
    }

    public void addSkype(String allSymbolsRegex) {

        note.setSkype(inputStringValueWithScanner(bundle.getString(allSymbolsRegex), TextConstant.REGEX_SKYPE));
    }

    public void addAddress(String capitalizedStringRegex) {
        note.setAddress(scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());


    }


    public Date addWritingDate() {
        return new Date();

    }


     void checkEnum(String regexedEnumName, Group group) {
        if (regexedEnumName.equals(group.toString())) {
            note.setGroup(group);
        }
    }



     String inputStringValueWithScanner(String message, String regex) {
        String result = "";
        view.printMessage(message);
        while (!(scanner.hasNext() && (result = scanner.next()).matches(regex))) {
            if (!result.isEmpty()) view.printMessage(bundle.getString(TextConstant.WRONG_INPUT));
        }
        return result;
    }


}
