package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:01
 * @Description : 生活指数
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LifeIndex {
    /**
     * 舒适度
     */
    @JSONField(name="comfort")
    Comfort comfort;
    /**
     * 紫外线指数
     */
    @JSONField(name="ultraviolet")
    Ultraviolet ultraviolet;
}
