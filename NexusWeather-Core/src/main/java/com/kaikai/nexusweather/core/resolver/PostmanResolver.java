package com.kaikai.nexusweather.core.resolver;

import com.kaikai.nexusweather.core.domain.test.Postman;
import com.kaikai.nexusweather.core.domain.test.Sex;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

/**
 * @author kaikai
 * @createTime 2021年12月11日 17:08
 * @Description :
 */
@Component
public class PostmanResolver implements GraphQLQueryResolver {
    public Postman postman(int id,int age,String name){
        Postman postman = new Postman(1,22,"kaikai", Sex.man);
        System.out.println(id+" "+age+" "+name);
        return postman;
    }
}
