package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:15
 * @Description : Aqi
 */
@Data
@Builder
public class Aqi {
    /**
     * 国标
     */
    int chn;
    /**
     * 美标
     */
    int usa;
}
