package day07;

/**
 * 自定义异常
 */
public class MyException extends RuntimeException {

    public MyException(){
        super();
    }
    public MyException(String msg){
        super(msg);
    }

}
