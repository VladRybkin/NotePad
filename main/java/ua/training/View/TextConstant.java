package ua.training.View;

/**
 * Created by student on 26.09.2017.
 */
public interface TextConstant {
    String INPUT_DATA_REQUEST = "inputDataRequest";
    String WRONG_INPUT = "wrongInput";

    String REGEX_NAME_EN = "^[A-Z][a-z]{1,20}$";
    String REGEX_NAME_UA = "^[А-ЩЬЮЯЇҐІЄ][а-щьюяїґіє]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
    String REGEX_ANYTEXT = "^$";
    String REGEX_PHONE = "^[0-9-+]{8,20}$";
    String REGEX_EMAIL = "^[[\\w]|[\\.]]+@[\\w]+[\\.][\\w]+$";
    String REGEX_SKYPE = "^[[\\w].-]+$";
    String REGEX_NUMBER = "^[\\w]+$";
    String REGEX_GROUPS = "^[[\\d]+[\\s]]*[\\d]+$";

    String SURNAME_MESSAGE = "enterLastName";
    String NAME_MESSAGE = "enterFirstName";
    String PATRONYMIC_MESSAGE = "enterPatronimic";
    String ADDRESS_MESSAGE="enterAddress";
    String LOGIN_MESSAGE="enterLogin";
    String NICKNAME_MESSAGE = "enterNickname";
    String COMMENT_MESSAGE = "enterComment";
    String GROUP_MESSAGE = "enterGroup";
    String HOME_PHONE_MESSAGE = "enterHomePhone";
    String MOBILE_PHONE_MESSAGE = "enterMobilePhone";
    String EMAIL_MESSAGE = "enterEmail";
    String SKYPE_MESSAGE = "enterSkype";
    String INDEX_MESSAGE = "enterIndex";
    String CITY_MESSAGE = "cityRequirements";
    String STREET_MESSAGE = "enterStreet";
    String HOUSE_NUMBER_MESSAGE = "enterHouseNumber";
    String FLAT_NUMBER_MESSAGE = "enterApartmentNumber";
}
