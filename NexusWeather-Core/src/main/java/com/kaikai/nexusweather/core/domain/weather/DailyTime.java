package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月15日 17:00
 * @Description :
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyTime {
    /**
     * 时间
     */
    @JSONField(name="time")
    String time;
}
