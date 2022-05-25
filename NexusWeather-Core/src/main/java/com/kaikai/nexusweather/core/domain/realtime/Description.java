package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:20
 * @Description : 空气质量描述
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Description {
    /**
     * 国标
     */
    @JSONField(name="chn")
    String chn;
    /**
     * 美标
     */
    @JSONField(name="usa")
    String usa;
}
