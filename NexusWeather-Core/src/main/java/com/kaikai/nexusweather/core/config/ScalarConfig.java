package com.kaikai.nexusweather.core.config;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kaikai
 * @createTime 2021年12月16日 16:00
 * @Description : 拓展标量配置类
 */
@Configuration
public class ScalarConfig {
    @Bean
    public GraphQLScalarType DateTime(){
        return ExtendedScalars.DateTime;
    }
}
