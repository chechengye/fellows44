package day09;

import day09.utils.DecimalFormatUtil;

import java.text.DecimalFormat;

/**
 * 操作保留位数
 */
public class DecimalFormatDemo {
    public static void main(String[] args) {
        double pi = 3.1415926;
        DecimalFormat df = new DecimalFormat("#");
        System.out.println(df.format(pi));
        //取两位小数
        System.out.println(new DecimalFormat("#.##").format(pi));
        //取四位小数
        System.out.println(new DecimalFormat("0.0000").format(pi));
        //取六位小数
        System.out.println(new DecimalFormat("0.000000").format(pi));

        System.out.println("---------计算金额保留位数-----------");
        System.out.println(DecimalFormatUtil.getDecimalForTwo(653.13243));

    }
}
