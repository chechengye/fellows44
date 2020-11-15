package day09;

import java.util.Comparator;

/**
 * 自定义比较器对象
 * OO原则： 对修改关闭，对扩展开放
 */
public class BirdComparator implements Comparator<Bird> {
    @Override
    public int compare(Bird b1, Bird b2) {
        return b1.getMonth() - b2.getMonth();
    }
}
