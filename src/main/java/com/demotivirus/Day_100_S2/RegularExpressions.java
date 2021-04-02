package com.demotivirus.Day_100_S2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_FIO_REGEX =
            Pattern.compile("^^[\\S]*[\\wа-я—ёА-ЯЁ-][^ ]$", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_10_WORDS_REGEX =
            Pattern.compile("[\\w\\s]{10}", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_DATE_FORMAT_REGEX =
            Pattern.compile("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[012])\\.(19|20)\\d\\d", Pattern.CASE_INSENSITIVE);
    private static final Pattern VALID_PASSPORT_NUMBER_REGEX =
            Pattern.compile("^[\\d]{4}$");
    private static final Pattern VALID_PASSPORT_SERIAL_REGEX =
            Pattern.compile("^[\\d]{6}$");
    private static final Pattern VALID_PASSPORT_CODE_REGEX =
            Pattern.compile("[\\d]{3}-[\\d]{3}");
    private static final Pattern VALID_PASSPORT_DATE_REGEX =
            Pattern.compile("((0[1-9]|[12]\\d|3[01])\\.(0[1-9]|1[0-2]\\.([1][9][9][8-9]|[2][0][0-2][\\d])))");
    private static final Pattern VALID_INN_NUMBER_REGEX =
            Pattern.compile("^[\\d]{12}$");
    private static final Pattern VALID_SNILS_NUMBER_REGEX =
            Pattern.compile("^\\d{3}-\\d{3}-\\d{3}(-|\\s)\\d{2}$");
    private static final Pattern VALID_KORR_SCHET_REGEX =
            Pattern.compile("^[\\d]{20}$");
    private static final Pattern VALID_BIK_REGEX =
            Pattern.compile("^[\\d]{9}$");
    private static final Pattern VALID_IP_REGISTRATION_DATE_REGEX =
            Pattern.compile("^((0[1-9]|[12]\\d|3[01])\\.(0[1-9]|1[0-2]\\.(([2][0][0][4]|[2][0][0][4-9]))|([2][0][1-2][\\d])))$");
    private static final Pattern VALID_OGRN_NUMBER_REGEX =
            Pattern.compile("^[\\d]{15}$");
    private static final Pattern VALID_BANK_CLIENT_NAME_TO_UPPER_CASE_ONLY_REGEX =
            Pattern.compile("^[\\S]+[A-Z\\s]+[A-Z][\\S]$");
    private static final Pattern VALID_NUMBER_EMPLOYEES_REGEX =
            Pattern.compile("^([\\d]|([\\d][\\d])|([\\d][\\d][\\d])|([\\d][\\d][\\d][\\d])|([\\d][\\d][\\d][\\d][\\d]))$");

    public static void main(String[] args) {
        System.out.println(emailValidate("sdfhjksdfghsdd@sfgdfgdfg.xcv"));
        System.out.println(fioValidate("DSfsdfkks-sdfkkksd"));
        System.out.println(fioValidate("DSfsdfkks sdfkkksd"));
        System.out.println(tenWordsValidate("3ksdf"));
        System.out.println(tenWordsValidate("3ksdfdfdfd"));
        System.out.println(dateFormatValidate("88.33.1999"));
        System.out.println(dateFormatValidate("14.12.1995"));
        System.out.println(passportNumberValidate("9999") + " passport");
        System.out.println(passportSerialValidate("300003"));
        System.out.println(passportCodeValidate("000-000"));
        System.out.println(passportDateValidate("31.12.1998"));
        System.out.println(innNumberValidate("939393939393"));
        System.out.println(snilsNumberValidate("123-123-123 01"));
        System.out.println(korrSchetValidate("000011112222333344445555"));
        System.out.println(bikValidate("012345678"));
        System.out.println(ipRegistrationDateValidate("12.12.2004"));
        System.out.println(ogrnNumberValidate("123456789012345"));
        System.out.println(bankClientNameToUpperValidate("HELLO HELLO HELLO"));
        System.out.println(numberEmployeesValidate("99999"));
    }

    private static boolean emailValidate(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
    }

    private static boolean fioValidate(String fio) {
        Matcher matcher = VALID_FIO_REGEX.matcher(fio);
        return matcher.find();
    }

    private static boolean tenWordsValidate(String tenWords) {
        Matcher matcher = VALID_10_WORDS_REGEX.matcher(tenWords);
        return matcher.find();
    }

    private static boolean dateFormatValidate(String date) {
        Matcher matcher = VALID_DATE_FORMAT_REGEX.matcher(date);
        return matcher.find();
    }

    private static boolean passportNumberValidate(String passportNumber) {
        Matcher matcher = VALID_PASSPORT_NUMBER_REGEX.matcher(passportNumber);
        return matcher.find();
    }

    private static boolean passportSerialValidate(String passportSerial) {
        Matcher matcher = VALID_PASSPORT_SERIAL_REGEX.matcher(passportSerial);
        return matcher.find();
    }

    private static boolean passportCodeValidate(String passportCode) {
        Matcher matcher = VALID_PASSPORT_CODE_REGEX.matcher(passportCode);
        return matcher.find();
    }

    private static boolean passportDateValidate(String passportDate) {
        Matcher matcher = VALID_PASSPORT_DATE_REGEX.matcher(passportDate);
        return matcher.find();
    }

    private static boolean innNumberValidate(String innNumber) {
        Matcher matcher = VALID_INN_NUMBER_REGEX.matcher(innNumber);
        return matcher.find();
    }

    private static boolean snilsNumberValidate(String snilsNumber) {
        Matcher matcher = VALID_SNILS_NUMBER_REGEX.matcher(snilsNumber);
        return matcher.find();
    }

    private static boolean korrSchetValidate(String korrSchet) {
        Matcher matcher = VALID_KORR_SCHET_REGEX.matcher(korrSchet);
        return matcher.find();
    }

    private static boolean bikValidate(String bik) {
        Matcher matcher = VALID_BIK_REGEX.matcher(bik);
        return matcher.find();
    }

    private static boolean ipRegistrationDateValidate(String ipRegistrationDate) {
        Matcher matcher = VALID_IP_REGISTRATION_DATE_REGEX.matcher(ipRegistrationDate);
        return matcher.find();
    }

    private static boolean ogrnNumberValidate(String ogrnValidate) {
        Matcher matcher = VALID_OGRN_NUMBER_REGEX.matcher(ogrnValidate);
        return matcher.find();
    }

    private static boolean bankClientNameToUpperValidate(String bankClientNameToUpper) {
        Matcher matcher = VALID_BANK_CLIENT_NAME_TO_UPPER_CASE_ONLY_REGEX.matcher(bankClientNameToUpper);
        return matcher.find();
    }

    private static boolean numberEmployeesValidate(String numberEmployees) {
        Matcher matcher = VALID_NUMBER_EMPLOYEES_REGEX.matcher(numberEmployees);
        return matcher.find();
    }
}
