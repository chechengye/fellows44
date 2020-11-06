package day05;

/**
 * 单例设计模式
 */
public class Example02 {

    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getInstanceSingleTon();
        SingleTon singleTon2 = SingleTon.getInstanceSingleTon();
        System.out.println(singleTon1 == singleTon2);
        System.out.println("---------------------------");
        SingleTon1 singleTon11 = SingleTon1.getInstanceSingleTon1();
        SingleTon1 singleTon12 = SingleTon1.getInstanceSingleTon1();
        System.out.println(singleTon11 == singleTon12);
    }
}

/**
 * 懒汉式： 刚定义就已经实例化好了
 * 1、构造方法私有化
 * 2、提供实例化属性
 * 3、对外曝露接口
 */
class SingleTon{
    private SingleTon(){}
    private static SingleTon singleTon = new SingleTon();//实例化属性

    public static SingleTon getInstanceSingleTon(){
        return singleTon;
    }
}

/**
 *  饿汉式:  想要的时候 实例化值
 * 1、构造方法私有化
 * 2、属性开始时置为null
 * 3、对外曝露接口，并判空实例化
 */
class SingleTon1{
    private SingleTon1(){};
    private static SingleTon1 singleTon = null;
    public static SingleTon1 getInstanceSingleTon1(){
        if(null == singleTon) //让它紧实例化一次
            singleTon = new SingleTon1();
        return singleTon;
    }
}
