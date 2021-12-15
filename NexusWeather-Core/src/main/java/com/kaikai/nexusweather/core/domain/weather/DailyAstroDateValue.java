package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author kaikai
 * @createTime 2021年12月15日 16:55
 * @Description : 带日期的日出日落时间
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyAstroDateValue {
    /**
     * 时间戳
     */
    @JSONField(name="datetime")
    Date datetime;
    /**
     * 日出时间
     */
    @JSONField(name="sunrise")
    DailyTime sunrise;
    /**
     * 日落时间
     */
    @JSONField(name="sunset")
    DailyTime sunset;
}
