package day09.pigDemo;

import java.util.ArrayList;
import java.util.List;

public class PigManger {

    public static void main(String[] args) {
        PigManger pm = new PigManger();
        pm.add(new Pig("小朱",3 , 1));
        pm.add(new Pig("小花",2 , 2));
        pm.add(new Pig("小猪",5 , 3));
        pm.printAll();
        System.out.println("---------------");
        pm.update(new Pig("测试",5 , 2));
        pm.printAll();
    }

    private List<Pig> pigs = new ArrayList<>(20);

    public void add(Pig pig){
        pigs.add(pig);
    }

    public void update(Pig pig){
        /*for(Pig p : pigs){
            if(p.getId() == pig.getId()){
                pigs.set();
            }
        }*/
        for(int i = 0 ; i < pigs.size() ; i ++){
            if(pigs.get(i).getId() == pig.getId()){
                pigs.set(i , pig);
            }
        }
    }

    public void printAll(){
        for(Pig p : pigs){
            System.out.println(p);
        }
    }
}
