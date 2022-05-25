package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:36
 * @Description : 附近降水
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Nearest {
    /**
     * 本地降水数据获取状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 最近的降水带距离
     */
    @JSONField(name="distance")
    Double distance;
    /**
     * 最近的降水带降水强度（单位为雷达降水强度）
     */
    @JSONField(name="intensity")
    Double intensity;
}
