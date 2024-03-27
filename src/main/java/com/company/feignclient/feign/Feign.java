package com.company.feignclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "flights", url = "https://flight-radar1.p.rapidapi.com/airports/list")
public interface Feign {



        @GetMapping
        String searchBook(@RequestHeader("X-RapidAPI-Host") String apiHostHeader,
                          @RequestHeader("X-RapidAPI-Key") String apiKeyHeader);
    }

