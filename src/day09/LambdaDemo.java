package day09;

/**
 * jdk 1.8新特性lambda表达式
 */
public class LambdaDemo {

    public static void main(String[] args) {
        /*Person person = new Person() {//接口式的匿名内部类

            @Override
            public void eat() {
                System.out.println("吃东西...");
            }
        };
        person.eat();*/
        /**
         * 1、带一个参数的函数式接口
         * 2、无参数的函数式接口
         * 3、带一个参数的可以()都不写
         * 4、如果是一行代码连{}都可以省略
         * 5、多个参数的，参数类型，要写就都写，要不就都不写
         * 6、如果return语句只有一行代码时，花括号不可以省略，
         *     若省略{}连带着return也要去掉
         * 7、若是参数由final修饰，要显示的写final的话，参数类型也要写，或者都不写
         * 8、是由局限性的，只允许存在一个抽象方法
         */
        int i = 30;
        Person p = (name) -> {

            return i;
        };
            //System.out.println(name);;
        System.out.println(p.move("zhangsan"));
        //p.eat("lisi" , 20);
    }


}

/**
 * jdk1.8之后加入了
 * @FunctionalInterface ：函数式接口，就可以使用lambda
 */
@FunctionalInterface
interface Person{
    //void eat(String name , int age);
    int move(final String name);
    default void drink(){

    }
    public static void method(){}

}

