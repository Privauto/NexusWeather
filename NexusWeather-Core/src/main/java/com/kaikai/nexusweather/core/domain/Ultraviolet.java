package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:05
 * @Description : 紫外线指数
 */
@Data
@Builder
public class Ultraviolet {
    /**
     * 紫外线指数
     */
    int index;
    /**
     * 对应的自然语言描述
     */
    String desc;
}
