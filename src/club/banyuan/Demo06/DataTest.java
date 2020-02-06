package club.banyuan.Demo06;


import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


public class DataTest {
    public static void main(String[] args) throws ParseException {
        Date nowtime=new Date();
        String time="2020-02-06 18:00:00";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date endtime= sdf.parse(time);
        long starttime =nowtime.getTime();
        long endTime=endtime.getTime();
        long timer=endTime-starttime;
        long seconds=timer/1000;
        long second=seconds%60;
        long minute=seconds/60%60;
        long hour=seconds/60/60%24;
        long day=seconds/60/60/24%31;
        System.out.println("倒计时还有:"+day+"天"+hour+"小时"+minute+"分钟"+second+"秒");
        //余下的分钟数

    }

}
