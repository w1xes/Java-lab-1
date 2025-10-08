package ua.util;

class ValidationHelper {
    static boolean isValidId(String id) {
        return id != null && id.matches("[A-Z0-9]{3,10}");
    }
}
