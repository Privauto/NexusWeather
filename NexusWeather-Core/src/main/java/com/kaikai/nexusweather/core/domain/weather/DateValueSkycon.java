package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author kaikai
 * @createTime 2021年12月15日 16:00
 * @Description : 带时间戳的值
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DateValueSkycon {
    /**
     * 时间戳
     */
    @JSONField(name="datetime")
    Date datetime;
    /**
     * 值
     */
    @JSONField(name="value")
    String value;
}
