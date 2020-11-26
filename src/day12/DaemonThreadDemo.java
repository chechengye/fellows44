package day12;

/**
 * 守护线程
 */
public class DaemonThreadDemo {

    public static void main(String[] args) {
        MyRunnable1 mr1 = new MyRunnable1();
        MyRunnable2 mr2 = new MyRunnable2();

        Thread t = new Thread(mr1);
        t.setName("MyRunnable1");
        Thread t1 = new Thread(mr2);

        t.setDaemon(true); // 此时将t线程置为守护线程
        System.out.println("----------isAlive测试-----------");
        System.out.println(t.isAlive());//是否是活动状态，只有当线程进入就绪状态，才会被激活
        t.setPriority(Thread.MAX_PRIORITY);//10
        t.start(); //让它就绪状态之前，启动之前
        t1.setName("MyRunnable2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.println(t.isAlive());
        System.out.println("-----------------------------");
        System.out.println(t.isDaemon());
        /*for(int i = 0 ; i < 50 ; i ++){
            if(i == 10){
                Thread.yield();//让出本次执行，只让一次CPU时间片，下次继续抢占资源
            }
            try {
                Thread.sleep(300);//主线程，先执行完
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }*/
    }
}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}

class MyRunnable2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}