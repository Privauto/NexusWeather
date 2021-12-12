package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:01
 * @Description : 生活指数
 */
@Data
@Builder
public class LifeIndex {
    /**
     * 舒适度
     */
    Comfort comfort;
    /**
     * 紫外线指数
     */
    Ultraviolet ultraviolet;
}
