package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:36
 * @Description : 附近降水
 */
@Data
@Builder
public class Nearest {
    /**
     * 本地降水数据获取状态
     */
    String status;
    /**
     * 最近的降水带距离
     */
    Double distance;
    /**
     * 最近的降水带降水强度（单位为雷达降水强度）
     */
    Double intensity;
}
