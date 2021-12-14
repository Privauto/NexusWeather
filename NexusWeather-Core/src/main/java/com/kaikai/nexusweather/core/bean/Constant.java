package com.kaikai.nexusweather.core.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author kaikai
 * @createTime 2021年12月14日 00:08
 * @Description : 全局变量及常量
 */
@Component
public class Constant {

    public static String version;
    public static String token;
    public static String baseurl;
    @Value("${caiyun.version}")
    public void setVersion(String version){
        Constant.version=version;
    }
    @Value("${caiyun.token}")
    public void setToken(String token){
        Constant.token=token;
    }
    @Value("${caiyun.baseurl}")
    public void setBaseurl(String baseurl){
        Constant.baseurl=baseurl;
    }
}
