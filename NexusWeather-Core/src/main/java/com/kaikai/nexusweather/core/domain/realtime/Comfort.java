package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:02
 * @Description : 舒适度
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comfort {
    /**
     * 舒适度指数
     */
    @JSONField(name="index")
    int index;
    /**
     * 对应的自然语言描述
     */
    @JSONField(name="desc")
    String desc;
}
