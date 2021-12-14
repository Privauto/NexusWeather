package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:38
 * @Description : 本地降水
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Local {
    /**
     * 本地降水数据获取状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 本地降水强度（单位为雷达降水强度）
     */
    @JSONField(name="intensity")
    Double intensity;
    /**
     * 本地降水观测的数据源（radar，GFS）
     */
    @JSONField(name="datasource")
    String datasource;
}
