package day02;

/**
 * 1、输入一个字符，判断是大写字母还是小写字母，输出提示信息。
 */
public class Example03 {
    public static void main(String[] args) {
        char c = '喊';
        if( c >= 'a' && c <= 'z'){
            System.out.println("它是小写字母！");
        }else if(c >= 'A' && c <= 'Z'){
            System.out.println("它是大写字母！");
        }else{
            System.out.println("其它字符！");
        }
    }
}
