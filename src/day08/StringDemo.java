package day08;

import org.junit.Test;

import java.util.Arrays;

/**
 * String讲解
 */
public class StringDemo {

    public static void main(String[] args) {
        String s1 = "张三";
        String s2 = "张三";
        System.out.println(s1 == s2);
        System.out.println("------------------");
        String s3 = new String("张三");
        System.out.println(s1 == s3);//== 比较的就是内存地址

        System.out.println("------------------");
        //编译期可以确定的值直接参与运算，但是运行期才可以确定的值，不参与运算
        String a = "1";
        String a1 = a + "a";
        String a2 = "1a";
        System.out.println(a1 == a2);

        final String a3 = "1";//编译期即可确定
        String a4 = a3 + "a";
        String a5 = "1a";
        System.out.println(a4 == a5);
        System.out.println("-----------------");
        final String c = getC();//只要是方法，就必须运行才会知道结果
        String c1 = "1" + c;
        String c2 = "1c";
        System.out.println(c1 == c2);
    }

    private static String getC() {
        return "c";
    }

    /**
     * 字符串api
     */
    @Test
    public void testFn(){
        String str = "agdhs-ghds124398-khjjds";
        System.out.println(str.charAt(2));//根据索引取字符
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println("------------------------");
        String str1 = new String(str.toCharArray());
        System.out.println(str1);
        System.out.println("------------------------");
        String str2 = "http://alipay.open.dsjhdjshjds";//回调的返回值时
        if(str2.startsWith("alipay.open",10)){//特殊处理
            System.out.println("支付宝相关操作");
        }
        System.out.println("----------------------");
        System.out.println(str.replaceAll("-", ""));
        System.out.println(str.replace('2', '*'));
        System.out.println("----------------------");
        System.out.println(str.replaceAll("\\d", "*"));
        System.out.println("------------------------");
        String str4 = "abcdsjh222";
        System.out.println(str4.substring(4));
        System.out.println(str4.substring(4 , 6));//不包含6这个索引
        String str5 = "dsgdhsAzhangsan123djshjds";
        int index  = str5.indexOf("zhangsan");
        if(-1 != index){
            System.out.println(str5.substring(0,index));//判断一些字符串是否存在，并分断截取
        }
        String str6 = "image01,image02,image03";
        String[] split = str6.split(",");
        System.out.println(split[0]);

        if(str5.contains("123")){
            System.out.println("包含123");
        }

        System.out.println(str5.lastIndexOf(65));//ASCII码

        //前端接收的过来的字符串为空
        String str7 = "";
        if(str7.equals("")){
            System.out.println("用户名不允许为空");
        }
        String str8 = "dhsADJSHncnxcx";
        System.out.println(str8.toLowerCase());
        //用户操作的，填写 zhangsan
        //再次登录时，不在输入空格了
        String str9 = " zhangsan ";
        String trim = str9.trim();//trim()，去掉字符串的前后空格
        String str10 = "zhangsan";
        if(trim.equals(str10)){
            System.out.println("登录成功");
        }
    }
}
