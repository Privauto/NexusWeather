package com.kaikai.nexusweather.core.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:20
 * @Description : 空气质量描述
 */
@Data
@Builder
public class Description {
    /**
     * 国标
     */
    String chn;
    /**
     * 美标
     */
    String usa;
}
