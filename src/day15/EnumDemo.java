package day15;

import org.junit.Test;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * 枚举讲解
 */
public class EnumDemo {
    public static final int RED = 1;
    public static final int BLUE = 2;
    public static final int GREEN = 3;
    public static int color;
    public static ColorEnum colorEnum;
    public static void main(String[] args) {
        color = RED;
        color = BLUE;
        color = 5;
        System.out.println(color);
        System.out.println("-----------------------");
        colorEnum = ColorEnum.RED;
        //colorEnum = ColorEnum.GREEN;
        System.out.println(colorEnum.name() + "-" + colorEnum.ordinal());
        //colorEnum = "30";
        ColorEnum[] values = ColorEnum.values();
        for(ColorEnum colorEnum : values){
            System.out.println(colorEnum.name());
        }
    }
    /**
     * switch对枚举类型的支持
     */
    @Test
    public void testFn(){
        colorEnum = ColorEnum.BLUE;//经过一系列操作，赋值
        switch (colorEnum){
            case RED:
                System.out.println("它是红色");
                break;
            case BLUE:
                System.out.println("它是蓝色");
                break;
        }
    }

    /**
     * 集合对枚举类型的支持
     * 操作起来更加高效
     * key - 固定的取值范围
     * EnumSet 、EnumMap
     */
    @Test
    public void testFn1(){
        EnumMap<ColorEnum , String> enumMap = new EnumMap<>(ColorEnum.class);
        enumMap.put(ColorEnum.RED , "红色");
        enumMap.put(ColorEnum.BLUE , "蓝色");
        enumMap.put(ColorEnum.YELLOW , "黄色");
        enumMap.forEach((k,v)->System.out.println(k + "->" + v));

        EnumSet<ColorEnum> enumSet = EnumSet.allOf(ColorEnum.class);
        //enumSet.add(ColorEnum.RED);
        enumSet.forEach(System.out::println);// 只获取到了枚举的名称
    }
    /**
     * 自定义构造器，改变JVM调用
     * 初始化 参数
     */
    @Test
    public void testFn2(){
        System.out.println(ColorEnum.RED.getName() + "-" + ColorEnum.RED.getVal());
    }
}
