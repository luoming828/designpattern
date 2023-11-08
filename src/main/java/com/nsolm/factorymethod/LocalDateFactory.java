package com.nsolm.factorymethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 15:37
 */
public class LocalDateFactory {

    public static LocalDate fromInt(int yyyyMMdd) {
        LocalDate.of(yyyyMMdd / 10000,yyyyMMdd /100 % 10,yyyyMMdd % 100);
        return LocalDate.parse(String.valueOf(yyyyMMdd), DateTimeFormatter.ofPattern("yyyyMMdd"));
    }
}
