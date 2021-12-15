package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * @author kaikai
 * @createTime 2021年12月15日 17:20
 * @Description : 生活指数
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyLifeIndex {
    /**
     * 洗车指数
     */
    @JSONField(name="carWashing")
    ArrayList<DateDesc> carWashing;
    /**
     * 感冒指数
     */
    @JSONField(name="coldRisk")
    ArrayList<DateDesc> coldRisk;
    /**
     * 舒适度指数
     */
    @JSONField(name="comfort")
    ArrayList<DateDesc> comfort;
    /**
     * 穿衣指数
     */
    @JSONField(name="dressing")
    ArrayList<DateDesc> dressing;
    /**
     * 紫外线指数
     */
    @JSONField(name="ultraviolet")
    ArrayList<DateDesc> ultraviolet;
}
