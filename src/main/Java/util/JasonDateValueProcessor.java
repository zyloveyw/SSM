package util;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


//将日期转化使之能在easyUI的datagrid中正常显示
public class JasonDateValueProcessor implements  JsonValueProcessor {
    private  String format = "yyyy-MM-dd";

    public JasonDateValueProcessor(){
        super();
    }

    public  JasonDateValueProcessor(String format){
        super();
        this.format = format;
    }

    @Override
    public  Object processArrayValue(Object paramString, JsonConfig paramJsonConfig){
        return  process(paramObject);
    }

    @Override
    public  Object processObjectValue(String paramString, Object paramObject, JsonConfig paramJsonConfig){
        return  process(paramObject);
    }

    private  Object process(Object value){
        if(value instanceof Date ){
            SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.CHINA);
            return  sdf.format(value);
        }
        return  value == null ? "" : value.toString();
    }
}
