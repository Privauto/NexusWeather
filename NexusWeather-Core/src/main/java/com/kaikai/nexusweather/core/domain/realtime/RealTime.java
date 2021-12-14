package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:09
 * @Description : 实时天气数据
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealTime {
    /**
     * 实况模块返回状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 温度
     */
    @JSONField(name="temperature")
    Float temperature;
    /**
     * 体感温度
     */
    @JSONField(name="apparent_temperature")
    Float apparent_temperature;
    /**
     * 气压
     */
    @JSONField(name="pressure")
    Double pressure;
    /**
     * 相对湿度
     */
    @JSONField(name="humidity")
    Float humidity;
    /**
     * 风
     */
    @JSONField(name="wind")
    Wind wind;
    /**
     * 降水
     */
    @JSONField(name="precipitation")
    Precipitation precipitation;
    /**
     * 云量
     */
    @JSONField(name="cloudrate")
    Double cloudrate;
    /**
     * 向下短波辐射通量
     */
    @JSONField(name="dswrf")
    Double dswrf;
    /**
     * 能见度
     */
    @JSONField(name="visibility")
    Double visibility;
    /**
     * 主要天气现象
     */
    @JSONField(name="skycon")
    String skycon;
    /**
     * 生活指数
     */
    @JSONField(name="life_index")
    LifeIndex lifeIndex;
    /**
     * 空气质量
     */
    @JSONField(name="air_quality")
    AirQuality airQuality;
}
