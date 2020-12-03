package day14.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * 是一种接口式的动态代理
 */
public class ProxyDemo implements InvocationHandler {

    private Object target; // 目标对象，被代理对象

    public Object productProxyObj(Object target){
        this.target = target;
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);//this : InvocationHandler
        return proxyInstance;//被代理后的对象
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理去海外淘货，帮我们选择商品");
        Object invokeObj = method.invoke(target, args);//args : 无论有多少个参数，都可以执行得到
        System.out.println("合作结束.期待下次合作");
        return invokeObj;
    }
}
