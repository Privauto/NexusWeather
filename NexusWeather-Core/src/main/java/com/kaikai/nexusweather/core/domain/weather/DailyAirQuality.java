package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * @author kaikai
 * @createTime 2021年12月15日 17:11
 * @Description : 空气质量
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyAirQuality {
    /**
     * AQI，最大值，平均值，最小值
     */
    @JSONField(name="aqi")
    ArrayList<DailyAqiDateValueThree> aqi;
    /**
     * PM25，最大值，平均值，最小值
     */
    @JSONField(name="pm25")
    ArrayList<DateValueThree> pm25;
}
