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
 * @createTime 2021年12月15日 16:13
 * @Description : 带时间戳的aqi值
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HourlyAqiDateValue {
    /**
     * 日期时间
     */
    @JSONField(name="datetime")
    OffsetDateTime datetime;
    /**
     * aqi
     */
    @JSONField(name="value")
    Aqi value;
}
