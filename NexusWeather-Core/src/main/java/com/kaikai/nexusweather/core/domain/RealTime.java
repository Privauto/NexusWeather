package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:09
 * @Description : 实时天气数据
 */
@Data
@Builder
public class RealTime {
    /**
     * 实况模块返回状态
     */
    String status;
    /**
     * 温度
     */
    Float temperature;
    /**
     * 体感温度
     */
    Float apparent_temperature;
    /**
     * 气压
     */
    Float pressure;
    /**
     * 相对湿度
     */
    Float humidity;
    /**
     * 风
     */
    Wind wind;
    /**
     * 降水
     */
    Precipitation precipitation;
    /**
     * 云量
     */
    Float cloudrate;
    /**
     * 向下短波辐射通量
     */
    Float dswrf;
    /**
     * 能见度
     */
    Float visibility;
    /**
     * 主要天气现象
     */
    String skycon;
    /**
     * 生活指数
     */
    LifeIndex lifeIndex;


}
