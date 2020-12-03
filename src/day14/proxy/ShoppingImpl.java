package day14.proxy;

public class ShoppingImpl implements Shopping {
    @Override
    public void shopping() {
        System.out.println("付款，买到心仪的商品...");
    }
}
