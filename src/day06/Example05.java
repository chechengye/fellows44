package day06;

/**
 * 简单工厂模式
 */
public class Example05 {
    public static void main(String[] args) {
       /* Product phone = new Phone();
        phone.work();
        Product computer = new Computer();
        computer.work();*/
        ProductFactory pf = new ProductFactory();
        Product product = pf.getProductByName("computer");
        product.work();
    }
}
class ProductFactory{
    public Product getProductByName(String name){
        if("phone".equals(name)){
            return new Phone();
        }else if("computer".equals(name)){
            return new Computer();
        }
        return null;
    }
}

abstract class Product{
    abstract void work();
}
class Phone extends Product{
    public void work(){
        System.out.println("电话开始工作");
    }
}
class Computer extends Product{
    public void work(){
        System.out.println("电脑开始工作");
    }
}