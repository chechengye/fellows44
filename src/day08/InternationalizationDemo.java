package day08;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 程序国际化操作
 */
public class InternationalizationDemo {

    public static void main(String[] args) {
        //1、创建语言环境，生成local对象
        //2、参数 ： 语言代码  ， 国家/地区
        Locale localeZh = new Locale("zh","CN");
        Locale localeEn = new Locale("en","US");
        //获取系统默认的语言环境
        Locale localeDefault = Locale.getDefault();
        //3、获取资源文件
        ResourceBundle rb = ResourceBundle.getBundle("day08.info", localeDefault);
        //4、通过key值获取value串
        System.out.println(rb.getString("system.name"));
        System.out.println(rb.getString("input.username"));
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println(rb.getString("input.password"));
        String password = sc.next();

        if("admin".equals(username) && "123456".equals(password)){
            System.out.println(rb.getString("login.success"));
        }else{
            System.out.println(rb.getString("login.fail"));
        }
    }
}
