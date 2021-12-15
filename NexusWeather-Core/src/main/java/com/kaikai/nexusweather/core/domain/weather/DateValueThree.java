package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

/**
 * @author kaikai
 * @createTime 2021年12月15日 16:50
 * @Description : 带时间戳的平均值最大最小值
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DateValueThree {
    /**
     * 时间戳
     */
    @JSONField(name="datetime")
    Date datetime;
    /**
     * 平均值
     */
    @JSONField(name="avg")
    Double avg;
    /**
     * 最大值
     */
    @JSONField(name="max")
    Double max;
    /**
     * 最小值
     */
    @JSONField(name="min")
    Double min;
}
