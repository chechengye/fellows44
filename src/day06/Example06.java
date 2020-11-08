package day06;

/**
 * 静态代理模式（Proxy）
 */
public class Example06 {

    public static void main(String[] args) {
        Actor actor = new Actor();
        ProxyActor proxyActor = new ProxyActor(actor);//proxyActor : 代理后的对象
        proxyActor.doAction();
    }
}

/**
 * 代理对象
 */
class ProxyActor implements Action{
    Action action;
    public ProxyActor(Action action){
        this.action = action;
    }
    @Override
    public void doAction() {
        //环绕通知
        System.out.println("我去签约.." + "签约成功了..");
        long startTime = System.currentTimeMillis();
        this.action.doAction();
        long endTime = System.currentTimeMillis();
        System.out.println("耗时:" + (endTime - startTime));
        System.out.println("我收钱...");
    }
}

/**
 * 被代理对象
 */
class Actor implements Action{

    @Override
    public void doAction() {
        for(int i = 0 ; i < 10000 ;i ++){
            System.out.print("a");
        }
        System.out.println("我要演戏....");
    }
}

interface Action{
    void doAction();
}