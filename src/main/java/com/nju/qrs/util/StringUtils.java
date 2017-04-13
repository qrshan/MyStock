package com.nju.qrs.util;

/**
 * Created by qingrongshan on 17/4/11.
 */
public class StringUtils {
    public static long parseLong(String volume) {
        String amount = volume.substring(0, volume.length() - 2);
        if (volume.endsWith("万")) {
            return (long) Float.parseFloat(amount) * 10000;
        } else if (volume.endsWith("亿")) {
            return (long) Float.parseFloat(amount) * 100000000;
        } else {
            if (volume.contains(".")) {
                return (long)Double.parseDouble(volume);
            }
            return Long.parseLong(volume);
        }
    }
}
