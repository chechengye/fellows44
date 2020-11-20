package day11.iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate caList;
    private int index;

    public ConcreteIterator(ConcreteAggregate caList){
        this.caList = caList;
    }

    @Override
    public boolean hasNext() {
        if(index >= this.caList.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return this.caList.get(index++);
    }
}
