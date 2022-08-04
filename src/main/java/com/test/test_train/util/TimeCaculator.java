package com.test.test_train.util;

import cn.hutool.core.date.*;

public class TimeCaculator {
    public static String jianTime(String a,String b){
        DateTime parse1 = DateUtil.parse(a);
        DateTime parse2 = DateUtil.parse(b);
        return DateUtil.formatBetween(parse1,parse2,BetweenFormatter.Level.MINUTE);
    }
}
