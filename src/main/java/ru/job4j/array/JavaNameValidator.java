package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || Character.isDigit(name.codePointAt(0))
                || Character.isUpperCase(name.codePointAt(0))) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            int c = name.codePointAt(i);
            if (isUpperLatinLetter(c) || isLowerLatinLetter(c)) {
                return true;
            } else {
                if (!isSpecialSymbol(c)) {
                    if (!Character.isDigit(c)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}