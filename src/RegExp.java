/**
 * Regular expressions.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        String ipPattern = "\\b((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]?))\\b(?!\\.0\\.0\\.0)";
        Pattern pattern = Pattern.compile(ipPattern);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }

        return "";
    }
}