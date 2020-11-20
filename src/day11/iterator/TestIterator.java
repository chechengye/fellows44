package day11.iterator;

/**
 * 迭代器设计模式应用
 */
public class TestIterator {

    public static void main(String[] args) {
        ConcreteAggregate caList = new ConcreteAggregate();
        caList.add("tom");
        caList.add("lucy");
        caList.add("lily");
        Iterator iterator = caList.iterator();
        System.out.println("--------------------");
        System.out.println(caList.get(0));
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
