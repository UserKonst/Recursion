package com.social.mappers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kkovbasa
 */
public final class RegexUtil {

    private RegexUtil() {
    }

    public static String find(String regex, String content, int group) {
        String result = null;
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);
            if (matcher.find()) {
                result = matcher.group(group);
            }
        } catch (Exception e) {
        }
        return result;
    }
}
