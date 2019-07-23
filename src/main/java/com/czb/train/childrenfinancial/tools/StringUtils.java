package com.czb.train.childrenfinancial.tools;

/**
 *
 */
public class StringUtils {

    public static boolean ifBlank(String str) {
        if(str == null || str == ""){
            return true;
        }
        return false;
    }
}
