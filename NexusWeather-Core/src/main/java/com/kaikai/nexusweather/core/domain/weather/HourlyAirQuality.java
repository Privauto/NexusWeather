package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:09
 * @Description : 空气质量预报
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HourlyAirQuality {
    /**
     * pm25，质量浓度值
     */
    @JSONField(name="pm25")
    ArrayList<DateValue> pm25;
    /**
     * aqi
     */
    @JSONField(name="aqi")
    ArrayList<HourlyAqiDateValue> aqi;
}
