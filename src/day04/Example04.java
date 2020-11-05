package day04;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

/**
 * 双色球模拟综合案例
 */
public class Example04 {

    private final int BLUE_BOUND = 16;
    @Test
    public void testFn(){
        String[] ballPool = getBallPool();
        String[] sysRedBalls = getRedBalls(ballPool);
        Random r = new Random();
        String sysBlueBall = ballPool[r.nextInt(16)];//系统随机获取的一个篮球
        System.out.println("本期号码为： " + Arrays.toString(sysRedBalls) + sysBlueBall);
        System.out.println("---------------------------");
        //用户抽取红球与篮球
        String[] userRedBalls = getRedBalls(ballPool);
        String userBlueBall = ballPool[r.nextInt(BLUE_BOUND)];
        System.out.println("用户随机抽取号码为： " + Arrays.toString(userRedBalls) + userBlueBall);
        System.out.println("--------------------");
        System.out.println("开奖结果： " + isReward(sysRedBalls , sysBlueBall , userRedBalls , userBlueBall));
    }

    /**
     * 初始化双色球奖池
     * @return
     */
    public String[] getBallPool(){
        String[] pool = new String[33];
        for(int i = 1 ; i <= pool.length ; i++){
            if(i < 10) pool[i - 1] = "0" + i;
            else pool[i - 1] = i + "";//整型转成字符串最快的方式
        }
        return pool;
    }

    /**
     * 获取6个不重复的红球
     * @return
     */
    public String[] getRedBalls(String[] ballPool){
        String[] redBalls = new String[6];//初始化存放6个红球的地方
        int count = 0;
        Random r = new Random();//获取随机数的函数
        boolean[] isUsed = new boolean[ballPool.length];//boolean类型的数组默认值是？ false
        while (true){
            int index = r.nextInt(ballPool.length);//随机获取到0~32中的一个值，此值正好对应球池的索引位置
            if(isUsed[index]) continue;  // 跳过本次循环，继续执行下次循环
            isUsed[index] = true; //标记那个索引位置被使用过了
            redBalls[count++] = ballPool[index];
            if(count == redBalls.length)
                break;
        }
        return redBalls;
    }

    /**
     * 获取中了几等奖
     * @param sysRedBalls
     * @param sysBlueBall
     * @param userRedBalls
     * @param userBlueBall
     * @return
     */
    public String isReward(String[] sysRedBalls , String sysBlueBall , String[] userRedBalls , String userBlueBall){
        int redRewardCount = 0;
        for(String sysRed : sysRedBalls){
            for(String userRed : userRedBalls){
                if(sysRed.equals(userRed)) redRewardCount ++;
            }
        }
        int blueRewardCount = 0 ;
        if(sysBlueBall == userBlueBall) blueRewardCount ++;
        if(blueRewardCount == 1 && redRewardCount < 3)
            return "六等奖";
        else if((blueRewardCount + redRewardCount) == 4)
            return "五等奖";
        else if((blueRewardCount + redRewardCount) == 5)
            return "四等奖";
        else if(blueRewardCount == 1 && redRewardCount == 5)
            return "三等奖";
        else if(redRewardCount == 6 && blueRewardCount == 0)
            return "二等奖";
        else if(redRewardCount == 6 && blueRewardCount == 1)
            return "一等奖";
        else return "未中奖";
    }
}
