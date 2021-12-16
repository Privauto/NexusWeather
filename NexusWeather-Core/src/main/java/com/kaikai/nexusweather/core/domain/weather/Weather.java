package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import com.kaikai.nexusweather.core.domain.realtime.RealTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月15日 14:48
 * @Description : 天气预报接口返回结果
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
    /**
     * 实时天气
     */
    @JSONField(name="realtime")
    RealTime realtime;
    /**
     * 分钟级预报接口
     */
    @JSONField(name="minutely")
    Minutely minutely;
    /**
     * 小时级预报接口
     */
    @JSONField(name="hourly")
    Hourly hourly;
    /**
     * 天级预报接口
     */
    @JSONField(name="daily")
    Daily daily;
    /**
     * primary
     */
    @JSONField(name="primary")
    int primary;
    /**
     * 天气简报
     */
    @JSONField(name="forecast_keypoint")
    String forecast_keypoint;
}
