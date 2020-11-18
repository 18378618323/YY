package com.yao;

import com.yao.pojo.User;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	//克隆
//        User user = new User();
//        User user1 = user;
//        System.out.println(user==user1);

//        System.out.println(Calendar.YEAR+","+Calendar.MONTH+","+Calendar.DAY_OF_MONTH
//                +","+Calendar.HOUR_OF_DAY+","+Calendar.MONTH+","+Calendar.SECOND);

        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime.getYear()+","+dateTime.getMonthValue()+","+
//                dateTime.getDayOfMonth()+","+dateTime.getHour()+
//                ","+dateTime.getMinute()+","+dateTime.getSecond());
//        Calendar.getInstance().getTimeInMillis();
//        System.currentTimeMillis();
//        Clock.systemDefaultZone().millis();
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        System.out.println(dateTime+","+now+","+now1);
	    
	System.out.println("这是我张三修改的代码，pull吧！！！");


        
    }
}
