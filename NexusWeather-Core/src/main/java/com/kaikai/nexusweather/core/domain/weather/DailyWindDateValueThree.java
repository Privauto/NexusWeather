package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import com.kaikai.nexusweather.core.domain.realtime.Wind;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;

/**
 * @author kaikai
 * @createTime 2021年12月15日 17:05
 * @Description : 带时间戳的风力与风向，最大值，平均值，最小值
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyWindDateValueThree {
    /**
     * 日期时间
     */
    @JSONField(name="datetime")
    OffsetDateTime datetime;
    /**
     * 风力与风向的平均值
     */
    @JSONField(name="avg")
    Wind avg;
    /**
     * 风力与风向的最大值
     */
    @JSONField(name="max")
    Wind max;
    /**
     * 风力与风向的最小值
     */
    @JSONField(name="min")
    Wind min;
}
