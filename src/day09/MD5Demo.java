package day09;

import day09.utils.MD5Util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

public class MD5Demo {
    public static void main(String[] args) {
        //AZICOnu9cyUFFvBp3xi1AA==
        String pwd = "admin12345";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");//MD5支持
            System.out.println(Arrays.toString(pwd.getBytes()));
            String encodeToString = Base64.getEncoder().encodeToString(md.digest(pwd.getBytes("utf-8")));//加密操作
            // == MD5加密的字符串都会以 == 结束 ，公钥、私钥 ==
            //Base64 : A-Z a-z 0-9 + /
            System.out.println(encodeToString);
            System.out.println("----------------------");
            System.out.println(Arrays.toString(md.digest(pwd.getBytes("utf-8"))));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------");
        String saveStr = "AZICOnu9cyUFFvBp3xi1AA==";
        System.out.println("请输入密码: ");
        Scanner sc = new Scanner(System.in);
        String inputPwd = sc.next();
        String md5Str = MD5Util.getMD5Str(inputPwd);
        if(saveStr.equals(md5Str)){
            System.out.println("密码验证通过！！");
        }else{
            System.err.println("密码错误....");
        }

    }
}
