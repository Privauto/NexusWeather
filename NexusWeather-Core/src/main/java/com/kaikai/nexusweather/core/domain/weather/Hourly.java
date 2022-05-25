package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * @author kaikai
 * @createTime 2021年12月15日 15:58
 * @Description : 小时级预报接口
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Hourly {
    /**
     * 小时级预报接口请求状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 预报的自然语言表述
     */
    @JSONField(name="description")
    String description;
    /**
     * 天气状态
     */
    @JSONField(name="skycon")
    ArrayList<DateValueSkycon> skycon;
    /**
     * 温度
     */
    @JSONField(name="temperature")
    ArrayList<DateValue> temperature;
    /**
     * 降雨
     */
    @JSONField(name="precipitation")
    ArrayList<DateValue> precipitation;
    /**
     * 云量
     */
    @JSONField(name="cloudrate")
    ArrayList<DateValue> cloudrate;
    /**
     * 相对湿度
     */
    @JSONField(name="humidity")
    ArrayList<DateValue> humidity;
    /**
     * 气压
     */
    @JSONField(name="pressure")
    ArrayList<DateValue> pressure;
    /**
     * 风力、风向
     */
    @JSONField(name="wind")
    ArrayList<HourlyWindDateValue> wind;
    /**
     * 能见度
     */
    @JSONField(name="visibility")
    ArrayList<DateValue> visibility;
    /**
     * 短波辐射下向通量
     */
    @JSONField(name="dswrf")
    ArrayList<DateValue> dswrf;
    /**
     * 空气指标
     */
    @JSONField(name="air_quality")
    HourlyAirQuality air_quality;
}
