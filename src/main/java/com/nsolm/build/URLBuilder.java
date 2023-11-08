package com.nsolm.build;

import java.util.Map;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/8 17:22
 */
public class URLBuilder {

    private String domain;

    private String protocol;

    private String path;

    private String param;

    public static URLBuilder builder(){
        return new URLBuilder();
    }

    public String getDomain() {
        return domain;
    }

    public URLBuilder setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public URLBuilder setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getPath() {
        return path;
    }

    public URLBuilder setPath(String path) {
        this.path = path;
        return this;
    }

    public String getParam() {
        return param;
    }

    public URLBuilder setParam(String param) {
        this.param = param;
        return this;
    }

    public URLBuilder setParam(Map<String,Object> paramMap){
        StringBuilder sb = new StringBuilder("?");
        paramMap.forEach((k,v) -> {
            sb.append(k).append("=").append(v).append("&");
        });
        String s = sb.toString();
        this.param = s.substring(0,s.length()-1);
        return this;
    }

    public String build(){
        return this.protocol + this.domain + this.path + this.param;
    }
}
