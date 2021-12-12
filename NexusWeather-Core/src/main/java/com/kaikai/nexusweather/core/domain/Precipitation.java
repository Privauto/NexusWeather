package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:33
 * @Description : 降水
 */
@Data
@Builder
public class Precipitation {
    /**
     * 最近降水带数据
     */
    Nearest nearest;
    /**
     * 本地降水数据
     */
    Local local;
}
