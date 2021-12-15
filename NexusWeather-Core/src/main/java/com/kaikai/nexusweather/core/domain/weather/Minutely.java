package com.kaikai.nexusweather.core.domain.weather;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

/**
 * @author kaikai
 * @createTime 2021年12月15日 14:55
 * @Description : 分钟级降雨预报
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Minutely {
    /**
     * 数据获取状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 预报依据的数据源
     */
    @JSONField(name="datasource")
    String datasource;
    /**
     * 预报的自然语言描述
     */
    @JSONField(name="description")
    String description;
    /**
     * 降雨概率
     * 0.0~0.5 小时间的降雨概率
     * 0.5~1.0 小时间的降雨概率
     * 1.0~1.5 小时间的降雨概率
     * 1.5~2.0 小时间的降雨概率
     */
    @JSONField(name="probability")
    ArrayList<Double> probability;
    /**
     * 预报的分钟级别的降雨强度 00~60 分钟
     * 第 0 分钟的预报值
     * 共 60 个数据项
     */
    @JSONField(name="precipitation")
    ArrayList<Double> precipitation;
    /**
     * 预报的分钟级别的降雨强度 000~120 分钟
     * 第 0 分钟的预报值
     * 共 120 个数据项
     */
    @JSONField(name="precipitation_2h")
    ArrayList<Double> precipitation_2h;
}
