package day15;

/**
 * 枚举类使用关键字enum
 * 序列号的索引值位置从0开始
 */
public enum ColorEnum {
    RED("红色",5) , GREEN("绿色",1) , BLUE , YELLOW;//; 带上，无论一行代码，还是多行。要放于代码块的第一行
    private String name;
    private int val;
    //public修饰构造方法是不被允许的；枚举被设计成了单例模式，JVM实例化操作，当加载的时候。
    //JVM为了保证每一个枚举元素的唯一性/唯一实例，不允许外部new实例化操作。
    ColorEnum(){}

    ColorEnum(String name , int val){
        this.name = name;
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ColorEnum{" +
                "name='" + name + '\'' +
                ", val=" + val +
                '}';
    }
}
