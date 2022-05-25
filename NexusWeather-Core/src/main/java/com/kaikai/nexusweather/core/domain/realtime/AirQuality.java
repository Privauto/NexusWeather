package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:09
 * @Description : 空气质量
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirQuality {
    /**
     * pm25，质量浓度值
     */
    @JSONField(name="pm25")
    int pm25;
    /**
     * pm10，质量浓度值
     */
    @JSONField(name="pm10")
    int pm10;
    /**
     * 臭氧，质量浓度值
     */
    @JSONField(name="o3")
    int o3;
    /**
     * 二氧化氮，质量浓度值
     */
    @JSONField(name="no2")
    int no2;
    /**
     * 二氧化硫，质量浓度值
     */
    @JSONField(name="so2")
    int so2;
    /**
     * 一氧化碳，质量浓度值
     */
    @JSONField(name="co")
    int co;
    /**
     * 空气质量
     */
    @JSONField(name="aqi")
    Aqi aqi;
    /**
     * 描述
     */
    @JSONField(name="description")
    Description description;
}
