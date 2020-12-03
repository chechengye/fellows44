package day14.bean;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class BeanTest {

    public static void main(String[] args) {
        //前端/移动端获取到了数据 ,都是String格式
        String username = "zhangsan";
        String age = "10";
        String sex = "男";
        String email = "zhangsan@163.com";
        User user = new User();
        //user.setUsername(username);
        //user.setAge(Integer.valueOf(age));//转换异常或者麻烦
        Map<String , String> map = new HashMap<>();//可以通过java代码自动封装的
        map.put("username",username);
        map.put("age",age);
        try {
            //1、优势，不需要我们做类型转换了
            //BeanUtils.setProperty(user , "age" , age );
            //BeanUtils.setProperty(user , "username" , username );
            //BeanUtils.setProperty(user , "sex" , sex );
            System.out.println(user);
            //2 、优势，可以自动映射的方式，来进行赋值操作
            BeanUtils.populate(user , map);
            System.out.println("--------------------------");
            System.out.println(user);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
