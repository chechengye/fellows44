package day13.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射相关讲解
 * 获取Class类信息有三种途径
 * 1、可以使用Object.getClass()方法
 * 2、使用类名直接.class方式
 * 3、使用Class.forName获取
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("球球",2 , "灰色");
        Class dogClass = dog.getClass();
        Dog dog1 = new Dog("毛毛",1 , "白色");
        Class dog1Class = dog1.getClass();
        Class dog2Class = Dog.class;
        System.out.println(dogClass == dog1Class);
        System.out.println(dog2Class == dogClass);
        try {
            Class aClass = Class.forName("day13.reflect.Dog");//全路径拿到
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * 1、可以使用newInstance()来实例化对象
     */
    @Test
    public void testFn(){
        //1、要有Class类的对象
        Class<Dog> dogClass = Dog.class;
        try {
            //默认会使用对象的无参构造器进行实例化对象，若没有则会抛出异常
            Dog dog = dogClass.newInstance();//反射的方式进行实例化对象操作
            System.out.println(dog);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用带参数的构造器帮我们实例化对象
     * getConstructors()
     */
    @Test
    public void testFn1(){
        Class<Dog> dogClass = Dog.class;
        try {
            //程序设计的时候，考虑到此种问题，预先设定了9个Class对象给，8大基本数据类型和void
            Constructor<Dog> constructor = dogClass.getConstructor(String.class, int.class, String.class);
            Dog dog = constructor.newInstance("多多", 5, "黑色");
            System.out.println(dog);
            System.out.println("------------------------------------");
            Constructor<?>[] constructors = dogClass.getConstructors();
            for(Constructor c : constructors){
                System.out.println(c.getName() + "-" + Modifier.toString(c.getModifiers()) + "-" + c.getParameterCount());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    /**
     * 获取类中的包信息
     */
    @Test
    public void testFn2(){
        Dog dog = new Dog("球球",2 , "灰色");

        Class dogClass = dog.getClass();
        Package aPackage = dogClass.getPackage();
        //获取对象所在的包信息
        System.out.println(aPackage.getName());
        Method[] methods = dogClass.getMethods();//只能获取到公有修饰的方法，包括父类中所有公有方法
        for(Method m : methods){
            System.out.println(m);
            if(m.getName().equals("toString")){
                try {
                    String invoke = (String)m.invoke(dog);//通过发射的方式调用到其内部方法
                    System.out.println(invoke);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("-----------------------------------------");
        Method[] declaredMethods = dogClass.getDeclaredMethods();//返回本类中的所有方法，包含私有方法，不包含父类中的方法
        for(Method m : declaredMethods){
            System.out.println(m);
            if(m.getName().equals("method")){
                try {
                    m.setAccessible(true);//将私有的修饰符修饰的属性/方法变成对外可见，所以反射其实是破坏了封装性的。
                    m.invoke(dog , "反射调用私有方法");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
