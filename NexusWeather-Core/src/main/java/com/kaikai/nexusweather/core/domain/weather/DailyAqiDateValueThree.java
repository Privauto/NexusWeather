package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import com.kaikai.nexusweather.core.domain.realtime.Aqi;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;

/**
 * @author kaikai
 * @createTime 2021年12月15日 17:05
 * @Description : AQI，最大值，平均值，最小值
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyAqiDateValueThree {
    /**
     * 日期时间
     */
    @JSONField(name="datetime")
    OffsetDateTime datetime;
    /**
     * AQI平均值
     */
    @JSONField(name="avg")
    Aqi avg;
    /**
     * AQI最大值
     */
    @JSONField(name="max")
    Aqi max;
    /**
     * AQI最小值
     */
    @JSONField(name="min")
    Aqi min;
}
