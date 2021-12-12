package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:09
 * @Description :
 */
@Data
@Builder
public class AirQuality {
    /**
     * pm25，质量浓度值
     */
    int pm25;
    /**
     * pm10，质量浓度值
     */
    int pm10;
    /**
     * 臭氧，质量浓度值
     */
    int o3;
    /**
     * 二氧化氮，质量浓度值
     */
    int no2;
    /**
     * 二氧化硫，质量浓度值
     */
    int so2;
    /**
     * 一氧化碳，质量浓度值
     */
    int co;
    /**
     * 空气质量
     */
    Aqi aqi;
}
