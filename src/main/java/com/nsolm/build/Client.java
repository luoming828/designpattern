package com.nsolm.build;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:30
 */
public class Client {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("q","高德地图");
        map.put("PC","U316");
        map.put("FORM","CHROMN");
        String http = URLBuilder.builder().setProtocol("https://")
                .setDomain("www.baidu.com")
                .setPath("/search")
                .setParam(map).build();
        System.out.println(http);
    }
}
