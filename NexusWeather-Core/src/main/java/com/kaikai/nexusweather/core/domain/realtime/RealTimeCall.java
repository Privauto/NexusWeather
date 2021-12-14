package com.kaikai.nexusweather.core.domain.realtime;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kaikai
 * @createTime 2021年12月14日 02:23
 * @Description : 实况天气返回体
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealTimeCall {

    /**
     * 状态
     */
    @JSONField(name="status")
    String status;
    /**
     * 版本号
     */
    @JSONField(name="api_version")
    String api_version;
    /**
     * 版本号状态
     */
    @JSONField(name="api_status")
    String api_status;
    /**
     * 语言
     */
    @JSONField(name="lang")
    String lang;
    /**
     * 单位制
     */
    @JSONField(name="unit")
    String unit;
    /**
     * 经纬度
     */
    @JSONField(name="location")
    String location;
    /**
     * 服务器本次返回的utc时间戳
     */
    @JSONField(name="server_time")
    Integer server_time;
    /**
     * 时区的偏移秒数，如东八区就是 28800 秒
     */
    @JSONField(name="tzshift")
    Integer tzshift;
    /**
     * 实况天气Api返回结果
     */
    @JSONField(name="result")
    RealTimeResult realTimeResult;
}
