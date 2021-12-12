package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:02
 * @Description : 舒适度
 */
@Data
@Builder
public class Comfort {
    /**
     * 舒适度指数
     */
    int index;
    /**
     * 对应的自然语言描述
     */
    String desc;
}
