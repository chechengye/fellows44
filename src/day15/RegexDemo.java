package day15;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则
 * 1、可以简化我们检测字符串的一个过程
 *
 */
public class RegexDemo {

    public static void main(String[] args) {
        String s = "520a1314";//需求：判断此串是由数字组成
        boolean flag = true;
        for(char c : s.toCharArray()){//遍历字符串中所有字符
            if(c > '9' || c < '0'){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("此字符串是由数字组成");
        else System.out.println("非全数字组成");
    }

    /**
     * 传统的正则操作
     * Pattern与Matcher配合应用
     */
    @Test
    public void testFn(){
        Pattern p = Pattern.compile("^a*b$");
        Matcher matcher = p.matcher("aaaab");
        boolean b = matcher.matches();
        System.out.println(b);//匹配的结果
    }

    /**
     * String类中的api对正则表达式的支持
     */
    @Test
    public void testFn1(){
        String s = "520a1314";
        boolean b = s.matches("^\\d+$");//一次或多次数字
        System.out.println(s.matches("^[0-9]+$"));
        System.out.println(b);
    }

    /**
     * 1、验证电话号码（如：010-38389438 ）
     2、验证手机号码
     3、验证用户名，只能是字母开头的，数字、字母或下划线的组合
     4、验证邮箱(如:zhangsan_wc@163.com)
     5、验证年龄（100以内）
     6、验证金额（可以有小数位）
     */
    @Test
    public void testFn2(){
        //1、验证电话号码（如：010-38389438 ）
        String s1 = "0110-38389438";
        System.out.println(s1.matches("^\\d{3,4}[-][0-9]{8,9}$"));
        System.out.println("---------------------");
        //2、验证手机号码(用户输入手机号码格式是否正确)
        String s2 = "15517890001";
        System.out.println(s2.matches("^[1][[^0124]&&\\d]\\d{9}$"));
        System.out.println("---------------------");
        //3、验证用户名，只能是字母开头的，数字、字母或下划线的组合（不允许出现特殊字符）
        String s3 = "Ayy_12";//a_
        System.out.println(s3.matches("^[a-zA-Z][\\w]{8,13}$"));
        //4、验证邮箱(如:zhangsan_wc@163.com)
        String s4 = "zhangsan_wc@163.com";
        System.out.println("---------------------");
        System.out.println(s4.matches("^[a-zA-Z0-9]+[\\w]*[@][a-z0-9]{2,3}[.][a-z]{2,5}$"));
        //5、验证年龄（100以内）

    }
}
