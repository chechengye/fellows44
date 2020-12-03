package day14.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        Shopping shopping = new ShoppingImpl();
        ProxyDemo pd = new ProxyDemo();
        Shopping proxyObj = (Shopping)pd.productProxyObj(shopping);//被代理后的对象
        proxyObj.shopping();

    }
}
