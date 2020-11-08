package day05;

import java.util.Arrays;

/**
 * Chicken的管理
 * 鸡舍： 进行，增、删、改、查（CURD）
 */
public class Example03 {
    public static void main(String[] args) {
        ChickenManage cm = new ChickenManage();
        cm.add(new Chicken("咕咕鸡",2 , "白色" , 1));//号码牌唯一标识它
        cm.add(new Chicken("正常鸡",3 , "黑色" , 2));
        cm.add(new Chicken("小黄鸡",1 , "黑色" , 3));
        cm.add(new Chicken("小黄鸡",1 , "黑色" , 4));
        cm.add(new Chicken("小黄鸡",1 , "黑色" , 5));
        cm.add(new Chicken("小黄鸡",1 , "黑色" , 6));
        cm.printAll();
        System.out.println("--------------------------");
        System.out.println(cm.getChickenByNo(3));
        System.out.println("--------------------------");
        cm.updateChicken(new Chicken("尖叫鸡", 6 , "红色", 2));
        cm.printAll();
        System.out.println("------------------------");
        cm.deleteChickenByNo(2);
        cm.printAll();
    }

}
class ChickenManage{
    private Chicken[] cks = new Chicken[5];
    private int count = 0;
    /**
     * 添加方法
     */
    public void add(Chicken c){
        if(count == cks.length)
            cks = Arrays.copyOf(cks , cks.length * 2);//扩容 ： 原数组的2倍 或者 原数组的：原长度 +  (原长度/2 + 1)
        cks[count++] = c;
    }

    /**
     * 根据编号获取一只鸡
     * @param no
     * @return
     */
    public Chicken getChickenByNo(int no){
        //1、根据no找寻这只鸡，从哪？cks
        for(Chicken c : cks){
            if(no == c.getNo())
                return c;
        }
        return null;
    }

    /**
     * 修改一只鸡
     * @param c
     */
    public void updateChicken(Chicken c){
        for(Chicken ck : cks){
            if(null != ck){
                if(ck.getNo() == c.getNo()){//找到了想要修改的这只鸡
                    //ck = c;
                    ck.setColor(c.getColor());
                    ck.setMonth(c.getMonth());
                    ck.setName(c.getName());
                }
            }
        }
        /*for(int i = 0 ; i < count ; i++){
            if(cks[i].getNo() == c.getNo()){
                cks[i] = c;
            }
        }*/
    }

    /**
     * 删除一只鸡
     */
    public void deleteChickenByNo(int no){
        for(int i = 0 ; i < count ; i++){
            if(no == cks[i].getNo()){
                //cks[i] = null;
                for(int j = i + 1 ; j < count ; j++){
                    cks[j - 1] = cks[j];
                }
            }
        }
        cks[--count] = null;
    }

    /**
     * 打印所有鸡舍中的小鸡
     */
    public void printAll(){
        for(Chicken c : cks){
            System.out.println(c);

        }
    }
}

/**
 * 小鸡的实体类
 */
class Chicken{
    private String name;
    private int month;
    private String color;
    private int no;

    public Chicken() {}

    public Chicken(String name, int month, String color, int no) {
        this.name = name;
        this.month = month;
        this.color = color;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void print(){
        System.out.println("name  = " + name);
    }
    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", color='" + color + '\'' +
                ", no=" + no +
                '}';
    }
}