package com.kaikai.nexusweather.core.resolver;

import com.kaikai.nexusweather.core.domain.test.Postman;
import com.kaikai.nexusweather.core.domain.test.Sex;
import graphql.kickstart.tools.GraphQLQueryResolver;

/**
 * @author kaikai
 * @createTime 2021年12月11日 17:08
 * @Description :
 */
public class PostmanResolver implements GraphQLQueryResolver {
    public Postman postman(int id){
        Postman postman = new Postman(1,"kaikai", Sex.man);
        return postman;
    }
}
