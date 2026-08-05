package com.cdac.auth.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.cdac.auth.dto.UserAuthDto;

@Component
public class MasterDataClient {

    private final RestClient restClient;

    public MasterDataClient(
            RestClient.Builder builder,
            @Value("${master-data-service.url}") String masterDataUrl) {

        this.restClient = builder
                .baseUrl(masterDataUrl)
                .build();
    }

    public UserAuthDto getUserForAuthentication(String empId) {

        return restClient
                .get()
                .uri("/internal/users/{empId}", empId)
                .retrieve()
                .body(UserAuthDto.class);
    }
}