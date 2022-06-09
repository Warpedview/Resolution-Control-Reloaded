package io.github.saco.resolutioncontrol.util;

//!import java.io.File;
//!import java.io.IOException;
//!import java.text.DateFormat;
import java.text.NumberFormat;
//!import java.text.SimpleDateFormat;
//!import java.util.Date;

public final class RCUtil {
    private static final String[] UNITS = "KMGTPE".split("");
    private static final NumberFormat FORMAT = NumberFormat.getNumberInstance();

    public static String formatMetric(long n) {
        if (n < 1000) {
            return n + " ";
        }

        int log10 = (int) Math.log10(n);
        int decimalPlace = (int) Math.pow(10, 2 - log10 % 3);
        int displayDigits = (int) (n / Math.pow(10, log10 - 2));

        float result = (float) displayDigits / decimalPlace;
        return String.format("%s %s", FORMAT.format(result), UNITS[log10 / 3 - 1]);
    }

}
