package day09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());//毫秒值
        //System.out.println(date.getHours());
        //日列类
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR)
        +"年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(5)+ "日 "
                + c.get(Calendar.HOUR_OF_DAY) + ":"+ c.get(Calendar.MINUTE) + ":" +  c.get(Calendar.SECOND));
        System.out.println("----------------------");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");//可以保证不重复性，数据库存了一堆文件/或者订单的命名。时间戳
        System.out.println(df.format(new Date()));

    }
}
