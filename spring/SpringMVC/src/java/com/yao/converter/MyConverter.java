package com.yao.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 转换器：实现转换器接口（Converter<Object,object></>）
 * 此转换器是把前端传过来的字符串转化为时间类型
 * 在spring框架中还要在SpringMVC配置文件中配置自定义转换器
 */
public class MyConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
