package day09.utils;

import java.text.DecimalFormat;

/**
 * 小数点保留操作
 * @author cc
 * @creatTime 2020/11/15
 */
public class DecimalFormatUtil {
    /**
     * 获得两位小数
     * @param d
     * @return
     */
    public static String getDecimalForTwo(double d){
        return new DecimalFormat("#.##").format(d);
    }

    /**
     * 获得四位小数
     * @param d
     * @return
     */
    public static String getDecimalForFour(double d){
        return new DecimalFormat("#.####").format(d);
    }
}
