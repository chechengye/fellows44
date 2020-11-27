package day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池应用
 * 1、jdk1.5之后 Executors工具类可以操作5种相关的线程池，返回相应的接口ExecutorService
 *   execute(runnable)执行一个线程
 *   shutdown() 终止一个线程/ 会放回线程池
 *
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        //ExecutorService es = Executors.newSingleThreadExecutor();//创建一个存储单个线程的线程池，串行操作
        //ExecutorService es = Executors.newFixedThreadPool(2);//初始化存放两个线程的线程池,初始化值为1的时候，就与单线程池一样了
        ExecutorService es = Executors.newWorkStealingPool();//窃取线程池，要依附于其它线程池的存在(若没有其它线程池，则无法使用)
        //ExecutorService es = Executors.newCachedThreadPool();//获取一个可缓存的线程池，但只能缓存60s，不建议使用
        es.execute(new MyRunnable2());
        es.execute(new MyRunnable2());
        es.execute(new MyRunnable2());
        es.shutdown();//将执行的线程放回线程池


        /*ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);//可以创建一个大小无限制的线程池
        ses.schedule(new MyRunnable2() , 3000 , TimeUnit.MILLISECONDS);
        ses.shutdown();*/
    }
}
class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i ++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}
