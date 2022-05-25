package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:33
 * @Description : 降水
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Precipitation {
    /**
     * 最近降水带数据
     */
    @JSONField(name="nearest")
    Nearest nearest;
    /**
     * 本地降水数据
     */
    @JSONField(name="local")
    Local local;
}
