package com.milesight.beaveriot.base.utils;

/**
 * author: Luxb
 * create: 2025/7/14 8:53
 **/
public class ValidationUtils {
    private static final String REGEX_HEX = "^[0-9a-fA-F]*$";
    private static final String REGEX_URL = "^https?:\\/\\/(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]+(?::\\d+)?(?:\\/(?:[\\p{L}\\p{N}\\-._~!$&'()*+,;=:@\\/%]|%[0-9a-fA-F]{2})*)*(?:\\?(?:[\\p{L}\\p{N}\\-._~!$&'()*+,;=:@\\/?]|%[0-9a-fA-F]{2})*)?(?:#(?:[\\p{L}\\p{N}\\-._~!$&'()*+,;=:@\\/?]|%[0-9a-fA-F]{2})*)?$";
    private static final String REGEX_IMAGE_BASE64 = "^data:image\\/(png|jpe?g|gif|webp);base64,[A-Za-z0-9+\\/=]+$";
    private static final String REGEX_NUMBER = "^-?\\d+(\\.\\d+)?$";
    private static final String REGEX_INTEGER = "^-?\\d+$";
    private static final String REGEX_POSITIVE_INTEGER = "^[1-9]\\d*$";

    public static boolean isHex(String text) {
        return matches(text, REGEX_HEX);
    }

    public static boolean isURL(String text) {
        return matches(text, REGEX_URL);
    }

    public static boolean isImageBase64(String text) {
        return matches(text, REGEX_IMAGE_BASE64);
    }

    public static boolean isNumber(String text) {
        return matches(text, REGEX_NUMBER);
    }

    public static boolean isInteger(String text) {
        return matches(text, REGEX_INTEGER);
    }

    public static boolean isPositiveInteger(String text) {
        return matches(text, REGEX_POSITIVE_INTEGER);
    }

    public static boolean matches(String text, String regex) {
        if (StringUtils.isEmpty(text) || StringUtils.isEmpty(regex)) {
            return false;
        }
        return text.matches(regex);
    }
}
