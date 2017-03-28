package org.thin.common.utils;

import java.util.regex.Pattern;

public class StringUtil
{
    /**
     * @param number china mobile number
     * @return if valid mobile number return true else false
     */
    public static boolean isChinaMobileNumber(String number)
    {
        String pMobile = "^(1(([34578][0-9])))\\d{8}$";
        return Pattern.matches(pMobile, number);
    }
}
