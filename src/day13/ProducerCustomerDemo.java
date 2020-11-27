package day13;

/**
 * 1、生产者与消费者线程协同工作，先生产再消费的一个过程
 * 2、面试题
 * sleep与wait方法的区别
 * sleep : 会让线程进入休眠状态，让出CPU时间片，但是不会让出监视器的所有权（不释放锁），sleep睡眠时间到了自动唤醒
 * wait : 会让线程进入等待状态。让出CPU时间片，但它会让出监视器的所有权（释放锁）,
 *        需要等待其它线程调用notify()或者notifyAll()方法将其唤醒。条件：此对象已经获得了监视器，有锁
 *   相同点：都是让当前线程进入阻塞状态
 *   （重要）
 *
 */
public class ProducerCustomerDemo {
    public static void main(String[] args) {
        Food food = new Food();
        Producer p = new Producer(food);//传递同一个共享对象过去
        Customer1 c1 = new Customer1(food);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
    }
}
/**
 * 生产者线程
 */
class Producer implements Runnable{

    private Food food;
    public Producer(Food food){
        this.food = food;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){//生产食物线程
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i % 2 == 0)
                food.productFood("麻婆豆腐","麻辣口味");
            else food.productFood("鱼香肉丝","酸甜口味");
        }
    }
}

/**
 * 消费者线程
 */
class Customer1 implements Runnable{

    private Food food;
    public Customer1(Food food){
        this.food = food;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i ++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            food.customerFood();
        }
    }
}

/**
 * 共享数据
 */
class Food{
    private String name;
    private String desc;
    private boolean flag = true;//中断线程，标记位 ,true 代表可以进行生产  false 代表可以进行消费
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Food(){ }

    public Food(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //生产食物
    public synchronized void productFood(String name , String desc){
        if(!flag){//表示可以消费
            //Thread.sleep(1000);
            try {
                this.wait();//进入等待状态，并且释放监视器的所有权,需要有线程调用notify()/notifyAll()来唤醒
                //notify():随机唤醒一个处于wait状态下的线程。 notifyAll() ：唤醒所有处于wait状态下的线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        this.setDesc(desc);
        //生产之后
        this.notify();
        this.flag = false;
    }

    //消费食物
    public synchronized void customerFood(){
        if(flag){//表示可以进行生产了
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + "->" + this.desc);
        //消费一次完毕之后
        this.notify();
        this.flag = true;
    }
}