package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 21:26
 * @Description : 风
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Wind {
    /**
     * 风向，单位是度。正北方向为0度，顺时针增加到360度。
     */
    @JSONField(name="direction")
    Float direction;
    /**
     * 风速，米制下是公里每小时
     */
    @JSONField(name="speed")
    Double speed;
}
