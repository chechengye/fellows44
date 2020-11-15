package day09;

/**
 * 克隆应用场景
 * 1、克隆的对象不会占用内存空间，复制了一个对象，放于缓存中
 * 2、应用场景：飞机发射子弹
 * 3、克隆绵羊：多利
 */
public class CloneDemo {
    public static void main(String[] args) {
        Bullet b = new Bullet(10,30,"红色");
        try {
            Bullet b1 = (Bullet)b.clone();
            Bullet b2 = (Bullet)b.clone();//克隆不会申请堆内存空间
            System.out.println(b1);
        } catch (CloneNotSupportedException e) {//受检异常
            e.printStackTrace();
        }
    }
}

class Bullet implements Cloneable {//标记接口：标记一个类可以做什么事情。
    private int width;
    private int height;
    private String color;

    public Bullet() {
    }

    public Bullet(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}