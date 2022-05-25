package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * @author kaikai
 * @createTime 2021年12月15日 16:39
 * @Description : 天级预报接口
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Daily {
    /**
     * 天级预报接口获取状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 日出与日落时刻
     */
    @JSONField(name="astro")
    ArrayList<DailyAstroDateValue> astro;
    /**
     * 天气状态
     */
    @JSONField(name="skycon")
    ArrayList<DateValueSkycon> skycon;
    /**
     * 温度，最大值，平均值，最小值
     */
    @JSONField(name="temperature")
    ArrayList<DateValueThree> temperature;
    /**
     * 降雨量，最大值，平均值，最小值
     */
    @JSONField(name="precipitation")
    ArrayList<DateValueThree> precipitation;
    /**
     * 气压，最大值，平均值，最小值
     */
    @JSONField(name="pressure")
    ArrayList<DateValueThree> pressure;
    /**
     * 风力与风向，最大值，平均值，最小值
     */
    @JSONField(name="wind")
    ArrayList<DailyWindDateValueThree> wind;
    /**
     * 云量，最大值，平均值，最小值
     */
    @JSONField(name="cloudrate")
    ArrayList<DateValueThree> cloudrate;
    /**
     * 相对湿度，最大值，平均值，最小值
     */
    @JSONField(name="humidity")
    ArrayList<DateValueThree> humidity;
    /**
     * 短波辐射下向通量，最大值，平均值，最小值
     */
    @JSONField(name="dswrf")
    ArrayList<DateValueThree> dswrf;
    /**
     * 能见度，最大值，平均值，最小值
     */
    @JSONField(name="visibility")
    ArrayList<DateValueThree> visibility;
    /**
     * 空气质量
     */
    @JSONField(name="air_quality")
    DailyAirQuality air_quality;
    /**
     * 生活指数
     */
    @JSONField(name="life_index")
    DailyLifeIndex life_index;
}
