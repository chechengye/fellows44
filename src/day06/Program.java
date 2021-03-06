package day06;

import org.junit.Test;

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

    /**
     * final测试
     */
    @Test
    public void testFn(){
        FinalDemo fd = new FinalDemo();
        fd.method();
        Final2 f2 = new Final2();
        f2.move();
    }

    /**
     * 测试抽象类
     */
    @Test
    public void testFn1(){
        AbsPerson mp = new ManPerson();//多态的一种体现 ，自动向上转型
        mp.sex = "男";
        mp.eat();
        AbsPerson wp = new WomenPerson();
        wp.eat();
        /*AbsPerson ad = new AbsDemo(){

        };*/
    }

    /**
     * 测试接口
     */
    @Test
    public void testFn2(){
        Bird bird = new Bird();
        bird.fly();
    }

    /**
     * 内部类测试
     */
    @Test
    public void testFn3(){
        Outer o = new Outer();
        Outer.Inner inner = o.new Inner();
        inner.eat();
        System.out.println("---------------------");
        o.method();
        System.out.println("---------------------");
        o.print();
        System.out.println("---------------------");
        Outer.Inner1 inner1 = new Outer.Inner1();
        inner1.eat();
        Outer.move();
        System.out.println("----------------------");
        o.print2();
        System.out.println("---------------------");
        o.print3();
        System.out.println("---------------------");
        o.print4("dss", new Inner5() {
            @Override
            public void name() {
                System.out.println("我是参数式匿名内部类");
            }
        }, new Inner6() {
            @Override
            public void drink() {
                System.out.println("喝什么...");
            }
        });
    }

    /**
     * 多态测试
     */
    @Test
    public void testFn4(){
        A a1 = new A();
        A a2 = new B(); // 多态自动向上转型
        B b = new B();
        C c = new C();
        D d = new D();
        a1.show(b);
        System.out.println("-------------------------------");
        a1.show(c);
        System.out.println("-------------------------------");
        a1.show(d);
        System.out.println("-------------------------------");
        a2.show(b);
        System.out.println("-------------------------------");
        a2.show(c);
        System.out.println("-------------------------------");
        a2.show(d);
        System.out.println("-------------------------------");
        b.show(b);
        System.out.println("-------------------------------");
        b.show(c);
        System.out.println("-------------------------------");
        b.show(d);
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

/**
 * final关键字讲解
 * 1、final可以修饰属性、成员变量/局部变量   -- 称为常量
 * 2、final修饰一个方法，不能被子类重写，只能调用
 * 3、final修饰一个类不能被继承，断子绝孙类
 */
class FinalDemo{
    final int PERSON_NUM = 10;

    public void method(){
        final int i = 20;
        System.out.println(Constants.MSG.SUCCESS_MSG);
        move();
    }

    public final void move(){
        System.out.println("移动...");
    }
}
class Final2 extends FinalDemo{
    /*public final void move(){

    }*/
}
final class Constants{

    public static final int CONTENT_SIZE = 100;
    interface MSG{
        String SUCCESS_MSG = "添加成功";
    }
    interface URL{
        String URL = "http://wx.openapi.xxxx";
    }
}
/**
 * 抽象类讲解
 * 1、带抽象方法的类，一定要定义为抽象类
 * 2、抽象类中，可以不定义抽象方法。（意义不大）
 * 3、抽象方法一定要有出口
 * 4、抽象类中所有抽象方法，子类必须全部实现
 * 5、抽象类继承抽象类可以不实现其内部的抽象方法
 * 6、抽象类不能被实例化
 * 7、抽象类可以有构造方法
 */
abstract class AbsPerson{

    protected String username;
    protected String sex;

    public void move(){

    }
    public abstract void eat();//抽象方法，可以不写方法体

    public abstract void say();
}

abstract class AbsDemo extends AbsPerson implements ISay{
    public AbsDemo(){
        System.out.println("抽象类构造方法");
    }
    public abstract void demo();
}

/*class Demo extends AbsDemo{ 出口需要实现所有继承的抽象类、和接口中的抽象方法

}*/
/**
 * 选中 alt + enter
 */
class ManPerson extends AbsPerson{
    //@Override 可以不写，写了限制必须是重写父类的方法
    //@Override
    public void eat() {
        System.out.println(super.sex + "人喜欢吃肉...");
    }

    @Override
    public void say() {

    }
}
class WomenPerson extends AbsPerson{
    @Override
    public void eat() {
        System.out.println("女人喜欢吃蔬菜...");
    }

    @Override
    public void say() {

    }
}

/**
 * 修饰一个接口使用interface
 * 1、接口中的所有方法都是由 public abstract修饰的 (JDK 1.8之前)
 * 2、接口中的属性默认都是public static final修饰的
 * 3、接口支持多实现
 * 4、接口之间是可以多继承
 * 5、抽象类实现接口可以不重写抽象方法
 */
interface IFly{
    //public static final int COUNT = 20;
    void fly();

    /*default void eat(){ //不常用  jdk 1.8之后加入
    }*/
}
interface IEat{
    void eat();
}

interface ISay extends IFly ,IEat{}

class Bird implements ISay{

    @Override
    public void fly() {
        System.out.println("鸟儿飞行很慢...");
    }

    @Override
    public void eat() {
        System.out.println("鸟儿喜欢吃虫子");
    }
}
class Plane implements IFly{

    @Override
    public void fly() {
        System.out.println("飞机飞行很快...");
    }
}

/**
 * 内部类
 * 1、成员内部类
 * 2、方法内部类
 * 3、静态内部类
 * 4、匿名内部类
 *    （1）继承式匿名内部类 （2）接口式的匿名内部类 （3）参数式的匿名内部类（重要）
 */
class Outer{
    /**
     * 成员内部类
     */
    class Inner{
        public void eat(){
            System.out.println("成员内部类");
        }
    }

    static class Inner1{
        public void eat(){
            System.out.println("静态内部类");
        }
    }

    public static void move(){
        System.out.println("移动...");
    }
    /**
     * 方法内部类
     * 1、方法内部类中引用的变量，会默认改成常量 jdk 1.8之后 可以不显示的使用final修饰
     */
    public void print(){
        int i = 10;
        class Inner2{
            int a = 20;
            public void eat(){
                System.out.println("方法式内部类"  + a + i);
            }
        }
        //i++;  修改之后，编译期认为不是常量了，所以方法内部类中就不可以引用了
        Inner2 inner2 = new Inner2();
        inner2.eat();
    }

    public void method(){
        Inner inner = new Inner();
        inner.eat();
    }

    public void print2(){
        int a = 20;
        new Inner4(){
            @Override
            void eat() {
                int i = 30;
                System.out.println("继承式的匿名内部类" + a);
            }
        }.eat();
        //inner4.eat();

    }
    public void print3(){
        new Inner5(){
            @Override
            public void name() {
                System.out.println("接口式匿名内部类");
            }
        }.name();
    }

    public void print4(String name , Inner5 inner5 , Inner6 inner6){
        inner5.name();
        inner6.drink();
    }
}
abstract class Inner4{
    abstract void eat();
}

interface Inner5{
    void name();
}
interface Inner6{
    void drink();
}

/**
 * 多重继承
 * 1、多态应用实例
 * (1)this.show(O)
 * (2)super.show(O)
 * (3)this.show(super..O)
 * (4)super.show(super..0)
 */
class A {
    public void show(D d){
        System.out.println("A AND D");
    }
    public void show(A a){
        System.out.println("A AND A");
    }

    public void show(C c){
        System.out.println("A AND C");
    }
}
class B extends A{
    public void show(B b){
        System.out.println("B AND B");
    }
    public void show(A a){
        System.out.println("B AND A");
    }
}
class C extends B { }
class D extends B{}