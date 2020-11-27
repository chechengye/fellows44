package day13;

public class DeadThreadDemo {
    public static void main(String[] args) {
        new MyRunnable();
    }

}
class MyRunnable implements Runnable{
    Customer c = new Customer();
    Waiter w = new Waiter();
    public MyRunnable(){
        new Thread(this).start();
        w.say(c);
    }
    @Override
    public void run() {
        c.say(w);
    }
}
class Customer{
    public synchronized void say(Waiter w){
        System.out.println("顾客：先吃饭再买单！");
        w.doThing();
    }

    public synchronized void doThing() {
        System.out.println("OK，先买单再吃饭！");
    }
}
class Waiter{

    public synchronized void say(Customer c){
        System.out.println("服务员:先买单再吃饭！");
        c.doThing();
    }
    public synchronized void doThing() {
        System.out.println("OK,先吃饭再买单！");
    }
}
