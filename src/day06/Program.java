package day06;

public class Program {
    public static void main(String[] args) {
        //Animal a = new Animal();

        Chicken c = new Chicken();
        System.out.println(c.name);
        HomeChicken hc = new HomeChicken();
        System.out.println("---------------------");
        System.out.println(hc.name);
        hc.eat();
        System.out.println("---------------------");
        Dog dog = new Dog();
        //dog.name = "旺财";
        dog.eat();

    }
}
class Animal{
    protected String name;
    String color;
    public Animal(){}
    public Animal(String name){
        System.out.println(name + "Animal的构造方法");
    }

    protected  void eat(){
        System.out.println("吃东西...");
    }

    public void setName(String name){
        this.name = name;
    }
}

/**
 * 继承：
 * 1、使用关键字extends
 * 2、修饰符最低权限protected
 * 3、只能单继承
 * 4、多重继承
 * 5、若是父类没有默认的构造方法，子类需要使用super()显示的调用父类的带参数的构造方法
 * 6、super()调用构造方法时，也只能放于代码的第一行
 */
class Chicken extends Animal{
    public Chicken(){
        //显示的调用父类的带参数的构造方法
        super("我是小鸡");
        System.out.println("Chicken的构造方法");
    }


}
class HomeChicken extends Chicken{

}

/**
 * 方法重写：
 * 1、方法名称一样
 * 2、方法的返回类型一样
 * 3、方法的修饰符，子类的要高于父类的
 * 4、参数一样
 * 5、重写方法后，在调用时，以创建的对象类型为准，会调用谁的方法
 * 6、重写与重载的区别
 * 1）、重写是发生与子类与父类关系的。重载是发生在两个或以上方法之间的
 * 2）、重写：参数必须一致，重载：参数、个数、类型、顺序等不一致
 * 3）、重写：返回值类型必须一致，重载：可以不一致，并不能决定重载条件
 * 4)、重写：修饰符子类必须大于父类 重载：不要求
 * 5)、方法名称都是一模一样
 */
class Dog extends Animal{

    public void eat(){
        super.setName("旺财");
        System.out.println(super.name + "我爱吃骨头...");
    }

    public void method(){

    }

    protected void method(int i){

    }
}
