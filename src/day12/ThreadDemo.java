package day12;

/**
 * 线程的基本使用
 * 创建线程
 * 1、继承Thread类
 * 2、实现Runnable接口，实例化带参数的构造器
 */
public class ThreadDemo {
    public static void main(String[] args) {
        /*MyThread mt = new MyThread();
        mt.setName("MyThread");
        mt.start();*///使线程进入就绪状态,会默认调用run()方法
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.setName("MyRunnable");
        t.start(); //已经让两个线程进入就绪状态了 ,多核多线程可以交替执行
        for(int i = 0 ; i < 50 ; i ++){
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 20){
                /*try {
                    mt.join();//等待多少毫秒值后加入一个线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
                //mt.interrupt();//中断mt线程，mt线程不再执行.停止
                mr.setFlag(true);

            }
        }
    }
}

/**
 * 第一种继承Thread
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i ++){
            if(this.isInterrupted()){//为true，代表此线程已经被中断
                System.out.println(this.getName() + "此线程被中断");
                break;
            }
            try {
                Thread.sleep(300);//睡眠300ms，让出CPU资源，让时间片立刻进行轮询。但不会释放监视器的所有权？
            } catch (InterruptedException e) {//异常还会清楚中断标记
                this.interrupt();//再次对此线程进行中断标记
                //e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}

/**
 * 实现Runnable接口的方式创建线程(借助于Thread的构造器)
 * 推荐使用的
 * 正常中断异常方式，推荐自定义标记方式
 * flag
 */
class MyRunnable implements  Runnable{
    private boolean flag; // 自定义标志位 false表示不中断，true表示中断
    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i ++){
            if(flag){
                break;
            }
            try {
                Thread.sleep(300);//睡眠400ms，让出CPU资源，让时间片立刻进行轮询。但不会释放监视器的所有权？
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
