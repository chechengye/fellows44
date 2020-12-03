package day14;

import java.io.Serializable;

/**
 * 单例模式优化
 * 1、多线程下的同步
 *    1)同步代码块 2)同步方法 3)同步lock Re
 * 2、防止反射调用私有构造器
 * 3、对象前面放置volatile修饰符。原因： 保证每次都从地址中获取，不从寄存器（缓存）中获取
 * 4、添加对象序列化策略
 */
public class SingletonDemo {

    public static void main(String[] args) {
        SingleTon singleTon1 = SingleTon.getNewInstance();
        SingleTon singleTon2 = SingleTon.getNewInstance();
        System.out.println(singleTon1 == singleTon2);//比较内存地址
    }
}

/**
 * 懒汉式 - 单例模式 最终完整版
 */
class SingleTon implements Serializable{
    private volatile static SingleTon singleTon = null;
    private SingleTon(){
        if(null != singleTon)
            throw new RuntimeException("此类为单例模式，不允许外部调用");
    }

    public static SingleTon getNewInstance(){

        if(null == singleTon){ //有必要吗？执行同步代码块，会消耗一定性能
            //A B 在此位置上锁，只能有一个线程进入实例化对象
            synchronized (SingleTon.class){//Class
                if(null == singleTon){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }
}
