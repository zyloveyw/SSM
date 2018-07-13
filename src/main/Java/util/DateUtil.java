package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//返回格式化的当前日期
public class DateUtil {
    public static Date getDate() throws ParseException{
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        return  sdf.parse(sdf.format(date));
    }
}
