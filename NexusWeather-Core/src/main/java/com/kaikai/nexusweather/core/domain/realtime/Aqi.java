package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:15
 * @Description : Aqi
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aqi {
    /**
     * 国标
     */
    @JSONField(name="chn")
    int chn;
    /**
     * 美标
     */
    @JSONField(name="usa")
    int usa;
}
