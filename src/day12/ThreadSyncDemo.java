package day12;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程同步讲解
 * 线程进行同步方案
 * 1、同步代码块
 * 2、同步方法
 * 3、使用lock方式，更加灵活，推荐使用的.
 * 在解决同步问题时，可能会有一定的性能的牺牲
 * 同步准则
 * （1） 使代码块尽量的保持简短，把不随线程变化的预处理和后处理的移出synchronized代码块
 *  (2)  尽量不要出现阻塞。文件操作之类的，InputStream.read();
 *  (3) 在持有锁的时候，不要对它对象调用同步方法。（如果有两个方法都是上锁的synchronized，尽量不要互调）
 *      可能出现死锁。
 * 多线程中要进行资源的共享，就需要同步，但同步过多，就可能造成死锁。
 */
public class ThreadSyncDemo {
    public static void main(String[] args) {
        MyRunnable3 mr3 = new MyRunnable3();
        Thread t = new Thread(mr3);
        Thread t1 = new Thread(mr3);//多线程模拟
        t.start();
        t1.start();
    }
}
class MyRunnable3 implements Runnable{
    private int ticket = 10; //售票，作为共享数据
    private Object obj = new Object();
    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i++){

                //A B 进行资源抢占  B ticket 0
                /*synchronized (this){//同一个obj对象进行上锁 ，this ： 代表调用者对象
                    if(ticket > 0) {//此时会不会存在问题？若放于同步代码块外面，可能存在多执行的情况
                        //A进来之后，上锁 B只能等待
                        ticket--;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("剩余的票数为： " + ticket + "张");
                    }
                }*/
            //method();
            method2();
         }
    }

    /**
     * 使用同步方法实现上锁操作，synchronized是一定要针对同一个对象的。默认针对this操作
     *
     */
    public synchronized void method(){
        if(ticket > 0) {//此时会不会存在问题？若放于同步代码块外面，可能存在多执行的情况
            //A进来之后，上锁 B只能等待
            ticket--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("剩余的票数为： " + ticket + "张");
        }
    }

    /**
     * 更加灵活，可以在任何代码片段上执行上锁与解锁操作
     */
    ReentrantLock rtl = new ReentrantLock();
    public void method2(){
        rtl.lock();//上锁
        try{
            if(ticket > 0) {//此时会不会存在问题？若放于同步代码块外面，可能存在多执行的情况
                //A进来之后，上锁 B只能等待
                ticket--;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("剩余的票数为： " + ticket + "张");
            }
        }finally {
            rtl.unlock();
        }
        System.out.println("--------------------");
    }

}