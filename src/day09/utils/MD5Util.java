package day09.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 加密使用
 */
public class MD5Util {

    public static String getMD5Str(String s){
        String encodeToString = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            encodeToString = Base64.getEncoder().encodeToString(md.digest(s.getBytes("utf-8")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encodeToString;
    }
}
