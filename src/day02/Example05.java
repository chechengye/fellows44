package day02;

/**
 * 3、多条件嵌套分支，设计一个程序，根据天气情况选择外出或在家，
 * 外出是逛街还是逛公园，在家是看电影还是玩游戏。
 */
public class Example05 {
    public static void main(String[] args) {
        String str = "晴天";
        int i =  10;
        if(str.equals("晴天")){
            if(i > 9){
                System.out.println("逛街去");
            }else{
                System.out.println("逛公园");
            }
        }else{
            if(i > 9){
                System.out.println("看电影");
            }else{
                System.out.println("玩游戏！");
            }
        }
    }
}
