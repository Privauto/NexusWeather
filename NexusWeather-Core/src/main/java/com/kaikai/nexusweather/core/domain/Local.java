package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:38
 * @Description : 本地降水
 */
@Data
@Builder
public class Local {

    /**
     * 本地降水数据获取状态
     */
    String status;
    /**
     * 本地降水强度（单位为雷达降水强度）
     */
    Double intensity;
    /**
     * 本地降水观测的数据源（radar，GFS）
     */
    String datasource;
}
