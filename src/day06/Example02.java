package day06;

import org.junit.Test;

/**
 * 类型转换异常演示
 */
public class Example02 {

    @Test
    public void testFn(){

        if(getCat() instanceof HomeCat){//instanceof : 前面对象是否为后面类的实例，返回值boolean类型
            HomeCat cat = (HomeCat)getCat();
            cat.say();
        }else if(getCat() instanceof YeCat){
            YeCat yeCat = (YeCat)getCat();//强制类型转换，或向下转型
            yeCat.say();
        }
    }
    public Cat getCat(){
        return new YeCat(); //自动向上转型
    }
}
abstract class Cat{
    protected String name;

    public abstract void say();

}
class HomeCat extends Cat{

    @Override
    public void say() {
        System.out.println("家猫...");
    }
}

class YeCat extends Cat{
    @Override
    public void say() {
        System.out.println("野猫..,");
    }
}