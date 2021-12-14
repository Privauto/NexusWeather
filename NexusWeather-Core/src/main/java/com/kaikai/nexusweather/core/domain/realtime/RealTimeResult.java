package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月14日 02:17
 * @Description : 实况天气Api返回结果
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealTimeResult {
    /**
     * 实况天气
     */
    @JSONField(name="realtime")
    RealTime realTime;
}
