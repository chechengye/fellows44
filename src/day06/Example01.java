package day06;

import java.util.Arrays;

/**
 * 实现一个化妆品商城中的化妆品管理
 */
public class Example01 {
    public static void main(String[] args) {
        SortCosmeticManager cm = new SortCosmeticManager();
        cm.add(new Cosmetic("大宝","国产",32));
        cm.add(new Cosmetic("曼秀雷敦","进口",55));
        cm.add(new Cosmetic("妮维雅","进口",5));
        cm.add(new Cosmetic("妮维雅","进口",22));
        cm.printAll();
    }
}
class SortCosmeticManager extends CosmeticManager{
    public void printAll(){
        //根据价格进行排序 选择排序 minIndex
        for(int i = 0 ; i < count ; i++){
            int minIndex = i;
            for(int j = i + 1 ; j < count ; j++){
                if(cosmetics[minIndex].getPrice() > cosmetics[j].getPrice())
                    minIndex = j;
            }
            if(minIndex != i){
                Cosmetic cosmetic = cosmetics[minIndex];
                cosmetics[minIndex] = cosmetics[i];
                cosmetics[i] = cosmetic;
            }
        }
        System.out.println(Arrays.toString(cosmetics));
    }
}
class CosmeticManager{
    Cosmetic[] cosmetics = new Cosmetic[5];
    int count;
    /**
     * 进货
     */
    public void add(Cosmetic cosmetic){

        cosmetics[count++] = cosmetic;
    }

    public void printAll(){
        for(Cosmetic c : cosmetics){
            if(null != c){
                System.out.println(c);
            }
        }
    }
}
class Cosmetic{
    private String name;
    private String type;
    private int price;

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
