package com.kaikai.nexusweather.core.resolver;

import com.alibaba.fastjson.JSON;
import com.kaikai.nexusweather.core.bean.Constant;
import com.kaikai.nexusweather.core.domain.realtime.RealTime;
import com.kaikai.nexusweather.core.domain.realtime.RealTimeCall;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author kaikai
 * @createTime 2021年12月12日 22:23
 * @Description :
 */
@Component
public class RealTimeResolver implements GraphQLQueryResolver {

    HttpClient httpClient = HttpClient.newHttpClient();
    HttpResponse.BodyHandler<String> stringBodyHandler = HttpResponse.BodyHandlers.ofString();

    public RealTime realTime(Float longitude,Float latitude) throws ExecutionException, InterruptedException {
        String url = Constant.baseurl+"/"+Constant.version+"/"+Constant.token+"/"+longitude+","+latitude+"/realtime.json";
        HttpRequest request = HttpRequest.newBuilder(URI.create(url)).build();
        CompletableFuture<HttpResponse<String>> future = httpClient.sendAsync(request, stringBodyHandler);
        RealTimeCall realTimeCall = JSON.parseObject(future.get().body(), RealTimeCall.class);
        return realTimeCall.getRealTimeResult().getRealTime();
    }
}
