package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:26
 * @Description : 风
 */
@Data
@Builder
public class Wind {
    /**
     * 风向，单位是度。正北方向为0度，顺时针增加到360度。
     */
    Float direction;
    /**
     * 风速，米制下是公里每小时
     */
    Double speed;
}
